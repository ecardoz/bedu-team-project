public class ToppingDecorator implements Helado {

    private Helado helado;

    public ToppingDecorator(Helado helado) {
        this.helado = helado;
    }

    public String getDescription() {
        return helado.getDescription() + ",Topping Extra";
    }

    public int getPrice() {
        return helado.getPrice() + 20;
    }
}