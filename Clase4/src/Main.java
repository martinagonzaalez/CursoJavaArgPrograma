public class Main {
    public static void main(String[] args) {
        Producto jabonEnPolvo = new Producto("Jabón en polvo", 40);
        Producto esponjas = new Producto("Esponjas", 10);
        Producto chocolates = new Producto("Chocolates", 100);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(jabonEnPolvo);
        carrito.agregarProducto(esponjas);
        carrito.agregarProducto(chocolates);

        System.out.println(carrito.precio());
    }
}