
package laboratorio2romerojhonny;


public class SistemaRomeroJhonny extends TiendaElectronicaAmazon{
    String categoriaProducto;
    private String comprobarSistema;

    public SistemaRomeroJhonny(String categoriaProducto, String comprobarSistema, String codigo, float PrecioPagar, int idCliente) {
        super(codigo, PrecioPagar, idCliente);
        this.categoriaProducto = categoriaProducto;
        this.comprobarSistema = comprobarSistema;
    }


    
}
