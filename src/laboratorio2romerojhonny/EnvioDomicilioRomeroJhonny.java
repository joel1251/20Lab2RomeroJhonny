package laboratorio2romerojhonny;

public class EnvioDomicilioRomeroJhonny extends TiendaElectronicaAmazon {
    String tipoTransporte;
    String estadoPaquete;
    String fechaEntrega;
    private String recogerEnvio;
    private String entregarCliente;

    public EnvioDomicilioRomeroJhonny(String tipoTransporte, String estadoPaquete, String fechaEntrega, String recogerEnvio, String entregarCliente, String nombre, int fecha, int idCliente) {
        super(nombre, fecha, idCliente);
        this.tipoTransporte = tipoTransporte;
        this.estadoPaquete = estadoPaquete;
        this.fechaEntrega = fechaEntrega;
        this.recogerEnvio = recogerEnvio;
        this.entregarCliente = entregarCliente;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getEstadoPaquete() {
        return estadoPaquete;
    }

    public void setEstadoPaquete(String estadoPaquete) {
        this.estadoPaquete = estadoPaquete;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getRecogerEnvio() {
        return recogerEnvio;
    }

    public void setRecogerEnvio(String recogerEnvio) {
        this.recogerEnvio = recogerEnvio;
    }

    public String getEntregarCliente() {
        return entregarCliente;
    }

    public void setEntregarCliente(String entregarCliente) {
        this.entregarCliente = entregarCliente;
    }

    public void recogerElEnvio() {
        // Lógica para recoger el envío
        System.out.println("Envío recogido con éxito.");
    }

    public void entregarAlCliente() {
        // Lógica para entregar al cliente
        System.out.println("Envío entregado al cliente.");
    }
}
