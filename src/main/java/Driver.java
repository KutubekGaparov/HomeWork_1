
public class Driver {
    private int id;

    private String driver;
    private String bus;

    public Driver() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getBus() {
        return bus;
    }

    public void setbus(String status) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "DriverInfo{" +
                "id=" + id +
                ", driver='" + driver + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}