
package laboratorio2romerojhonny;


public class EnvioDomicilioRomeroJhonny extends TiendaElectronicaAmazon{
    String tipoTransporte;
    String estadoPaquete;
    String fechaEntrega;
    private String RecogerEnvio;
    private String EntragaCliente;

    public EnvioDomicilioRomeroJhonny(String tipoTransporte, String estadoPaquete, String fechaEntrega, String RecogerEnvio, String EntragaCliente, String codigo, float PrecioPagar, int idCliente) {
        super(codigo, PrecioPagar, idCliente);
        this.tipoTransporte = tipoTransporte;
        this.estadoPaquete = estadoPaquete;
        this.fechaEntrega = fechaEntrega;
        this.RecogerEnvio = RecogerEnvio;
        this.EntragaCliente = EntragaCliente;
    }
    
    
    
}
