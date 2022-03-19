package isp.lab4.exercise3;


public class Controller {
    private FireAlarm alarm;
    private TemperatureSensor sensor;

    public Controller(FireAlarm alarm, TemperatureSensor sensor) {
        this.alarm = alarm;
        this.sensor = sensor;
    }
    
    public void controlStep(){
        if(sensor.getValue()>50){
            alarm.setActive(true);
        }else{
            alarm.setActive(false);
        }
        System.out.println(alarm+"\n"+sensor);
    }
    
    
}
