public class GranolaDecorator implements Helado {
    private Helado helado;
    public GranolaDecorator(Helado helado) {
        this.helado = helado;
    }
    public String getDescription() {
        return helado.getDescription() + ", Granola Extra";
    }
    public int getPrice() {
        return helado.getPrice() + 10;
    }
}