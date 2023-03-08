public class GalletaDecorator implements Helado {
    private Helado helado;
    public GalletaDecorator(Helado helado) {
        this.helado = helado;
    }
    public String getDescription() {
        return helado.getDescription() + ", Galleta extra";
    }
    public int getPrice() {
        return helado.getPrice() + 25;
    }
}