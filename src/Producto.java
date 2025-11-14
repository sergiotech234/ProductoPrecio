public class Producto {
    private double precio;

    public Producto(double precioInicial) {
        this.precio = precioInicial;
    }
    public double getPrecio() {
        return precio;
    }
    public void actualizarPrecio(double nuevoPrecio) throws PrecioInvalidoException {
        if (nuevoPrecio < 0) {
            throw new PrecioInvalidoException("Precio negativo");
        }
        this.precio = nuevoPrecio;
    }
}
