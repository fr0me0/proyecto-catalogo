package org.francodevs.catalogo;

public class TvLcd extends Producto {

    private int pulgadas;

    public TvLcd(int precio, int pulgadas) {
        super(precio);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return  getPrecio() + getPrecio() * 0.8;
    }

}
