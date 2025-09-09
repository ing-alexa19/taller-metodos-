import java.util.Scanner;

class TallerJava {


    // ---------------- INT ----------------
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int obtenerMayor(int a, int b) {
        return (a > b) ? a : b;
    }

    // ---------------- DOUBLE ----------------
    public static double calcularPromedio(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static double convertirDolaresAPesos(double dolares) {
        double tasa = 4000; // 1 USD = 4000 COP
        return dolares * tasa;
    }

    // ---------------- STRING ----------------
    public static String saludoPersonalizado(String nombre) {
        return "¡Hola " + nombre + "! Qué gusto verte.";
    }

    public static String unirCadenas(String c1, String c2) {
        return c1 + " " + c2;
    }

    // ---------------- BOOLEAN ----------------
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

    // ---------------- MENU ----------------
    public static void mostrarMenu() {
        System.out.println("\n========== MENÚ ==========");
        System.out.println("1. Saludar (void)");
        System.out.println("2. Mostrar trabajo (void)");
        System.out.println("3. Sumar dos números (int)");
        System.out.println("4. Obtener el mayor de dos números (int)");
        System.out.println("5. Calcular promedio (double)");
        System.out.println("6. Convertir dólares a pesos (double)");
        System.out.println("7. Saludo personalizado (String)");
        System.out.println("8. Unir dos cadenas (String)");
        System.out.println("9. Verificar si un número es par (boolean)");
        System.out.println("10. Verificar si eres mayor de edad (boolean)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1:
                    saludar();
                    break;
                case 2:
                    mostrartrabajo();
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + sumar(a, b));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    int x = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int y = sc.nextInt();
                    System.out.println("Mayor: " + obtenerMayor(x, y));
                    break;
                case 5:
                    System.out.print("Ingrese el primer número: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double n2 = sc.nextDouble();
                    System.out.println("Promedio: " + calcularPromedio(n1, n2));
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad en dólares: ");
                    double dolares = sc.nextDouble();
                    System.out.println("En pesos: " + convertirDolaresAPesos(dolares));
                    break;
                case 7:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println(saludoPersonalizado(nombre));
                    break;
                case 8:
                    System.out.print("Ingrese la primera cadena: ");
                    String c1 = sc.nextLine();
                    System.out.print("Ingrese la segunda cadena: ");
                    String c2 = sc.nextLine();
                    System.out.println("Resultado: " + unirCadenas(c1, c2));
                    break;
                case 9:
                    System.out.print("Ingrese un número: ");
                    int num = sc.nextInt();
                    System.out.println("¿Es par? " + esPar(num));
                    break;
                case 10:
                    System.out.print("Ingrese su edad: ");
                    int edad = sc.nextInt();
                    System.out.println("¿Mayor de edad? " + esMayorEdad(edad));
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}