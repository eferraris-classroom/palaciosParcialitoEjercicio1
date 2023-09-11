package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        var suma = 0;
        for (var arg:args)
            suma += Integer.parseInt(arg);
        System.out.println("El promedio de los numeros es: " + suma/ args.length);
    }
}