import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Capacidad máxima de empleados
        SistemaPersonal sistema = new SistemaPersonal(20);

        int opcion;

        do {

            System.out.println("========================================");
            System.out.println(" MERCADO TECNOLOGICO");
            System.out.println(" Sistema de Administracion de Personal");
            System.out.println("========================================");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Actualizar datos de contacto");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("\nNombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Puesto (Gerente/Vendedor/Cajero): ");
                    String puesto = teclado.nextLine();

                    System.out.print("Sucursal: ");
                    String sucursal = teclado.nextLine();

                    System.out.print("Telefono: ");
                    String telefono = teclado.nextLine();

                    System.out.print("Correo: ");
                    String correo = teclado.nextLine();

                    Empleado empleado = new Empleado(
                            nombre,
                            puesto,
                            sucursal,
                            telefono,
                            correo
                    );

                    sistema.registrarEmpleado(empleado);

                    break;

                case 2:

                    System.out.print("\nNombre del empleado: ");
                    String buscar = teclado.nextLine();

                    System.out.print("Nuevo telefono: ");
                    String nuevoTelefono = teclado.nextLine();

                    System.out.print("Nuevo correo: ");
                    String nuevoCorreo = teclado.nextLine();

                    sistema.actualizarEmpleado(
                            buscar,
                            nuevoTelefono,
                            nuevoCorreo
                    );

                    break;

                case 3:

                    sistema.mostrarEmpleados();

                    break;

                case 4:

                    System.out.println("\nGracias por utilizar el sistema.");

                    break;

                default:

                    System.out.println("\nOpcion no valida.\n");

            }

        } while (opcion != 4);

        teclado.close();

    }

}