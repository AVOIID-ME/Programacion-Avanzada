public class Main {

    public static void main(String[] args){
        Vehiculo [] flota;
        Camion volvo = new Camion (50, "Volvo","FH", 50, 1980, 80.00);
        Motocicleta vento = new Motocicleta(250, "Vento","12", 2000, 40.00);
        Auto nissan = new Auto(2, "Nissan", "Skyline",2000, 25.00 );

        flota = new ArrayList<Vehiculo>();

        flota.add(volvo);
        flota.add(vento);
        flota.add(nissan);

        for(int contador = 0; contaodr < flota.size(); contador+= 1 ){
            flota.get(contador).mostrarDetalles();
        }
    }
}