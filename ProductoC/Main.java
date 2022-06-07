package ProductoC;

public class Main {
    public static void main(String[] args) {
        ProductoControlador productoControlador = new ProductoControlador(3);
        //System.out.println(productoControlador);


        productoControlador.crear(157753, "leche ",3.60);
        productoControlador.crear(523734, "fideos",2.70);
        productoControlador.crear(964657, "atun  ",5.00);

        productoControlador.listar();

        System.out.println("---------Buscar Cliente----------");

        int codigo = 523734;
        Producto encontrado;


        encontrado = productoControlador.buscar(codigo);

        if (encontrado != null)
        {
            System.out.println("Codigo: "+encontrado.getCodigo()+"  Nombre: "+encontrado.getNombre()+"  Precio: s/."+encontrado.getPrecio());
        }
        else {
            System.out.println("No se encontro el codigo "+codigo);
        }
    }
}
