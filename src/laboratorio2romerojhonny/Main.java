package laboratorio2romerojhonny;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        opccionMenu Opmenu = new opccionMenu();
         ArrayList <String> caratula =new ArrayList();//crear arrarlist
     caratula.add("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");///metiendo datos a array list
     caratula.add("INTEGRANTES: ROMERO JHONNY");///metiendo datos a array list
     caratula.add("CURSO: 2 ITIN");///metiendo datos a array list
     caratula.add("MATERIA: POO");///metiendo datos a array list
     caratula.add("DOCENTE: VERONICA MARTINEZ");///metiendo datos a array list
     caratula.add("LABORATORIO 2 ");///metiendo datos a array list
     for (String linea : caratula) {
            System.out.println(linea);
        }
        Opmenu.Opciones();
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

class opccionMenu {
    int opMenu;

    public void Opciones() {
        Scanner scan = new Scanner(System.in);
        do {
            GenerarMenu menu = new GenerarMenu();
            menu.generarMenu();
            System.out.println("Ingrese una opcion: ");
            opMenu = scan.nextInt();
            switch (opMenu) {
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
        } while (opMenu != 3);
    }
}

class GenerarMenu {

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
