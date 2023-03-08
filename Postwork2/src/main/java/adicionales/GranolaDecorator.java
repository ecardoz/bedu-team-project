public class GranolaDecorator extends HeladoDecorator {

    public GranolaDecorator(Helado helado) {
        super(helado);
    }

    @Override
    public Integer getPrecio() {
        return helado.getPrecio() + 10;
    }
}