
public abstract class Beverage {
    public abstract void placeOrder();
    public boolean carbonated;
    boolean outOfStock;
    double unitSize;
    int quantity;

    public static void main(String[] args) {
        Root_Beer rb = new Root_Beer();
        Pepsi ps = new Pepsi();
        Mr_Pibb mp = new Mr_Pibb();
        Orange or = new Orange();
        Dr_Pepper dp = new Dr_Pepper();
        Diet_Coke dc = new Diet_Coke();
        Sprite sp = new Sprite();

        rb.placeOrder();
        ps.placeOrder();
        mp.placeOrder();
        or.placeOrder();
        dp.placeOrder();
        dc.placeOrder();
        sp.placeOrder();
    }

}

