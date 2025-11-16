public class MainProducto {
    public static void main(String[] args) {
        Producto Prod1 = new Producto(15);

        System.out.println("Precio inicial: " + Prod1.getPrecio());
        //Creamos la excepcion try y catch para que haga haga el calculo del precio actual
        try {
            Prod1.actualizarPrecio(67);
        } catch (PrecioInvalidoException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Precio actual: " + Prod1.getPrecio());
    }
}
