public class Laptop extends Device{
    double memory;
    double screen_res;
    double battery;

    public Laptop(String type, double price, double weight, double m, double screen, double b){
        super(type, price, weight);
        this.memory = m;
        this.screen_res = screen;
        this.battery = b;
    }
}
