package org.francodevs.catalogo;

public class Comic extends Libro {

    private String personaje;

    public Comic(int precio, String autor, String titulo, String editorial, String personaje) {
        super(precio, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return  getPrecio() + getPrecio() * 0.8;
    }

}
