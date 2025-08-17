package Observer;


import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    int longitude;
    int latitude;
    int temperature;
    List<IObserver> observers;
    public WeatherStation(int longitude,int latitude,int temperature){
        this.longitude=longitude;
        this.latitude=latitude;
        this.temperature=temperature;
        observers=new ArrayList<>();
    }
    @Override
    public void add(IObserver observer){
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int temperature) {
        this.temperature=temperature;
        for(IObserver observer:observers){
            observer.update();
        }
    }

}
