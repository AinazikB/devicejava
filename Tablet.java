public class Tablet extends Device{
    double screen_size;
    int battery;
    double memory;

    public Tablet(String type, double price, double weight, double s, int b, double m){
        super(type, price, weight);
        this.screen_size = s;
        this.battery = b;
        this.memory = m;
    }
}
