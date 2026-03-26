package constructores.mavenproject1;

public class Producto 
{
    String nombre;
    double precio;
    int cantidad;

    public Producto() 
    {
        nombre = "Sin nombre";
        precio = 0;
        cantidad = 0;
    }

    public Producto(String nombre, double precio) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    public Producto(String nombre, double precio, int cantidad) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void mostrar() 
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("\n");
    }
}