public class MermeladaDecorator extends HeladoDecorator {

    public MermeladaDecorator(Helado helado) {
        super(helado);
    }

    @Override
    public Integer getPrecio() {
        return helado.getPrecio() + 10;
    }
}