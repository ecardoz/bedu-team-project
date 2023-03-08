public class MermeladaDecorator implements Helado {

    private Helado helado;

    public MermeladaDecorator(Helado helado) {
        this.helado = helado;
    }


    public String getDescription() {
        return helado.getDescription() + ", Mermelada Extra";
    }

    public int getPrice() {
        return helado.getPrice() + 10;
    }
}