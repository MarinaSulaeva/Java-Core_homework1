package homework;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public Car() {

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model +
                ", страна сборки: " + country + ", цвет кузова: " + color +
                ", объем двигателя: " + engineVolume + " л, год выпуска: " + year;

    }
}
