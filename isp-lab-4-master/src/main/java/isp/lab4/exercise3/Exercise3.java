package isp.lab4.exercise3;



public class Exercise3 {
    public static void main(String[] args) {
        FireAlarm alarm = new FireAlarm(false);
        TemperatureSensor tsensor = new TemperatureSensor(55,"Kitchen");
        
        Controller c1 = new Controller(alarm,tsensor);
        
        c1.controlStep();
        tsensor.setValue(20);
        c1.controlStep();
    }
}
