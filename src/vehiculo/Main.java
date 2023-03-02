package vehiculo;

/**
 * Clase principal Main
 *
 * @author IES Aguadulce
 */
public class Main {

    /**
     * Método Main que realiza las llamadas a otras funciones del programa
     *
     * @param args String
     */
    public static void main(String[] args) {
        VehiculoSalazarSoriaSergio2223 miVehiculoSalazarSoriaSergio2223;
        int stockActual;

        miVehiculoSalazarSoriaSergio2223 = new VehiculoSalazarSoriaSergio2223("Seat", 18000, 100);
        operativaVehiculosSalazarSoriaSergio2223(miVehiculoSalazarSoriaSergio2223, 50);
    }

    /**
     * Método de operativa que engloba ventas, compras y estocaje.
     *
     */
    private static void operativaVehiculosSalazarSoriaSergio2223(VehiculoSalazarSoriaSergio2223 miVehiculoSalazarSoriaSergio2223, int cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoSalazarSoriaSergio2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoSalazarSoriaSergio2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoSalazarSoriaSergio2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}
