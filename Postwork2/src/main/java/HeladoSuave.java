public class HeladoSuave implements Helado{
    @Override
    public String getDesc(){
        return "Helado suave $30";
    }
    
    @Override 
    public double getPrice(){
        return 30;
    }
}