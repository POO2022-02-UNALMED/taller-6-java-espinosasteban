package vehiculos;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pais extends Vehiculo{
    String nombre;

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
    }


    public static Pais paisMasVendedor() {
        HashMap<Pais,Integer> diccionario = Fabricante.diccionario;

        Pais pais_ganador = null;
        int cantidad_ganador = 0;

        for (Map.Entry<Pais, Integer> tupla : diccionario.entrySet()){
            pais_ganador = tupla.getKey();
            cantidad_ganador = tupla.getValue();
            break;
        }

        for (Map.Entry<Pais, Integer> tupla : diccionario.entrySet()){
            Pais pais_actual = tupla.getKey();
            int cantidad_actual = tupla.getValue();
            if(cantidad_actual > cantidad_ganador){
                cantidad_ganador = cantidad_actual;
                pais_ganador = pais_actual;
            }
        }

        return pais_ganador;

    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
