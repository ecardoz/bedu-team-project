public class Granola extends IceCreamExtras{
    private final IceCream iceCream;

    public Granola(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getPrice() {
        return iceCream.getPrice() + 10;
    }

    @Override
    public String getDescr() {
        return iceCream.getDescr() + " Granola (10)";
    }
}
