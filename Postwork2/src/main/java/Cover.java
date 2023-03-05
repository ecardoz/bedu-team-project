public class Cover extends IceCreamExtras {

    private final IceCream iceCream;

    public Cover(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public double getPrice() {
        return iceCream.getPrice() + 20;
    }

    @Override
    public String getDescr() {
        return iceCream.getDescr() + " Cobertura (20)";
    }
}
