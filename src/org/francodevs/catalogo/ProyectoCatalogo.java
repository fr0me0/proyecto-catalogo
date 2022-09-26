package org.francodevs.catalogo;

public class ProyectoCatalogo {

    public static void main(String[] args) {

        IProducto[] productos = new Producto[4];
        productos[0] = new Libro(500, "JK Rowling", "Harry Potter y las Reliquias de la Muerte", "Scholastic");
        productos[1] = new Comic(300, "Varios", "Crisis en Tierras Infinitas", "DC Comics", "Heroes de DC");
        productos[2] = new TvLcd(90000, 43);
        productos[3] = new IPhone(120000, "Apple", "Plateado", "IPhone 12");

        for (IProducto producto : productos) {

            System.out.print(producto.getClass().getSimpleName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            if (producto instanceof IElectronico) {
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((IElectronico) producto).getFabricante());

                if (producto instanceof IPhone) {
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone) producto).getColor());
                }

                if (producto instanceof TvLcd) {
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd) producto).getPulgadas());
                }
            }

            if (producto instanceof ILibro) {
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                if (producto instanceof Comic) {
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comic) producto).getPersonaje());
                }

            }

            System.out.println();

        }

    }

}
