package tSmirnova_hW07_all.Zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMain {
    public static void main(String[] args) throws Exception {

        File dir = new File("D://TestDir1");
        boolean createdFolder = dir.mkdir();
        if (createdFolder)
            System.out.println("Folder has been created : " + dir);

// Создание нового файла и запись контента в нем
        String fileData1 = "Some Test1";
        FileOutputStream fos1 = new FileOutputStream("D://TestDir1//111.txt");
        fos1.write(fileData1.getBytes());
        fos1.flush();
        fos1.close();

        String fileData2 = "Some Test2";
        FileOutputStream fos2 = new FileOutputStream("D://TestDir1//222.txt");
        fos2.write(fileData2.getBytes());
        fos2.flush();
        fos2.close();

        String fileData3 = "Some Test3";
        FileOutputStream fos3 = new FileOutputStream("D://TestDir1//333.txt");
        fos3.write(fileData3.getBytes());
        fos3.flush();
        fos3.close();

        zip("D://TestDir1", "D:\\TestDirArchive\\zipTest.zip");

        File newDir = new File("D://TestDirRenamed");
        dir.renameTo(newDir);
        System.out.println("Folder has been renamed : " + newDir);

        if (newDir.isDirectory()) {
            for (File item : newDir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println("Folder contents : " + item.getName() + " \t folder");
                } else {
                    System.out.println("Folder contents : " + item.getName() + " \t file");
                }
            }
        }

        File[] files = newDir.listFiles();
        for (int i = 0; i < files.length; i++) {
            files[i].delete();
        }
        boolean deleted = newDir.delete();
        if (deleted)
            System.out.println("Folder has been deleted");
    }

    private static void zip(String source_dir, String zip_file) throws Exception {
        // Cоздание объекта ZipOutputStream из FileOutputStream
        FileOutputStream fout = new FileOutputStream(zip_file);
        ZipOutputStream zout = new ZipOutputStream(fout);

        File fileSource = new File(source_dir);

        addDirectory(zout, fileSource);
        zout.close();

        System.out.println("Zip has been created! ");
    }

    private static void addDirectory(ZipOutputStream zout, File fileSource)
            throws Exception {
        File[] files = fileSource.listFiles();
        System.out.println("Adding directory : " + fileSource.getName());
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                addDirectory(zout, files[i]);
                continue;
            }
            System.out.println("Adding file : " + files[i].getName());

            FileInputStream fis = new FileInputStream(files[i]);
            zout.putNextEntry(new ZipEntry(files[i].getPath()));

            byte[] buffer = new byte[4048];
            int length;
            while ((length = fis.read(buffer)) > 0)
                zout.write(buffer, 0, length);
            zout.closeEntry();
            fis.close();
        }
    }
}