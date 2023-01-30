import homework.Car;

public class Main {
    public static void main(String[] args) {
        Car carLada1 = new Car();
        Car carAudi1 = new Car();
        Car carBMW1 = new Car();
        Car carKia1 = new Car();
        Car carHyundai1 = new Car();
        carLada1.setBrand("Lada");
        carLada1.setModel("Granta");
        carLada1.setColor("желтый");
        carLada1.setEngineVolume(1.7);
        carLada1.setYear(2015);
        carLada1.setCountry("Россия");
        carAudi1.setBrand("Audi");
        carAudi1.setModel("A8 50 l TDI quattro");
        carAudi1.setColor("черный");
        carAudi1.setCountry("Германия");
        carAudi1.setYear(2020);
        carAudi1.setEngineVolume(3.0);
        carBMW1.setBrand("BMW");
        carBMW1.setModel("Z8");
        carBMW1.setColor("черный");
        carBMW1.setYear(2021);
        carBMW1.setEngineVolume(3.0);
        carBMW1.setCountry("Германия");
        carKia1.setBrand("Kia");
        carKia1.setModel("Sportage 4-го поколения");
        carKia1.setColor("красный");
        carKia1.setYear(2018);
        carKia1.setEngineVolume(2.4);
        carKia1.setCountry("Южная Корея");
        carHyundai1.setBrand("Hyundai");
        carHyundai1.setModel("Avante");
        carHyundai1.setColor("оранжевый");
        carHyundai1.setYear(2016);
        carHyundai1.setEngineVolume(1.6);
        carHyundai1.setCountry("Южная Корея");
        System.out.println(carHyundai1);
        System.out.println(carBMW1);
        System.out.println(carAudi1);
        System.out.println(carKia1);
        System.out.println(carLada1);
        System.out.println("=================");
        Car carLada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car carAudi = new Car("Audi", "A8 50 l TDI quattro", 3.0, "черный", 2020, "Германия");
        Car carBMW = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car carHyundai = new Car ("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        Car car = new Car("", "", 0, "", 0, "");
        System.out.println(carHyundai);
        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(car);

    }

}