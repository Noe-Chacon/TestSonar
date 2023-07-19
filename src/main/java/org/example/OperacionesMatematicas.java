package org.example;

public class OperacionesMatematicas {//clase principal
    public static int suma(int a, int b){
        return a + b;
    }//Suma
    public static int resta(int a, int b){
        return a - b;
    }//Resta
    public static int recorrido(int n){
        int res = 0;
        for (int i=1; i<=n; i++){
            res = res + i;
        }
        return res;
    }//Resta
    public static void main(String[] args) {//main()
        System.out.println("----------------Iniciando Selenium----------------");
        int sumaEnteros = suma(10,10);
        int restaEnteros = resta(10,5);
        System.out.println("Resultado Suma: "+sumaEnteros);
        System.out.println("Resultado Resta: "+restaEnteros);

        for (int i=0; i<=10; i++){
            System.out.println(i);
        }
        int sumando = recorrido(100);

        System.out.println(sumando);
    }
}
