public class Application {

    public static void main(String[] args) {
        HeladoSuave heladoSuave = new HeladoSuave(30);
        CoberturaDecorator heladoConCobertura = new CoberturaDecorator(heladoSuave);
        GranolaDecorator heladoConGranola = new GranolaDecorator(heladoConCobertura);
        ToppingDecorator heladoConTopping = new ToppingDecorator(heladoConGranola);
        MermeladaDecorator heladoConMermelada = new MermeladaDecorator(heladoConTopping);
        GalletaDecorator heladoConGalleta = new GalletaDecorator(heladoConMermelada);
        Integer precio = heladoConGalleta.getPrecio();
        System.out.println("El precio final del helado es de: $" + precio);
    }

}