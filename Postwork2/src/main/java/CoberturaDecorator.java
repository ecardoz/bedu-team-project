public class CoberturaDecorator implements Helado {
    private Helado helado;
    public CoberturaDecorator(Helado helado) {
        this.helado = helado;
    }
    public String getDescription() {
        return helado.getDescription() + ", Cobertura extra";
    }
    public int getPrice() {
        return helado.getPrice() + 20;
    }
}