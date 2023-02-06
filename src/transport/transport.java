package transport;

public class transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;

    public transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        this.year = (year <= 0) ? 2000 : year;
        this.country = (country == null || country.isEmpty()) ? "default" : country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? "белый" : color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = (maxSpeed <= 60) ? 60.0 : maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + model +
                ", страна сборки: " + country + ", цвет кузова: " + color +
                ", год выпуска: " + year +
                ", максимальная скорость автомобиля: " + maxSpeed + " км/час";
    }
}
