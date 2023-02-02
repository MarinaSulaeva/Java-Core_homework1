package transport;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String typeCarcass;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterRubber;
    private Key key;

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setTransmission(String transmission) {
        this.transmission = (Objects.isNull(transmission) || transmission.isEmpty()) ? "default" : transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (Objects.isNull(registrationNumber) || registrationNumber.isEmpty()) ? "a000aa" : registrationNumber;
    }

    public void setWinterRubber(boolean winterRubber) {
        this.winterRubber = winterRubber;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTypeCarcass() {
        return typeCarcass;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterRubber() {
        return winterRubber;
    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String typeCarcass, String registrationNumber, int numberOfSeats, boolean winterRubber, Key key) {
        this.brand = (Objects.isNull(brand) || brand.isEmpty()) ? "default" : brand;
        this.model = (Objects.isNull(model) || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = (year <= 0) ? 2000 : year;
        this.country = (Objects.isNull(country) || country.isEmpty()) ? "default" : country;
        setTransmission(transmission);
        this.typeCarcass = (Objects.isNull(typeCarcass) || typeCarcass.isEmpty()) ? "default" : typeCarcass;
        setRegistrationNumber(registrationNumber);
        this.numberOfSeats = (numberOfSeats <= 0) ? 5 : numberOfSeats;
        this.winterRubber = winterRubber;
        setKey(key);

    }


    public void changeTires(int month) {
        if (winterRubber && month >= 4 && month < 10) {
            winterRubber = false;
            System.out.println("Поменяли резину на шинах"); }
        else if (!winterRubber && (month < 4 || month >= 10)) {
            winterRubber = true;
            System.out.println("Поменяли резину на шинах");
        } else {
            System.out.println("Резину на шинах менять пока не нужно");
        }
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public void setColor(String color) {
        this.color = (Objects.isNull(color) || color.isEmpty()) ? "default" : color;
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
        String s = (winterRubber) ? "зимняя" : "летняя";
        return "Автомобиль " + brand + " " + model +
                ", страна сборки: " + country + ", цвет кузова: " + color +
                ", объем двигателя: " + engineVolume + " л, год выпуска: " + year +
                ", коробка передач: " + transmission + ", тип кузова: " + typeCarcass +
                ", регистрационный номер " + registrationNumber + ", количество мест в автомобиле: " +
                numberOfSeats + ", " + s + " резина на колесах, " + key;

    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? "удаленный запуск двигателя, " : "нет удаленного запуска двигателя, ") +
                    (keylessEntry ? " бесключевой доступ" : " бесключевой доступ отсутствует");
        }
    }
}
