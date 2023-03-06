public class HeladoDecoratorPattern {
    public static void main(String[] args) {
        Helado helado = new HeladoSuave();
        
        helado = new Galleta(helado);
        helado = new Topping(helado); 
        helado = new Mermelada(helado);
        System.out.println("Tu orden: "+helado.getDesc());
        System.out.println("Total: "+helado.getPrice());
        System.out.println("Gracias por tu preferencia");
    }    
}