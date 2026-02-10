package operators;

public class Operators {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Aritméticos
        double a = 5;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        // Asignación
        a = 11;
        a += 1;
        a /= 2;
        a *= 2;
        a -= 1;

        System.out.println(a);

        // Comparación
        System.out.println(a == b);
        System.out.println(a == 11);
        System.out.println(a != 10);
        System.out.println(a > 10);
        System.out.println(a < 10);
        System.out.println(a >= 10);
        System.out.println(a <= 10);

        // Lógicos

        // Y (AND)
        System.out.println(true && true); // true
        System.out.println(true && false); // false

        // O (OR)
        System.out.println(true || false); // true
        System.out.println(false || false); // false

        // NO (NOT)
        System.out.println(!true && false); // false

        // Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++ );

    }
}
