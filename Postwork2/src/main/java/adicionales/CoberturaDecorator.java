public class CoberturaDecorator extends HeladoDecorator {

    public CoberturaDecorator(Helado helado) {
        super(helado);
    }

    @Override
    public Integer getPrecio() {
        return helado.getPrecio() + 20;
    }
}