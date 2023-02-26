package drivers;

import java.util.Objects;

public class BusDriver extends Driver {
    private final String CategoryOfDrivingLicence = "D";

    public BusDriver(String nameDriver, boolean drivingLicence, int experience) {
        super(nameDriver, drivingLicence, experience);
    }
}
