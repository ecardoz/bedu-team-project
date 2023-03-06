public class Mermelada  extends HeladoSuaveDecorator{
    private final Helado helado;

    public Mermelada(Helado helado){
        this.helado = helado;
    }

    @Override
    public String getDesc(){
        return helado.getDesc()+", mas Mermelada $10";
    }

    @Override
    public double getPrice(){
        return helado.getPrice()+10;
    }
}

