package constructores.mavenproject1;

public class MainProducto 
{
    public static void main(String[] args) 
    {
        Producto p1 = new Producto();
        Producto p2 = new Producto("Laptop", 2500);
        Producto p3 = new Producto("Mouse", 50, 10);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }
}