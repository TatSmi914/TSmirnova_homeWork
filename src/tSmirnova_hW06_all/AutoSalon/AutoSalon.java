package tSmirnova_hW06_all.AutoSalon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AutoSalon {

    int counter;

    private Map<Integer, Car> cars = new HashMap<>();

    {
        cars.put(++counter, new Car("BMW", "X6", 89000));
        cars.put(++counter, new Car("Reno", "Duster", 35000));
        cars.put(++counter, new Car("Reno", "Arkana", 78000));
        cars.put(++counter, new Car("Reno", "Kaptur", 89000));
        cars.put(++counter, new Car("Reno", "Koleos", 92000));
        cars.put(++counter, new Car("Mercedes-Benz", "GLE Coupe", 134000));
        cars.put(++counter, new Car("ŠKODA", "KODIAQ", 139000));
        cars.put(++counter, new Car("BMW", "Z4", 156000));
        cars.put(++counter, new Car("BMW", "X6", 181000));
        cars.put(++counter, new Car("ŠKODA", "Octavia", 115000));
    }

    public void allCarTypes() {
        for (Map.Entry<Integer, Car> type : cars.entrySet()) {
            System.out.println(type.getKey() + " - " + type.getValue());
        }
    }

    public Car concreteCarInfo(int id) throws Exception {
        Car result = cars.get(id);

        if (result == null) {
            throw new Exception("\nSorry, but there is no such car in our AutoSalon any more");
        } else {
            return result;
        }
    }

    public void addCar(String carModel, String carBrand, Integer price) {
        cars.put(++counter, new Car(carModel, carBrand, price));
    }

    public void startWork() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMake Your choice : " +
                "\n1.Add new car : MODEL, BRAND and PRICE " +
                "\n2.Get information about chosen car " +
                "\n3.Buy a car " +
                "\n4.Get list of all cars in AutoSalon " +
                "\n5.Leave AutoSalon ");
        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    boolean isValid = true;
                    System.out.println("Please, enter MODEL of the CAR : ");
                    String carModel = scanner.next();
                    System.out.println("Please, enter BRAND of the CAR : ");
                    String carBrand = scanner.next();
                    while (isValid) {
                        try {
                            System.out.println("Please, enter PRICE of the CAR : ");
                            Integer price = Integer.parseInt(scanner.next());
                            addCar(carModel, carBrand, price);
                            isValid = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Please, enter correct value!");
                        }
                    }
                    startWork();
                    break;

                case 2:
                    System.out.println("Please, set number of selected CAR : ");
                    int id = scanner.nextInt();
                    try {
                        Car car = concreteCarInfo(id);
                        System.out.println(car.toString());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        startWork();
                    }
                    break;
                case 3:
                    System.out.println("Please, set number of selected CAR : ");
                    int idCar = scanner.nextInt();
                    try {
                        Car car = concreteCarInfo(idCar);
                        System.out.println("Thank You for Your choice!");
                        cars.remove(idCar);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        startWork();
                    }
                    break;
                case 4:
                    allCarTypes();
                    startWork();
                    break;
                case 5:
                    System.out.println("Good-bye! We will be happy to see You in our AutoSalon again!");
            }
        }
    }
}
