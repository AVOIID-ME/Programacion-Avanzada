public class Auto extends Vehiculo{
    private int numPuertas;

    public Auto(int numPuertas, String marca, String modelo, int año, double combustible){
        super(marca, modelo, año, combustible);
    }


    public int getNumPuertas(){
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas){
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println(String.format(
            "Numero de Puertas", numPuertas
        ));
    }
}