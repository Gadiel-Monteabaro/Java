public class Conditionals {
    public static void main(String[] args) {
        // Condicionales
        var age = 31;

        if (age >= 18 && age >= 29 && age < 30) {
            System.out.println("El usuario claramente es mayor de edad, esta por cumplir los 30.");
        } else if (age >= 18) {
            System.out.println("El usuario es mayor de edad. ");
        } else {
            System.out.println("El usario no puede ingresar, es menor de edad");
        }

        // Sintaxis del switch
        var day = 0;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes  ");
                break;
            // los otros casos
            default:
                System.out.println("No pertenece a un día de la semana");
                break;
        }

    }
}
