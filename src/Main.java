import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car carLada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механическая", null, "к282ок", 5, true, null, 250);
        Car carAudi = new Car("Audi", "A8 50 l TDI quattro", 3.0, "черный", 2020, "Германия", "автоматическая", "седан", "л286км", 5, false, new Car.Key(true, true), 200);
        Car carBMW = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "", "", "", 0, false, new Car.Key(true, false), 0);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механическая", "купе", "", 8, true, null, 300);
        Car carHyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автоматическая", "хэтчбек", "л386аг", 6, true, new Car.Key(true, false), 310);
        Car car = new Car("", "", 0, "", 0, "", "", "", "", -2, false, null, 19);
        System.out.println(carHyundai);
        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(car);
        carLada.changeTires(8);
        System.out.println(carLada);
        carHyundai.changeTires(2);
        Bus Gas = new Bus("ГАЗ", "Газель next A64R42", 2015, "Россия", "серый", 130);
        Bus Toyota = new Bus("Toyota", "Coaster", 2012, "Япония", "синий", 130);
        Bus Isusu = new Bus("Isusu", "A-09216", 2016, "Япония", "белый", 0);
        System.out.println(Gas);
        System.out.println(Toyota);
        System.out.println(Isusu);


    }

}