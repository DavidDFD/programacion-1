

public class Actividad1 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;

        if (!a && (b && c)) {
            System.out.println("Sentencia if Ejecuada");
        } else {
            System.out.println("Sentencia else Ejecutada");

        }
        // Egercicio 2

        int marks = 80;
        if (marks > 70) {
            System.out.println("Distincion");
            if (marks > 35) {
                System.out.println("passs");

            } else {
                System.out.println("fail");
                System.out.println("mejor suerte para la proxima");
            }
        }

        // Actividad 3 Paki
        int india_score = 300;
        int pakistan_score = 290;

        if (india_score > pakistan_score)
            System.out.println("La mejor nacion india gana");

        else
            System.out.println("La peor nacion gana pakistan");

        // Egercicio 3 tip 2
        int india = 300;
        int pakistan = 290;
        System.out.println(india < pakistan ? "india gana" : "pakistan gana");

        // Egercicio 3.6
        int A = 7 * 3 + 6 / 2 - 5;
        int B = 21 - 8 + A % 3 * 11;
        if (A < B) {
            System.out.println(" a es menor que b");
        }
        if (A == B) {
            System.out.println("a es igual a b");
        }
        if (A > B) {
            System.out.println("b es mayor que a");
        }

    }

}
