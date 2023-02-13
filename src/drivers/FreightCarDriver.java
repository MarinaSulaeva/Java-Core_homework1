package drivers;

public class FreightCarDriver extends Driver {
    private String CategoryOfDrivingLicence;

    public FreightCarDriver(String nameDriver, boolean drivingLicence, int experience) {
        super(nameDriver, drivingLicence, experience);
        CategoryOfDrivingLicence = "C";
    }
}
