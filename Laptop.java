public class Laptop extends Device{
    int memory;
    double screen_res;
    int battery;

    public Laptop(String type, double price, double weight, int m, double screen, int b){
        super(type, price, weight);
        this.memory = m;
        this.screen_res = screen;
        this.battery = b;
    }
}
