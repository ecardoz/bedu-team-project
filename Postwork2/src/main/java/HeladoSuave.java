public class HeladoSuave implements Helado {
    private Integer precio;

    public HeladoSuave(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }
}