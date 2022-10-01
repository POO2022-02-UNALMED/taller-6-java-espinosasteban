package vehiculos;

public class Automovil extends Vehiculo {
    int puestos;
    private static int totalAutomoviles = 0;



    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        totalAutomoviles++;
        if(!Fabricante.diccionario_ventas.containsKey(fabricante)){
            Fabricante.diccionario_ventas.put(fabricante, 1);

        }
        else {
            int cantidad = Fabricante.diccionario_ventas.get(fabricante);
            Fabricante.diccionario_ventas.put(fabricante, cantidad+1);

        }

    }

    public Automovil(){
        totalAutomoviles++;
    }

    public static int getTotalAutomoviles(){
        return totalAutomoviles;
    }
}
