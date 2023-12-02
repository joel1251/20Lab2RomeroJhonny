
package laboratorio2romerojhonny;



public class TiendaElectronicaAmazon {
    
    String codigo;
    float PrecioPagar;
    int idCliente;

    public TiendaElectronicaAmazon(String codigo, float PrecioPagar, int idCliente) {
        this.codigo = codigo;
        this.PrecioPagar = PrecioPagar;
        this.idCliente = idCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecioPagar() {
        return PrecioPagar;
    }

    public void setPrecioPagar(float PrecioPagar) {
        this.PrecioPagar = PrecioPagar;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
