import java.util.ArrayList;
import java.util.List;

interface IObservable{
    void add(IObserve obj);
    void remove(IObserve obj);
    void inform();

    int getTemp();

}

interface IObserve{
    void update();
}

interface IDisplay{
    void display();
}

class WeatherStation implements IObservable{
    private List<IObserve> subscribers=new ArrayList<>();
    int temp;
    WeatherStation(int temp){
        this.temp=temp;
    }
    @Override
    public void add(IObserve obj){
        subscribers.add(obj);
    }

    @Override
    public void remove(IObserve obj) {
        subscribers.remove(obj);
    }

    @Override
    public void inform() {
        for(IObserve obj:subscribers){
            obj.update();
        }
    }
    @Override
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp=temp;
    }

}

class PhoneDisplay implements IObserve,IDisplay{

    IObservable obj;
    int temp;
    PhoneDisplay(IObservable obj){
        this.obj=obj;
    }
    @Override
    public void update() {
        this.temp=obj.getTemp();
    }

    @Override
    public void display() {
        System.out.println("PhoneDisplay temp is "+temp);
    }
}

class WindowDisplay implements IObserve,IDisplay{
    IObservable obj;
    int temp;
    WindowDisplay(IObservable obj){
        this.obj=obj;
    }
    @Override
    public void update() {
        this.temp=obj.getTemp();
    }

    @Override
    public void display() {
        System.out.println("WindowDisplay temp is "+temp);
    }
}
public class observerPattern {
    public static void main(String[] args) {
        WeatherStation station=new WeatherStation(30);
        PhoneDisplay phone=new PhoneDisplay(station);
        WindowDisplay window=new WindowDisplay(station);
        System.out.println(phone.temp);
        System.out.println(window.temp);

        //now adding them as subs
        station.add(phone);
        station.add(window);
        System.out.println(phone.temp);
        System.out.println(window.temp);

        //now some change occurs
        station.setTemp(25);
        station.inform();
        System.out.println(phone.temp);
        System.out.println(window.temp);

    }
}
