package vehiculo;

/**
 * Clase Vehiculo con Métodos y Constructores
 *
 * @author IES Aguadulce
 */
public class VehiculoSalazarSoriaSergio2223 {

    /**
     * Método para obtener el nombre
     *
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna el nombre por defecto.
     *
     * @param nombre nombre que asigna
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el precio
     *
     * @return devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para fijar el precio
     *
     * @param precio the precio que se fija
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para obtener el precio con IVA
     *
     * @return devuelve el precio con IVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método para fijar el precio con IVA
     *
     * @param precioIVA fija el precio con IVA
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método para obtener el stock
     *
     * @return devuelve el stock que hay
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método para fijar el stock
     *
     * @param stock fija el stock que hay
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor sin argumentos
     */
    public VehiculoSalazarSoriaSergio2223() {
    }

    /**
     * Constructor con parámetro para iniciar todas las propiedades de la clase
     *
     * @param nom nombre del vehículo
     * @param precio precio del vehículo
     * @param stock stock de vehículos
     */
    public VehiculoSalazarSoriaSergio2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método para asignar el nombre del vehiculo
     *
     * @param nom asigna un nombre
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método para obtener el nombre del vehiculo
     *
     * @return nombre del vehiculo
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que devuelve el stock de vehiculos disponible en cada momento
     *
     * @return devuelve el stock
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Método para comprar vehiculos.Modifica el stock.Este método va a ser
     * probado con Junit
     *
     * @param cantidad cantidad que es comprada
     * @throws java.lang.Exception
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehiculos.Modifica el stock.Este método va a ser
     * probado con Junit
     *
     * @param cantidad cantidad que es vendida
     * @throws java.lang.Exception
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        setStock(getStock() - cantidad);
    }

}
