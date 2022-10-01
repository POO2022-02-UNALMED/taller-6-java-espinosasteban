package vehiculos;

public class Vehiculo {
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    int precio;
    int peso;
    String traccion;
    Fabricante fabricante;
    private static int CantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.CantidadVehiculos++;
    }

    public Vehiculo() {
        Vehiculo.CantidadVehiculos++;

    }



    public static void setCantidadVehiculos(int i) {
        Vehiculo.CantidadVehiculos = i;
    }

    public static int getCantidadVehiculos() {
        return Vehiculo.CantidadVehiculos;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getTraccion() {
        return traccion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }
}
