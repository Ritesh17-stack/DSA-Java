package OOPS.Practice.Inheritence;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        this.price = 0;
    }

    public BoxPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);
        this.price = price;
    }
}
