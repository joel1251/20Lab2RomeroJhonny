package laboratorio2romerojhonny;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InstanciaOpcionMenu VariableOpcionMenu = new InstanciaOpcionMenu();
        ArrayList<String> PortadaArreglo = new ArrayList<>(); // Corregir la creación del ArrayList
        PortadaArreglo.add("Universidad de las Fuerzas Armadas Espe");
        PortadaArreglo.add("Nombre: Romero Jhonny");
        PortadaArreglo.add("Curso: 2 A");
        PortadaArreglo.add("Materia: Programacion Orientada a Objetos");
        PortadaArreglo.add("Docente: Veronica Martinez");
        PortadaArreglo.add("Laboratorio 2");

        for (String salidaDeDatos : PortadaArreglo) {
            System.out.println(salidaDeDatos);
        }

        VariableOpcionMenu.MenuDeOpciones(); // Utilizar la variable correcta
    }
}


// Definición de la clase Menu
class Menu {
    private String literal;
    private String decoracion;
    private String opcion;

    // Constructor de la clase Menu
    public Menu(String literal, String decoracion, String opcion) {
        this.literal = literal;
        this.decoracion = decoracion;
        this.opcion = opcion;
    }

    // Métodos para obtener los atributos de la clase
    public String getLiteral() {
        return literal;
    }

    
    public String getDecoracion() {
        return decoracion;
    }

    public String getOpcion() {
        return opcion;
    }
}

class InstanciaOpcionMenu {
    int variableAlmacenaUsuario;//Variable del menu

    public void MenuDeOpciones() {
        Scanner scan = new Scanner(System.in);//Objeto Scanner para obtener la entreda de usuario
        do {
            menuPrincipalGenerado menu = new menuPrincipalGenerado();
            menu.generarMenu();
            System.out.println("Ingrese una opcion: ");
            variableAlmacenaUsuario = scan.nextInt();
            switch (variableAlmacenaUsuario) {
                case 1:
                    // Tu lógica para la opción 1
                    break;
                case 2:
                    // Tu lógica para la opción 2
                    break;
                case 3:
                    System.out.println("Gracias por usar");
                    break;
                default:
                    System.out.println("Error. Opción no válida");
                    break;
            }
        } while (variableAlmacenaUsuario != 3);
    }
}

class menuPrincipalGenerado {

    Menu menuOp[] = new Menu[3];

    public void generarMenu() {
        menuOp[0] = new Menu("1", "------", "Ver Articulos");
        menuOp[1] = new Menu("2", "------", "Ver Carrito");
        menuOp[2] = new Menu("3", "------", "(Salir)");

        try (FileWriter fw = new FileWriter("MenuRomeroJhonny.txt")) {
            for (Menu menu : menuOp) {
                fw.write(menu.getLiteral());
                fw.write(menu.getDecoracion());
                fw.write(menu.getOpcion());
                fw.write("\r\n");
            }
        } catch (IOException e) {
            System.out.println("Error. " + e.getMessage());
        } finally {
            try (FileReader fr = new FileReader("MenuRomeroJhonny.txt")) {
                int valor = fr.read();
                while (valor != -1) {
                    System.out.print((char) valor);
                    valor = fr.read();
                }
            } catch (IOException e) {
                System.out.println("Error. " + e.getMessage());
            }
        }  
    }
}
