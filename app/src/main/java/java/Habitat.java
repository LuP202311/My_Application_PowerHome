package java;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
    int id;
    String residentName;
    int floor;
    double area;
    List<Appliance> appliances;

    public Habitat(int id, String residentName, int floor, double area, List<Appliance> appliances){
        this.id = id;
        this.residentName = residentName;
        this.floor = floor;
        this.area = area;
        this.appliances = appliances;
    }

    public int getId() {
        return id;
    }

    public String getResidentName() {
        return residentName;
    }

    public int getFloor() {
        return floor;
    }

    public double getArea() {
        return area;
    }

    public int getTotalAppliances() {
        return appliances.size();
    }

    public Appliance getAppliance(int i){
        if (i>appliances.size()){
            return null;
        }
        return appliances.get(i);
    }
//    public List<Appliance> getAppliances() {
//
//    }
    
}
