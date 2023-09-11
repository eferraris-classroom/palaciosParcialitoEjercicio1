package ar.edu.undef.fie;

//Hacer un programa que calcule el promedio de los números pasados por argumento a través de la consola,
// y lo muestre por la pantalla.
public class Main {
    public static void main(String[] args) {

        float suma = 0; // lo declaro como float para que el promedio sea exacto
        for (var arg:args)
            suma += Integer.parseInt(arg);
        System.out.println("El promedio de los numeros es: " + suma/args.length);
    }
}