package transport;

public class Mechanics {
    private String nameAndSurname;
    private String company;

    public Mechanics(String nameAndSurname, String company) {
        this.nameAndSurname = nameAndSurname;
        this.company = company;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " + nameAndSurname +
                ", компания " + company;
    }

    public void fixTransport() {
        System.out.println("Транспорт успешно починен");
    }

    public void carryOutMaintenance() {
        System.out.println("Проведено техобслуживание транспорта");
    }
}
