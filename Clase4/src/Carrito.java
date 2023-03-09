import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double precio() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecioUnitario();
        }
        return precioTotal;
    }
}