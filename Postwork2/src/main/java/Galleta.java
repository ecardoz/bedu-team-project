public class Galleta  extends HeladoSuaveDecorator{
    private final Helado helado;

    public Galleta(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDesc(){
        return helado.getDesc()+", mas Galleta $15";
    }

    @Override
    public double getPrice(){
        return helado.getPrice()+15;
    }
}