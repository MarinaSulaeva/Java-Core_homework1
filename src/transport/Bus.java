package transport;

import drivers.BusDriver;

import java.util.List;
import java.util.Objects;

public class Bus extends Transport<BusDriver> {
    private final Capacity capacity;
    private static final Type TYPE = Type.BUS;

    public Bus(String brand, String model, double engineVolume, BusDriver driver, List<Mechanics> mechanicsList, Capacity capacity) {
        super(brand, model, engineVolume, driver, mechanicsList);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return TYPE + " " + super.toString() + ", " + capacity.toString();
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

    @Override
    public Type getType() {
        return TYPE;
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacity);
        }
    }

    @Override
    public void goDiagnosed() throws TransportTypeException {
        throw new TransportTypeException("Автобусы проходить диагностику не должны");
    }

    @Override
    public boolean checkAbilityToGoInspection() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity);
    }
}
