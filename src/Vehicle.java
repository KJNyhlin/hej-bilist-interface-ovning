public interface Vehicle {
    public int milesToGo = 0;
    public Driver driver = null;

    public String vehicleType = null;
    public int driveDistance = 0;
    public int minimumAge = 0;
    public boolean hasDriver = false;


    //System.out.println(this.vehicleType + " created. " + this.milesToGo + " miles to go!");





    public void drive();

    void setDriver(Driver driver);
}


