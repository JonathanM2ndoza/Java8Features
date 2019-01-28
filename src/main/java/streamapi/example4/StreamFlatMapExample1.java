package streamapi.example4;

import java.util.ArrayList;
import java.util.List;

public class StreamFlatMapExample1 {
    public static void main(String[] args) {
        Persona p = new Persona("pedro");
        Viaje v = new Viaje("Francia");
        Viaje v2 = new Viaje("Inglaterra");
        p.addViaje(v);
        p.addViaje(v2);
        Persona p1 = new Persona("gema");
        Viaje v3 = new Viaje("Italia");
        Viaje v4 = new Viaje("Belgica");
        p1.addViaje(v3);
        p1.addViaje(v4);

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(p);
        lista.add(p1);

        //Before Java 8
        for (Persona persona : lista) {
            System.out.println("==="+persona.getNombre());
            for (Viaje viaje : persona.getLista())
                System.out.println(viaje.getPais());
        }

        //With Java 8 flatMap
        lista.stream().map(persona -> persona.getLista()).flatMap(viajes -> viajes.stream()).map(viaje->viaje.getPais()).forEach(System.out::println);
    }
}
