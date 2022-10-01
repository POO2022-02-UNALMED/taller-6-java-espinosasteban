package vehiculos;

public class Camion extends Vehiculo{
    private static int totalCamiones = 0;
    int ejes;


    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        totalCamiones++;
        if(!Fabricante.diccionario_ventas.containsKey(fabricante)){
            Fabricante.diccionario_ventas.put(fabricante, 1);

        }
        else {
            int cantidad = Fabricante.diccionario_ventas.get(fabricante);
            Fabricante.diccionario_ventas.put(fabricante, cantidad+1);

        }
    }

    public Camion(){
        totalCamiones++;
    }

    public static int getTotalCamiones() {
        return totalCamiones;
    }
}
