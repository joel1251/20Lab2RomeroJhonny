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
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Guardar la información de los artículos al inicio del programa
        guardarArticulos();

        InstanciaOpcionMenu variableOpcionMenu = new InstanciaOpcionMenu();
        ArrayList<String> portadaArreglo = new ArrayList<>();
        portadaArreglo.add("Universidad de las Fuerzas Armadas Espe");
        portadaArreglo.add("Nombre: Romero Jhonny");
        portadaArreglo.add("Curso: 2 A");
        portadaArreglo.add("Materia: Programacion Orientada a Objetos");
        portadaArreglo.add("Docente: Veronica Martinez");
        portadaArreglo.add("Laboratorio 2");

        for (String salidaDeDatos : portadaArreglo) {
            System.out.println(salidaDeDatos);
        }

        variableOpcionMenu.menuDeOpciones();
    }

    // Método para guardar la información de los artículos al inicio
    private static void guardarArticulos() {
        try (FileWriter fw = new FileWriter("articulos.csv", true)) {
            fw.write("Computadora,MarcaX,999.99\n");
            fw.write("Audifonos,MarcaY,49.99\n");
            System.out.println("Información guardada correctamente en articulos.csv");
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo CSV: " + e.getMessage());
        }
    }
}

class InstanciaOpcionMenu {
    int variableAlmacenaUsuario;
    List<String> carrito = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menuDeOpciones() {
        do {
            menuPrincipalGenerado menu = new menuPrincipalGenerado();
            menu.generarMenu();
            System.out.println("Ingrese una opcion: ");
            variableAlmacenaUsuario = obtenerNumeroInput();

            switch (variableAlmacenaUsuario) {
                case 1:
                    System.out.println("Opcion 1");
                    // Agrega lógica para mostrar información de artículos desde el archivo CSV
                    mostrarArticulos();
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    // Agrega lógica para mostrar el carrito
                    mostrarCarrito();
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
        // Lógica para mostrar información desde el archivo CSV
        List<String> articulos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("articulos.csv"))) {
            String linea;
            System.out.println("Lista de Artículos:");

            int index = 1;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                String articuloInfo = "Marca/Modelo: " + campos[0] + ", Precio: $" + campos[2];
                System.out.println(index + ". " + articuloInfo);
                articulos.add(articuloInfo);
                index++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
            return;
        }

        // Permitir al usuario seleccionar un artículo
        System.out.println("Seleccione un artículo ingresando su número (o 0 para volver):");
        int seleccion = obtenerNumeroInput();

        // Validar la selección
        if (seleccion >= 1 && seleccion <= articulos.size()) {
            System.out.println("Ha seleccionado: " + articulos.get(seleccion - 1));
            // Agregar el artículo al carrito
            carrito.add(articulos.get(seleccion - 1));
            System.out.println("Artículo agregado al carrito.");
        } else if (seleccion == 0) {
            // Volver al menú principal
        } else {
            System.out.println("Selección no válida");
        }
    }

    private void mostrarCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Contenido del Carrito:");
            for (String item : carrito) {
                System.out.println(item);
            }
        }
    }

    private int obtenerNumeroInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("Error. Ingrese un número válido.");
            scanner.next(); // Limpiar el buffer del scanner
        }
        return scanner.nextInt();
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