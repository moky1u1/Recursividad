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

    //Dise??ar e implementar un m??todo recursivo para calcular el en??simo t??rmino de
    //la sucesi??n.

    public static int fibonacci(int n){
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
            //caso base
        }else if (n == 1){
            return 1;
        }else if (n == 0){
            return 0;
        }
        return n;
    }

    /*
    Metodo recursivo para calcular el maximo de un vector

    vector = {2, 9, 6, 7, 6, 3, 4, 3}
     */

    private static int maximoVector(int[] vector, int indice, int maximo){

        if (indice == vector.length - 1){//caso base
            if (vector[indice] > maximo){
                maximo = vector [indice];
            }
        }else {//llamada recursiva
            if (vector[indice] > maximo){
                maximo = vector [indice];
            }

            maximo = maximoVector(vector, indice + 1, maximo);
        }

        return maximo;
    }

    /*
    metodo auxiliar que llama al metodo recursivo
     */
    public static int maximoVector(int[] vector){
        return maximoVector(vector, 0,0);
    }

    //Indice Vector
    public static int  indiceVector (int[] vector,int indice) {
        int contador = 0;

        if (indice == vector.length - 1){// caso base
            if (indice == vector[indice]){
                contador ++;
            }
        }else { //llamada recursiva
            if (indice == vector[indice]){
                contador ++;
            }
            contador = contador + indiceVector(vector,indice + 1);
        }
        return contador;
    }

    //metodo auxiliar
    public static boolean indiceVector(int[] vector){
        return indiceVector(vector,0) > 0;
    }


    //Busqueda binaria
    public static int busquedaBinaria(int  vector[], int dato){
        int n = vector.length;
        int centro,inf=0,sup=n-1;
        while(inf<=sup){
            centro=(sup+inf)/2;
            if(vector[centro]==dato) return centro;
            else if(dato < vector [centro] ){
                sup=centro-1;
            }
            else {
                inf=centro+1;
            }
        }
        return -1;
    }
}
