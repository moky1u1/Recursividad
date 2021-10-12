public class Ejercicios {
    /*
    Factorial de un numero
    5!=5*4*3*2*1
    4!=4*3*2*1
    5!=5*4!
    4!=4*3!
    2!=2x1!
    */

    public static int factorial(int n){
        int factorial;

        if (n == 1) {
            //caso base
            factorial = n;
        }
        else {
            factorial = n * factorial(n-1);
        }

        return factorial;
    }

    /*
    Maximo comun divisor (mcd), algoritmo de Euclides
    a = 412 y b = 184
    */
    public static int mcd(int a, int b){
        int mcd;
        if (a == b){
            //caso base
            mcd = b;
        }
        else {
            if (a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
            mcd = mcd(a, b);
        }
        return mcd;
    }

    /*
    Suma de los elementos de un vector
    vector = {2, 4 6}
    suma = 2 + {4, 6}
    suma = 4 + {6}
    suma = 6 (caso base)
    */

    public static int sumaVector(int[] vector, int indice){
        int suma;

        if (indice == vector.length - 1) {
            //caso base
            suma = vector[indice];
        }
        else{
            suma = vector[indice] + sumaVector(vector, indice + 1);
        }

        return suma;
    }

     /*
    Metodo recursivo para comparar elemento por elemento
    vector 1 = {5, 6, 2}
    vector 2 = {2, 9, 2}
    difreren =  3 + 3 + 0 = 6
    los valores absolutos tienen que dar resultado 0
     */

    private static int compararVectores(int[] vector1, int[] vector2, int indice){
        int sumaDiferencias;

        if (indice == vector1.length - 1){//caso base
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);
        }else {//llamada recursiva
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) + compararVectores(vector1, vector2, indice + 1);
        }

        return sumaDiferencias;
    }
    /*
    Metodo auxiliar que realiza la llamada al metodo recursivo
     */
    public static boolean compararVectores(int[] vector1, int[] vector2){
        return compararVectores(vector1, vector2, 0) == 0;
    }

}
