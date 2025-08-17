package Observer;

public class PhoneDisplay implements IObserver{
    int length;
    int width;
    int temperature;
    WeatherStation weatherStation;
    public PhoneDisplay(int lenght,int width,WeatherStation weatherStation){
        this.length=lenght;
        this.width=width;
        this.weatherStation=weatherStation;
        this.temperature=weatherStation.temperature;
    }

    @Override
    public void update(){
        this.temperature=weatherStation.temperature;
    }
    public void display(){
        System.out.println("Hello from phone display,recent temperature: "+this.temperature);
    }
}
