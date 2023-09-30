public class Device {
    String type;

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    double price, weight;

    public Device(String t, double p, double w){
        this.type = t;
        this.price = p;
        this.weight = w;
    }
}
