package structures;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // Declaración
        ArrayList<String> names = new ArrayList<String>();
        var numbers = new ArrayList<Integer>();

        System.out.println(names);
        System.out.println(numbers);

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Gadiel");
        names.add("Monteabaro");
        names.add("Gadi");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        // Modificar los elementos
        names.set(names.size() - 1, "gadi@gmail.com");
        System.out.println(names.getLast());

        // Eliminar
        names.remove(names.size() - 1);
        System.out.println(names.size());
        System.out.println(names.getLast());

        // Buscar elementos
        System.err.println(names.contains("Gadiel"));

        // addFirst y addLast
        names.addFirst("Admin");
        names.addLast("Argentina");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        
        // Limpiar Lista
        names.clear();
    }
}
