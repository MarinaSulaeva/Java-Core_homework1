import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car carLada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "механическая",null, "к282ок", 5, true, null);
        Car carAudi = new Car("Audi", "A8 50 l TDI quattro", 3.0, "черный", 2020, "Германия", "автоматическая", "седан", "л286км", 5, false, new Car.Key(true, true));
        Car carBMW = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "", "", "", 0, false, new Car.Key(true, false));
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "механическая", "купе", "", 8, true, null);
        Car carHyundai = new Car ("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "автоматическая", "хэтчбек", "л386аг", 6, true, new Car.Key(true, false));
        Car car = new Car("", "", 0, "", 0, "", "","","",-2,false, null);
        System.out.println(carHyundai);
        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBMW);
        System.out.println(carKia);
        System.out.println(car);
        carLada.changeTires(8);
        System.out.println(carLada);
        carHyundai.changeTires(2);


    }

}