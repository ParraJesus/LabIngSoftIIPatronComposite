package patroncomposite;

public class PatronComposite 
{

    public static void main(String[] args) {
        // Crear una estructura jerárquica de paquetes turísticos
        PaqueteTuristico europa = new PaqueteCiudad("Europa");
        PaqueteTuristico madrid = new PaqueteCiudad("Madrid");
        
        PaqueteTuristico vueloMadrid = new ElementoCiudad("Vuelo a Madrid", 500, 5);
        PaqueteTuristico hotelMadrid = new ElementoCiudad("Hotel en Madrid", 600, 4);
        
        PaqueteTuristico cityTourMadrid = new CityTour("CT01", "City Tour en Madrid", "Tour histórico por Madrid", "No olvides tu cámara", 3, 75.0);

        ((PaqueteCiudad)madrid).agregarElemento(vueloMadrid);
        ((PaqueteCiudad)madrid).agregarElemento(hotelMadrid);
        ((PaqueteCiudad)madrid).agregarElemento(cityTourMadrid);

        ((PaqueteCiudad)europa).agregarElemento(madrid);

        // Mostrar detalles de la estructura
        System.out.println("Detalles del viaje a Europa:");
        europa.mostrarDetalles();
        System.out.println("Precio total: $" + europa.getPrecio());
        System.out.println("Duración total: " + europa.getDuracion() + " días");
    }
    
}
