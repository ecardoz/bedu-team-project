public class Jam extends IceCreamExtras{
    private final IceCream iceCream;

    public Jam(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getPrice() {
        return iceCream.getPrice() + 10;
    }

    @Override
    public String getDescr() {
        return iceCream.getDescr() + " Mermelada (10)";
    }
}
