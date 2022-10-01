package vehiculos;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Fabricante extends Vehiculo{
    String nombre;
    Pais pais;
    static HashMap<Pais, Integer> diccionario = new HashMap<>();
    static HashMap<Fabricante, Integer> diccionario_ventas = new HashMap<>();



    public Fabricante(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, Pais pais) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.pais = pais;
        if(!diccionario.containsKey(pais)){
            diccionario.put(pais, 1);

        }
        else {
             int cantidad = diccionario.get(pais);
             diccionario.put(pais, cantidad+1);

        }


    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        if(!diccionario.containsKey(pais)){
            diccionario.put(pais, 1);

        }
        else {
            int cantidad = diccionario.get(pais);
            diccionario.put(pais, cantidad+1);

        }
        Vehiculo.setCantidadVehiculos(Vehiculo.getCantidadVehiculos()-1);
    }

    public Fabricante() {


    }

    public Fabricante(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public static Fabricante fabricaMayorVentas(){
        HashMap<Fabricante,Integer> diccionario_ventas = Fabricante.diccionario_ventas;

        Fabricante fabricante_ganador = new Fabricante("Aasjd");
        int cantidad_ganador = 0;

        for (Map.Entry<Fabricante, Integer> tupla : diccionario_ventas.entrySet()){
            fabricante_ganador = tupla.getKey();
            cantidad_ganador = tupla.getValue();
            break;
        }
        for (Map.Entry<Fabricante, Integer> tupla : diccionario_ventas.entrySet()){
            Fabricante fabricante_actual = tupla.getKey();
            int cantidad_actual = tupla.getValue();
            if(cantidad_actual > cantidad_ganador){
                cantidad_ganador = cantidad_actual;
                fabricante_ganador = fabricante_actual;
            }

        }
        return fabricante_ganador;
    }
}
