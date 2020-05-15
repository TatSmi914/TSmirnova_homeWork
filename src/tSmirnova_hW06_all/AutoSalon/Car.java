package tSmirnova_hW06_all.AutoSalon;

public class Car {

    String carModel;
    String carBrand;
    Integer price;

    public Car(String carModel, String carBrand, Integer price) {
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car {" +
                " Model : " + carModel + '\'' +
                ", Brand : " + carBrand + '\'' +
                ", Price : " + price +
                '}';
    }
}