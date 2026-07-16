public class SistemaPersonal {
    
    //Array para almacenar empleados
    private Empleado[] empleados;

    //Cantidad empleados
    private int contador;

    public SistemaPersonal(int capacidad){
        empleados = new Empleado[capacidad];
        contador = 0;
    }

    //Registrar Empleado
    public void registrarEmpleado(Empleado empleado){
        
        if ( contador < empleados.length){
            empleados[contador] = empleado;
            contador++;

            System.out.println("\nEmpleado regustrado correctamente. \n");
        }
        else {
            System.out.println("\nNo hay espacio disponible");
        }
    }

    //Actualizar telefono y correo
    public void actualizarEmpleado(String nombre, String telefono, String correo){

        boolean encontrado = false;

        for (int i = 0; i < contador; i++){
            if (empleados[i].getNombre().equalsIgnoreCase(nombre)){
                empleados[i].actualizarContacto(telefono, correo);

                System.out.println("\nContacto actualizado correctamente.\n");

                encontrado = true;

                break;
            }
        }

        if (!encontrado){
            System.out.println("\nEmpleado no Encontrado");
        }
    }

    //Mostrar los empleados
    public void mostrarEmpleados(){

        if (contador == 0){
            System.out.println("\nNo existen empleados registrados. \n");
            return;
        }

        System.out.println("\n Lista de Empleados \n");

        for (int i = 0; i < contador; i ++){
            
            empleados[i].mostrarInformacion();
        }
    }

}