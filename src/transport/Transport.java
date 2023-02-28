package transport;

import drivers.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanics> mechanicsList;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanics> mechanicsList) {
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanicsList = mechanicsList;
    }

    public List<Mechanics> getMechanicsList() {
        return mechanicsList;
    }

    public void setMechanicsList(List<Mechanics> mechanicsList) {
        this.mechanicsList = mechanicsList;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
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

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    @Override
    public String toString() {
        return brand + " " + model +
                ", объем двигателя: " + engineVolume +
                ", " + driver.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && driver.equals(transport.driver) && mechanicsList.equals(transport.mechanicsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanicsList);
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract Type getType();

    public abstract void printType();

    public abstract void goDiagnosed() throws TransportTypeException;

    public abstract boolean checkAbilityToGoInspection();

}
