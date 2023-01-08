public class PasarPorReferencia {

    public static void main(String[] args) {

        int[] edad = {10, 11, 12};
        System.out.println("Iniciamos el método main");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + (i + 1) + "] = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Después de llamar al método test");
        for (int j = 0; j < edad.length; j++) {
            System.out.println("edad[" + (j + 1) + "] = " + edad[j]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    public static void test(int[] x) {
        System.out.println("Iniciamos el método test");
        for (int j = 0; j < x.length; j++) {
            x[j] = x[j] + 20;
        }
        System.out.println("Finaliza el método test");
    }

}