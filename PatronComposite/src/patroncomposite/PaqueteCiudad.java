package patroncomposite;

import java.util.ArrayList;
import java.util.List;

public class PaqueteCiudad implements PaqueteTuristico 
{
    private String nombre;
    private List<PaqueteTuristico> elementos = new ArrayList<>();

    public PaqueteCiudad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (PaqueteTuristico elemento : elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal;
    }

    @Override
    public int getDuracion() {
        int duracionTotal = 0;
        for (PaqueteTuristico elemento : elementos) {
            duracionTotal += elemento.getDuracion();
        }
        return duracionTotal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Destino Turistico : " + nombre);
        for (PaqueteTuristico elemento : elementos) {
            elemento.mostrarDetalles();
        }
    }

    public void agregarElemento(PaqueteTuristico elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(PaqueteTuristico elemento) {
        elementos.remove(elemento);
    }
}
