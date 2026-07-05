package Practic.Lesson9.Zadanie3;

public class Car {
    private int id;
    private String brand;
    private Integer probeg;
    private int year;
    private int maxSpeed;
    private double price;

    public Car(int id, String brand, Integer probeg, int year, int maxSpeed, double price) {
        this.id = id;
        this.brand = brand;
        this.probeg = probeg;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getProbeg() {
        return probeg;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProbeg(Integer probeg) {
        this.probeg = probeg;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Машина: " + id +
                " марка " + brand +
                ", пробег " + probeg +
                ", год " + year +
                ", скорость " + maxSpeed +
                ", цена " + price + "\n";
    }
}
