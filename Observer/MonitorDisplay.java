package Observer;

public class MonitorDisplay implements IObserver{
    int size;
    WeatherStation weatherStation;
    int temperature;
    public MonitorDisplay(int size,WeatherStation weatherStation){
        this.size=size;
        this.weatherStation=weatherStation;
        this.temperature=weatherStation.temperature;
    }

    @Override
    public void update() {
        this.temperature=weatherStation.temperature;
    }
    public void display(){
        System.out.println("Displaying from monitior temperature is "+this.temperature);
    }
}

