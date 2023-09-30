public class Smartphone extends Device{
    double screen_size;
    double camera_resolution;

    public Smartphone(String type, double price, double weight, double size, double res){
        super(type, price, weight);
        this.screen_size = size;
        this.camera_resolution = res;
    }
}
