package transport;

import drivers.BusDriver;

public class Bus extends Transport<BusDriver> {
    public Bus(String brand, String model, double engineVolume, BusDriver driver) {
        super(brand, model, engineVolume, driver);
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
        double maxSpeed = Math.random() * 40 + 80;
        System.out.println("Максимальная скорость составила " + maxSpeed + " км/час");
    }

    @Override
    public void startMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }
}
