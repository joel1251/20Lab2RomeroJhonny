
package laboratorio2romerojhonny;

public class ClienteRomeroJhonny extends TiendaElectronicaAmazon{
    String Dirreccion;
    String TipoDePago;

    public ClienteRomeroJhonny(String Dirreccion, String TipoDePago, String codigo, float PrecioPagar, int idCliente) {
        super(codigo,PrecioPagar,idCliente);
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
    
}
