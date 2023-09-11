package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        float suma = 0; // lo declaro como float para que el promedio sea exacto
        for (var arg:args)
            suma += Integer.parseInt(arg);
        System.out.println("El promedio de los numeros es: " + suma/args.length);
    }
}