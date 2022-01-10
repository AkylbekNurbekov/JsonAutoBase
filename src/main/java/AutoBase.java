public class AutoBase {
    private int id ;
    private String nameAuto;
    private Driver driver;
    private String state;

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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public static AutoBase autoBaseMethod(int id, String nameAuto, Driver driver, String state){
        AutoBase autoBase = new AutoBase();
        autoBase.id = id;
        autoBase.nameAuto = nameAuto;
//        autoBase.driver = driver;
        autoBase.state = state;
        return autoBase;
    }
}
