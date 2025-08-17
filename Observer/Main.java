package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation(10,10,30);
        PhoneDisplay phoneDisplay1=new PhoneDisplay(5,4,weatherStation);
        MonitorDisplay monitorDisplay1=new MonitorDisplay(4,weatherStation);
        weatherStation.add(phoneDisplay1);
        weatherStation.add(monitorDisplay1);
        phoneDisplay1.display();
        monitorDisplay1.display();
        weatherStation.notifyObservers(35);
        phoneDisplay1.display();
        monitorDisplay1.display();
    }


}
