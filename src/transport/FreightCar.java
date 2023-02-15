package transport;

import drivers.FreightCarDriver;

public class FreightCar extends Transport<FreightCarDriver> {
    private final CarryingCapacity carryingCapacity;
    private static final Type TYPE = Type.FREIGHTCAR;

    public FreightCar(String brand, String model, double engineVolume, FreightCarDriver driver, CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume, driver);
        this.carryingCapacity = carryingCapacity;
    }

    public CarryingCapacity getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String toString() {
        return TYPE + super.toString() + ", " + carryingCapacity.toString();
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп. Проверьте исправность машины и колес.");
    }

    @Override
    public void calculateBestTimeForCircle() {
        double time = Math.random() * 5 + 2;
        System.out.println("Лучшее время за круг составило " + time + " минут");
    }

    @Override
    public void calculateMaxSpeed() {
        double maxSpeed = Math.random() * 40 + 50;
        System.out.println("Максимальная скорость составила " + maxSpeed + " км/час");
    }

    @Override
    public void startMovement() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMovement() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public Type getType() {
        return TYPE;
    }

    @Override
    public void printType() {
        if (carryingCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(carryingCapacity);
        }

    }

}
