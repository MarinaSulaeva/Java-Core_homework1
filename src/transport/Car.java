package transport;


import drivers.CarDriver;

import java.util.List;
import java.util.Objects;

public class Car extends Transport<CarDriver> {
    private final TypeBody bodyType;
    private static final Type TYPE = Type.CAR;

    public Car(String brand, String model, double engineVolume, CarDriver driver, List<Mechanics> mechanicsList, TypeBody bodyType) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.bodyType = bodyType;
    }

    public TypeBody getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return TYPE + " " + super.toString() + ", " + bodyType.toString();
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
        double maxSpeed = Math.random() * 40 + 120;
        System.out.println("Максимальная скорость составила " + maxSpeed + " км/час");
    }

    @Override
    public void startMovement() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMovement() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public Type getType() {
        return TYPE;
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public void goDiagnosed() {
        System.out.println("Легковому автомобилю " + getBrand() + " " + getModel() + " необходимо пройти диагностику");
    }

    @Override
    public boolean checkAbilityToGoInspection() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return bodyType == car.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType);
    }
}
