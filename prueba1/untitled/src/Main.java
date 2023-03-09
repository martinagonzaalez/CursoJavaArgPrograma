public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 14;
        System.out.println("Ejercicio 1.a : Números intermedios entre A y B");
        while (a <= b) {
            System.out.println(a);
            a++;
        }
        System.out.println("Ejercicio 1.b : Números pares");
        for (int x=1; x<=14; x++){
            if (x%2==0) {
                System.out.println(x + " es par");
            }
        }
    }
}
