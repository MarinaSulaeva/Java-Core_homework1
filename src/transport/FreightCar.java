package transport;

import drivers.FreightCarDriver;

import java.util.List;
import java.util.Objects;

public class FreightCar extends Transport<FreightCarDriver> {
    private final CarryingCapacity carryingCapacity;
    private static final Type TYPE = Type.FREIGHTCAR;

    public FreightCar(String brand, String model, double engineVolume, FreightCarDriver driver, List<Mechanics> mechanicsList, CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.carryingCapacity = carryingCapacity;
    }

    public CarryingCapacity getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String toString() {
        return TYPE + " " + super.toString() + ", " + carryingCapacity.toString();
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

    @Override
    public void goDiagnosed() {
        System.out.println("Грузовому автомобилю " + getBrand() + " " + getModel() + " необходимо пройти диагностику");
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
        FreightCar that = (FreightCar) o;
        return carryingCapacity == that.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carryingCapacity);
    }
}
