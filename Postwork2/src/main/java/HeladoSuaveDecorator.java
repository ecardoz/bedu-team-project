public abstract class HeladoSuaveDecorator implements Helado{
    @Override
    public String getDesc(){
        return "Tus extras: ";
    }
}