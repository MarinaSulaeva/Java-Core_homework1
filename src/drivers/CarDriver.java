package drivers;

public class CarDriver extends Driver {
    private String CategoryOfDrivingLicence;

    public CarDriver(String nameDriver, boolean drivingLicence, int experience) {
        super(nameDriver, drivingLicence, experience);
        CategoryOfDrivingLicence = "B";
    }
}
