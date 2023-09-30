public class MilitaryTank implements Vehicle{

    public int milesToGo;
    public Driver driver;

    public String vehicleType;
    public int driveDistance;
    public int minimumAge;
    public boolean hasDriver = false;


    public MilitaryTank() {
        this.milesToGo = 2000;
        this.vehicleType = "Tank";
        this.driveDistance = 5;
        this.minimumAge = 25;
        System.out.println(this.vehicleType + " created. " + this.milesToGo + " miles to go!");
    }

    @Override
    public void drive() {
        if (!hasDriver) System.out.println(this.vehicleType + " didn't drive - there's no driver!");
        else {
            milesToGo -= driveDistance;
            System.out.println(vehicleType + " drove " + driveDistance +
                    " miles - " + milesToGo + " miles to go");
        }



    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.age < minimumAge) {
            System.out.println("Driver not changed! " + driver.name + " is " +
                    driver.age + ", but must be " + minimumAge +
                    " or older to drive " + vehicleType.toLowerCase());
        } else {
            this.driver = driver;
            this.hasDriver = true;
            System.out.println("Driver changed to " + this.driver.name);
        }
    }
}


