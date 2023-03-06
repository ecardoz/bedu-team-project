public class Granola  extends HeladoSuaveDecorator{
    private final Helado helado;

    public Granola(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDesc(){
        return helado.getDesc()+", mas Granola $10";
    }

    @Override
    public double getPrice(){
        return helado.getPrice()+10;
    }
}