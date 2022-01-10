public class Driver {
    private int id;
    private String name;
    private String bus;

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        if(bus.equals("")){
            this.bus = "";
        }
        else{
            this.bus = bus;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver() {
    }


    @Override
    public String toString() {
        return "id=" + id + ", name='" + name ;
    }
}
