public class Pruebas {
    public static void main(String[] args) throws Exception {
        doSomething(6,2,-5);
    }

    public static void doSomething(int p1, int p2, int p3) {
        System.out.println("Variable p1 = "+p1);
        System.out.println("Variable p2 = "+p2);
        System.out.println("Variable p3 = "+p3);
        int suma = p1+p2+p3;
        System.out.println("La suma de las tres variables: " + suma);
    }
        

}
