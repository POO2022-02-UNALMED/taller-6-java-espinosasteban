package vehiculos;

public class Camioneta extends Vehiculo{
    private static int totalCamionetas = 0;
    boolean volco;


    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        totalCamionetas++;
        if(!Fabricante.diccionario_ventas.containsKey(fabricante)){
            Fabricante.diccionario_ventas.put(fabricante, 1);

        }
        else {
            int cantidad = Fabricante.diccionario_ventas.get(fabricante);
            Fabricante.diccionario_ventas.put(fabricante, cantidad+1);

        }
    }

    public Camioneta(){
        totalCamionetas++;

    }

    public static int getTotalCamionetas() {
        return totalCamionetas;
    }
}
