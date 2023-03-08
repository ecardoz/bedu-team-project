public class ToppingDecorator extends HeladoDecorator {

    public ToppingDecorator(Helado helado) {
        super(helado);
    }

    @Override
    public Integer getPrecio() {
        return helado.getPrecio() + 20;
    }
}