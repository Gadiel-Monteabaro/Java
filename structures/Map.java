package structures;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño
        System.out.println(numbers.size());

        // Añadir elementos
        names.put("Gadiel", "gadiel@gmail.com");
        names.put("Monteabaro", "monteabaro@gmail.com");

        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos
        System.out.println(names.get("Gadiel"));
        System.out.println(names.get("Dev"));

        // Verificar elementos
        System.out.println(names.containsKey("Gadiel"));

        System.out.println(names.containsValue("gadiel@gmail.com"));

        // Modificar elementos
        names.put("Gadiel", "gadiel96@gmail.com");
        System.out.println(names);

        names.replace("Silva", "gadiel96@gmail.com");
        System.out.println(names);

        names.putIfAbsent("Silva", "gadiel96@gmail.com");
        System.out.println(names);

        // Eliminar elementos
        System.out.println(names.remove("Gadiel"));
        System.out.println(names);

        // Limpiar
        names.clear();
        System.out.println(names);
    }
}
