public class Heladeria{

    public static void main(String [] args) {
        Helado suave = new HeladoSuave();

        suave = new CoberturaDecorator(suave);
        suave = new GranolaDecorator(suave);
        suave = new GalletaDecorator(suave);
        suave = new ToppingDecorator(suave);
        suave = new MermeladaDecorator(suave);

        System.out.println("[Ticket total]");
        System.out.println(suave.getDescription());
        System.out.println("$ " + suave.getPrice());
    }
}