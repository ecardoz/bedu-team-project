public class Application {
    public static void main(String[] args) {
        IceCream iceCream = new IceCreamSoft();

        //Helado sencillo
        System.out.println("Helado Sencillo");
        System.out.println("Descr: " + iceCream.getDescr());
        System.out.println("Price: " + iceCream.getPrice());

        //Algunos extras
        System.out.println("Con algunos extras");
        iceCream = new Cookie(iceCream);
        iceCream = new Cover(iceCream);
        System.out.println("Descr: " + iceCream.getDescr());
        System.out.println("Price: " + iceCream.getPrice());

        //Todos los extras
        System.out.println("Todos los extras");
        iceCream = new IceCreamSoft();
        iceCream = new Cookie(iceCream);
        iceCream = new Cover(iceCream);
        iceCream = new Granola(iceCream);
        iceCream = new Jam(iceCream);
        iceCream = new Topping(iceCream);
        System.out.println("Descr: " + iceCream.getDescr());
        System.out.println("Price: " + iceCream.getPrice());


    }
}
