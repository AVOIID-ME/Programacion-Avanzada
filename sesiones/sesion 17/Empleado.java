public class Empleado{
    //Atributos
    private String nombre;
    private String puesto;
    private String sucursal;
    private String telefono;
    private String correo;


    public Empleado (String nombre, String puesto, String sucursal, String telefono, String correo) {

        this.nombre = nombre;
        this.puesto = puesto;
        this.sucursal = sucursal;
        this.telefono = telefono;
        this.correo = correo;

    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public String getPuesto(){
        return puesto;
    }

    public String getSucursal(){
        return sucursal;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getCorreo(){
        return correo;    
    }

    //Setters

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    //Actualizar datos de Empleado

    public void actualizarContacto(String telefono, String correo){
        this.telefono = telefono;
        this.correo = correo;
    }

    //Mostrar Informacion del Empleado

    public void mostrarInformacion(){
        System.out.print("Nombre :" + nombre);
        System.out.print("Puesto :" + puesto);
        System.out.print("Sucursal :" + sucursal);
        System.out.print("Telefono :" + telefono);
        System.out.print("Correo :" + correo);
    }
}