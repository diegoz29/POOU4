/*
 se crea java class factura para hacer uso de interfaces
 */
package POL;

/**
 *
 * @author DIEGO VARGAS1
 */
public class Factura {

    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
//se crea constructor

    public Factura(String pieza, String descripcion, int cuenta, double precio) {
        numeroPieza = pieza;
        descripcionPieza = descripcion;
        //se llaman metodos
        establecerCantidad(cuenta);
        establecerPrecioPorArticulo(precio);

    }
//se desarrolla metodos get/set para el resto de las variables

    public void establecerNumeroPieza(String pieza) {
        numeroPieza = pieza;

    }

    public String obtenerNumeroPieza() {
        return numeroPieza;

    }

    public void establecerDescripcionPieza(String descripcion) {
        descripcionPieza = descripcion;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    public void establecerCantidad(int cuenta) {
        if (cuenta >= 0) {
            cantidad = cuenta;
        } else {
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a cero");
        }

    }

    public int obtenerCantidad() {
        return cantidad;
    }

    public void establecerPrecioPorArticulo(double precio) {
        if (precio >= 00.0) {
            precioPorArticulo = precio;
        } else {
            throw new IllegalArgumentException("El precio por articulo debe ser mayor o igual a cero");
        }

    }
    public double obtenerPrecioPorArticulo(){
    return precioPorArticulo;
}
    @Override
    public String toString(){
        return String.format("%s:\n%s:%s(%s)\n%s:  %d \n%s:  $%,.2f","Factura","Numero de pieza",obtenerNumeroPieza(),obtenerDescripcionPieza(),"Cantidad",obtenerCantidad(),"Precio por articulo",obtenerPrecioPorArticulo());
    }
    @Override
    public double obtenerMontoPago(){
    //se calcula el monto toal
        return obtenerCantidad()*obtenerPrecioPorArticulo();
        
    }
}
