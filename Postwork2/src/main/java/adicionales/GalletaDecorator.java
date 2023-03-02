public class GalletaDecorator extends HeladoDecorator {

    public GalletaDecorator(Helado helado) {
        super(helado);
    }

    @Override
    public Integer getPrecio() {
        return helado.getPrecio() + 15;
    }
}