package drivers;

public class BusDriver extends Driver {
    private String CategoryOfDrivingLicence;

    public BusDriver(String nameDriver, boolean drivingLicence, int experience) {
        super(nameDriver, drivingLicence, experience);
        CategoryOfDrivingLicence = "D";
    }
}
