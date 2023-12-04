
package laboratorio2romerojhonny;

public class ClienteRomeroJhonny extends TiendaElectronicaAmazon{
    String Dirreccion;
    String TipoDePago;

    public ClienteRomeroJhonny(String Dirreccion, String TipoDePago,String nombre, int fecha, int idCliente) {
        super(nombre,fecha,idCliente);
        this.Dirreccion = Dirreccion;
        this.TipoDePago = TipoDePago;
    }

    public String getDirreccion() {
        return Dirreccion;
    }

    public void setDirreccion(String Dirreccion) {
        this.Dirreccion = Dirreccion;
    }

    public String getTipoDePago() {
        return TipoDePago;
    }

    public void setTipoDePago(String TipoDePago) {
        this.TipoDePago = TipoDePago;
    }
    
    public void RealizarPedido() {
        // Lógica para realizar un pedido
        System.out.println("Pedido realizado con éxito.");
    }

    public void SolicitarEnvio() {
        // Lógica para solicitar envío
        System.out.println("Envío solicitado. Estamos procesando su solicitud.");
    }
    
}
