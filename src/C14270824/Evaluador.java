package C14270824;

import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {
        //ingresar 3 notas
        //validar notas (si esta entre 0 y 10 y que no sea negativo)
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota de Matematicas: ");
        Integer notaMat = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nota de Quimica: ");
        Integer notaQui = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nota de Lenguaje: ");
        Integer notaLeng = sc.nextInt();
        if (notaMat > 0 && notaMat <= 10 && notaLeng > 0 && notaLeng <= 10 && notaQui > 0 && notaQui <= 10 ){
            Integer promedio = (notaMat + notaLeng + notaQui) / 3;
            if (promedio <= 3){
                System.out.println("No aprobado");
            } else if (promedio > 3 && promedio <= 5) {
                System.out.println("Insuficiente");
            } else if (promedio > 5 && promedio <= 8) {
                System.out.println("Aceptable");
            }else if (promedio == 9 || promedio == 10) {
                System.out.println("Excelente");
            }
        } else{
            System.out.println("Las notas ingresadas no son validas");
        }

    }
}
