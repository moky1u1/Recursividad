public class Main {
    public static void main(String[] args) {
        //System.out.println(Ejercicios.factorial(5));

        //System.out.println(Ejercicios.mcd(412,184));

        //int[] vector= {2, 4, 6};
        //System.out.println(Ejercicios.sumaVector(vector, 0));

        //int[] vector1 = {5, 6, 2};
        //int[] vector2 = {5, 6, 2};
        //System.out.println(Ejercicios.compararVectores(vector1, vector2));

        //System.out.println("Sucesion Fibonacci: " + Ejercicios.fibonacci(10));

        //int [] vector = {2, 50, 6, 7, 6, 31, 4, 3};
        //System.out.println(Ejercicios.maximoVector(vector));

        //int[] vector = {10, 8, 6, 3, 2, 2, 1, 0};
        //System.out.println(Ejercicios.indiceVector(vector, 0));
        //System.out.println(Ejercicios.indiceVector(vector));

        int[] vector = {1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
        int valorBuscado = 9;
        System.out.println(Ejercicios.busquedaBinaria(vector,valorBuscado));
    }
}
