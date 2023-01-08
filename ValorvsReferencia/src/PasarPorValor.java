public class PasarPorValor {

    public static void main(String[] args) {

        int i = 10;
        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con i (se mantiene igual) = " + i);
    }

    public static void test(int x){
        System.out.println("Iniciamos el método test con x = " + x);
        x = 35;
        System.out.println("Finaliza el método test con x = " + x);
    }

}