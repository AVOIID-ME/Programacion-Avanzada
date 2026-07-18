public class Camion extends Vehiculo{
    private double capacidadCarga;

    public Camion(double capacidadCarga, String marca, String modelo, int año, double combustible){
        super(marca, modelo, año, combustible);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void mostrarDetalles(){
        System.out.println(String.format(
            "Capacidad de Carga: ", capacidadCarga
        ));
    }
}