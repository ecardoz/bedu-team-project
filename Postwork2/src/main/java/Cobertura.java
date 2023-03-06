public class Cobertura  extends HeladoSuaveDecorator{
    private final Helado helado;
    
    public Cobertura(Helado helado){
        this.helado = helado;
    }
    
    @Override 
    public String getDesc(){
        return helado.getDesc()+", mas Cobertura $20";
    }
    
    @Override 
    public double getPrice(){
        return helado.getPrice()+20;
    }
}