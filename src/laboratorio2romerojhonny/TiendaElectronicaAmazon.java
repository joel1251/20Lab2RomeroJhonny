
package laboratorio2romerojhonny;



public class TiendaElectronicaAmazon {
    
    String nombre;
    int fecha;
    int idCliente;

    public TiendaElectronicaAmazon(String nombre, int fecha, int idCliente) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public float getfecha() {
        return fecha;
    }

    public void setfecha(int fecha) {
        this.fecha = fecha;
    }

    public int getidCliente() {
        return idCliente;
    }

    public void setidCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public void verificarStock() {
       
        System.out.println("Verificando stock...");
    }

    public void realizarPedido() {
        // Lógica para realizar un pedido
        System.out.println("Realizando pedido...");
    }

    public void realizarCobro() {
        // Lógica para realizar el cobro
        System.out.println("Realizando cobro...");
    }

    public void gestionarEnvio() {
        // Lógica para gestionar el envío
        System.out.println("Gestionando envío...");
    }

    public void comprobarSistema() {
        // Lógica para comprobar el sistema
        System.out.println("Comprobando sistema...");
    }
    
}
