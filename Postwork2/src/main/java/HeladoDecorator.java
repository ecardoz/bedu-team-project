public abstract class HeladoDecorator implements Helado {
    protected Helado helado;

    public HeladoDecorator(Helado helado) {
        this.helado = helado;
    }

    @Override
    public Integer getPrecio() {
        return helado.getPrecio();
    }
}