package structures;

public class Arrays {
    public static void main(String[] args) {
        // Arreglos, conjunto de datos del mismo tipo
        int[] numbers = new int[3]; // cantidad de espacios reservados
        System.out.println(numbers);

        String[] names = { "Gadiel", "Monteabaro", "Gadi" };

        // Acceder
        System.out.println(numbers[0]); // reserva la posicion por default 0
        System.out.println(names[0]);

        // Modificar
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[1]); // Mostrar dato del indice 1

    }
}
