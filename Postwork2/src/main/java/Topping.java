public class Topping  extends HeladoSuaveDecorator{
    private final Helado helado;

    public Topping(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDesc(){
        return helado.getDesc()+", mas Topping $20";
    }

    @Override
    public double getPrice(){
        return helado.getPrice()+20;
    }
}