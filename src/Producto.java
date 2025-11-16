//Creamos la clase producto el cual tiene una variable de numeros con dos decimales con un private para los siguientes metodos 
public class Producto {
    private double precio;
//Despues creamos un constructor en el cual tenemos que crear una nuava variable
    public Producto(double precioInicial) {
        this.precio = precioInicial;
    }
    public double getPrecio() {
        return precio;
    }
    //Creamos un metodo que se llame actualizarPrecio, creamos una nueva varible que se llame nuevoprecio e introducimos una excepcion throws 
    //lo que va hacer es que el usuario pueda introduccir otro precio
    public void actualizarPrecio(double nuevoPrecio) throws PrecioInvalidoException {
        if (nuevoPrecio < 0) {
            throw new PrecioInvalidoException("Precio negativo");
        }
        this.precio = nuevoPrecio;
    }
}
