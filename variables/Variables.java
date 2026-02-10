package variables;

public class Variables {
    public static void main(String[] args) {
        String name = "Gadiel";
        name = "Gadiel Monteabaro";
        int age = 29;

        // constantes
        final String EMAIL = "gadiel@gmail.com";

        // declaración var
        var email = 2;

        System.out.println("IA: Hola " + name + ", Aprendiendo Java?");
        System.out.println(name + ": Si, empezando Java con " + age + " años.");
        System.out.println("IA: Perfecto! veo que no tenes registrado tu email, te gustaria hacerlo?");
        System.out.println(name + ": si, mi email es: " + EMAIL);
    }
}
