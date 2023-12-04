
package laboratorio2romerojhonny;


public class SistemaRomeroJhonny extends TiendaElectronicaAmazon{
    String categoriaProducto;
    private String comprobarSistema;

    public SistemaRomeroJhonny(String categoriaProducto, String comprobarSistema, String nombre, int fecha, int idCliente) {
        super(nombre, fecha, idCliente);
        this.categoriaProducto = categoriaProducto;
        this.comprobarSistema = comprobarSistema;
    }

     public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
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