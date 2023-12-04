package laboratorio2romerojhonny;

import java.io.BufferedReader;
import java.io.FileReader;//Para leer el archivo txt try catch 
import java.io.FileWriter;//para escribir en el archivo txt
import java.io.IOException;//para try catch  
import java.util.ArrayList;//UtilizamosArreglos
import java.util.Scanner;//Llamamos para que el usuario ingrese una variable
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
        InstanciaOpcionMenu VariableOpcionMenu = new InstanciaOpcionMenu();
        ArrayList<String> PortadaArreglo = new ArrayList<>();
        PortadaArreglo.add("Universidad de las Fuerzas Armadas Espe");
        PortadaArreglo.add("Nombre: Romero Jhonny");
        PortadaArreglo.add("Curso: 2 A");
        PortadaArreglo.add("Materia: Programacion Orientada a Objetos");
        PortadaArreglo.add("Docente: Veronica Martinez");
        PortadaArreglo.add("Laboratorio 2");

        for (String salidaDeDatos : PortadaArreglo) {
            System.out.println(salidaDeDatos);
        }

        VariableOpcionMenu.MenuDeOpciones();
    }
}

class InstanciaOpcionMenu {
    int variableAlmacenaUsuario;

    public void MenuDeOpciones() {
        Scanner scan = new Scanner(System.in);
        do {
            menuPrincipalGenerado menu = new menuPrincipalGenerado();
            menu.generarMenu();
            System.out.println("Ingrese una opcion: ");
            variableAlmacenaUsuario = scan.nextInt();
            switch (variableAlmacenaUsuario) {
                case 1:
                    System.out.println("Opcion 1");
                    // Agrega lógica para mostrar información de artículos desde el archivo CSV
                    mostrarArticulos();
                    break;
                case 2:
                    System.out.println("Opcion 2");
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

    private void mostrarArticulos() {
        try (BufferedReader br = new BufferedReader(new FileReader("articulos.csv"))) {
            String linea;
            System.out.println("Lista de Artículos:");

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                System.out.println("Marca/Modelo: " + campos[0] + ", Precio: $" + campos[1]);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
}

class menuPrincipalGenerado {
    MenuDeOpciones menuOp[] = new MenuDeOpciones[3];

    public void generarMenu() {
        menuOp[0] = new MenuDeOpciones("1", "------", "Articulos");
        menuOp[1] = new MenuDeOpciones("2", "------", "Carrito");
        menuOp[2] = new MenuDeOpciones("3", "------", "(Salir)");

        try (FileWriter fw = new FileWriter("MenuRomeroJhonny.txt")) {
            for (MenuDeOpciones menu : menuOp) {
                fw.write(menu.getOpcion1());
                fw.write(menu.getOpcion2());
                fw.write(menu.getOpcion3());
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

class MenuDeOpciones {
    String opcion1;
    String opcion2;
    String opcion3;

    public MenuDeOpciones(String opcion1, String opcion2, String opcion3) {
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }
}