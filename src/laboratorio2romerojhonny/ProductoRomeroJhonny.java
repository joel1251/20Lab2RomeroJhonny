
package laboratorio2romerojhonny;


public class ProductoRomeroJhonny extends TiendaElectronicaAmazon {
    String categoria;
    float precio;
    String fabricante;
    String descripcion;
    int nStock;
    private String comprobarSistema;

    public ProductoRomeroJhonny(String categoria, float precio, String fabricante, String descripcion, int nStock, String comprobarSistema, String codigo, float PrecioPagar, int idCliente) {
        super(codigo, PrecioPagar, idCliente);
        this.categoria = categoria;
        this.precio = precio;
        this.fabricante = fabricante;
        this.descripcion = descripcion;
        this.nStock = nStock;
        this.comprobarSistema = comprobarSistema;
    }
    
    
    
}
