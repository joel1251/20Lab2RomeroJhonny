
package laboratorio2romerojhonny;



public class TiendaElectronicaAmazon {
    private String nombre;
    private int dia;
    private int mes;
    private int ano;
    private int idCliente;

    // Constructor
    public Tienda(String nombre, int dia, int mes, int ano, int idCliente) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.idCliente = idCliente;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getIdCliente() {
        return idCliente;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    // Funciones
    public void verificarStock() {
        // Lógica para verificar el stock
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
