package tSmirnova_hW05_all.CallBack;

public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer(new ShowTimer());

        while (true) {
            timer.timeRemain();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}