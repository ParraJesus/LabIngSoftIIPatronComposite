package patroncomposite;

public class ElementoCiudad implements PaqueteTuristico 
{
    private String nombre;
    private double precio;
    private int duracion;

    public ElementoCiudad(String nombre, double precio, int duracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Elemento del Paquete Turistico : " + nombre);
    }
}
