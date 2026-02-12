package strings;

public class Strings {
    public static void main(String[] args) {

        // Secuencia de caracteres
        String name = "Gadiel";
        String frase = "Hola Mundo! ";

        // forma no redundate
        var secondName = new String("Monteabaro");

        // Concatenación
        System.out.println(name + " " + secondName);

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(0));
        // Obtener ultimo caracter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(frase.substring(2, 8));

        // Mayúsculas y Minusculas
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Comprobación de busqueda
        System.out.println(frase.contains("Hola"));

        // Comparación
        System.out.println(name.equals(secondName));
        System.out.println(name.equalsIgnoreCase("gadiel"));

        // trim replace
        System.out.println(frase.trim());
        System.out.println(frase.replace("Mundo", name));

        // format
        System.out.println(String.format("Hola %s!", name));

    }
}
