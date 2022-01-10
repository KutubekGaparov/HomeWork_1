
public class Autobaza {
    private  int id;
    private  String nameAuto;
    private String driver;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Autobaza makeCar(int id, String nameAuto, String driver, String type) {
        Autobaza car = new Autobaza();
        car.id = id;
        car.nameAuto = nameAuto;
        car.driver = driver;
        car.type = type;

        return car;
    }

    @Override
    public String toString() {
        return
                id + "  |  " + nameAuto + "  |     " + driver + "      |  " + type;
    }
}
