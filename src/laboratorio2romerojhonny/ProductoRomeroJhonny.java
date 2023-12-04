
package laboratorio2romerojhonny;


public class ProductoRomeroJhonny extends TiendaElectronicaAmazon {
    String categoria;
    float precio;
    String fabricante;
    String descripcion;
    int nStock;
    private String comprobarSistema;

    public ProductoRomeroJhonny(String categoria, float precio, String fabricante, String descripcion, int nStock, String comprobarSistema, String nombre, int fecha, int idCliente) {
        super(nombre, fecha, idCliente);
        this.categoria = categoria;
        this.precio = precio;
        this.fabricante = fabricante;
        this.descripcion = descripcion;
        this.nStock = nStock;
        this.comprobarSistema = comprobarSistema;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNStock() {
        return nStock;
    }

    public void setNStock(int nStock) {
        this.nStock = nStock;
    }

    public String getComprobarSistema() {
        return comprobarSistema;
    }

    public void setComprobarSistema(String comprobarSistema) {
        this.comprobarSistema = comprobarSistema;
    }

    public void comprobarEnElSistema() {
        // Lógica para comprobar en el sistema
        if ("encontrado".equals(comprobarSistema)) {
            System.out.println("Producto encontrado en el sistema.");
        } else {
            System.out.println("Producto no encontrado en el sistema.");
        }
    }
}