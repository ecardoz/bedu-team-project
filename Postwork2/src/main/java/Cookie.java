public class Cookie extends IceCreamExtras{
    private final IceCream iceCream;

    public Cookie(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getPrice() {
        return iceCream.getPrice() + 15;
    }

    @Override
    public String getDescr() {
        return iceCream.getDescr() + " Galleta (15)";
    }
}
