package isp.lab4.exercise3;

public class TemperatureSensor {
    private int value;
    private String location;

    public TemperatureSensor() {
        value = 10;
        location ="Bathroom";
    }

    public TemperatureSensor(int value, String location) {
        this.value = value;
        this.location = location;
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    

    @Override
    public String toString() {
        return "TemperatureSensor{" + "value=" + value + ", location=" + location + '}';
    }
    
    
    
}
