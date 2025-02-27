package java;

import java.util.List;

public class Appliance {

    int id;
    String name;
    String reference;
    int wattage;

    public Appliance(int id, String name, int wattage, String reference){
        this.id = id;
        this.name = name;
        this.wattage = wattage;
        this.reference = reference;
    }

    public String getName() {
        return name;
    }
}
