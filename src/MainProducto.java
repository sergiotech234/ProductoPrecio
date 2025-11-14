//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainProducto {
    public static void main(String[] args) {
        Producto Prod1 = new Producto(15);

        System.out.println("Precio inicial: " + Prod1.getPrecio());
        try {
            Prod1.actualizarPrecio(67);
        } catch (PrecioInvalidoException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Precio actual: " + Prod1.getPrecio());
    }
}