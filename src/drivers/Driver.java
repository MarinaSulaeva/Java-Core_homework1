package drivers;

import java.util.Objects;

public class Driver {
    private final String nameDriver;
    private boolean drivingLicence;
    private int experience;

    public Driver(String nameDriver, boolean drivingLicence, int experience) {
        this.nameDriver = nameDriver;
        this.drivingLicence = drivingLicence;
        this.experience = experience;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public int getExperience() {
        return experience;
    }

    public void startMoving() {
        System.out.println("Начните движение");
    }

    public void stopMoving() {
        System.out.println("Прекратите движение");
    }

    public void refuel() {
        System.out.println("Заправьте бак бензином");
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "имя водителя " + nameDriver +
                ", наличие водительского удостоверения " + drivingLicence +
                ", стаж " + experience +
                " лет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicence == driver.drivingLicence && experience == driver.experience && nameDriver.equals(driver.nameDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDriver, drivingLicence, experience);
    }
}
