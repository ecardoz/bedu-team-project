public class Topping extends IceCreamExtras{
    private final IceCream iceCream;

    public Topping(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getPrice() {
        return iceCream.getPrice() + 20;
    }

    @Override
    public String getDescr() {
        return iceCream.getDescr() + " Topping (20)";
    }
}
