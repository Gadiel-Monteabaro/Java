package structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Gadiel");
        names.add("Monteabaro");
        names.add("Gadi");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names);

        // Eliminar elementos
        names.remove("Gadiel");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Gadiel"));

        // Repetición de datos.
        names.add("Gadiel");
        names.add("Gadiel");
        names.add("Gadiel");
        System.out.println(names);

        // Conjunto
        var countries = new HashSet<String>();

        countries.add("Argentina");
        countries.add("España");
        countries.add("Paraguay");

        names.addAll(countries);

        System.out.println(names);

        names.removeAll(countries);

        System.out.println(names);

        names.retainAll(countries);

        System.out.println(names);
    }
}
