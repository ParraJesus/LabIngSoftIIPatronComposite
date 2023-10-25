package patroncomposite;

public class CityTour implements PaqueteTuristico 
{
    private String identificador;
    private String nombre;
    private String descripcion;
    private String recomendaciones;
    private int duracion;
    private double precio;

    public CityTour(String identificador, String nombre, String descripcion, String recomendaciones, int duracion, double precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.recomendaciones = recomendaciones;
        this.duracion = duracion;
        this.precio = precio;
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
        System.out.println("City Tour: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Recomendaciones: " + recomendaciones);
    }
}

