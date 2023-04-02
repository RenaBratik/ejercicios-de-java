import java.util.Arrays;
import java.util.Scanner;

public class incisoB {
    public static void main(String[] args) {
        char[] letra = {'a', 'd'};
        Scanner ingreso = new Scanner(System.in);
        int lista[] = new int[3];
        System.out.println("Ingrese tres numeros" + " ");
        lista[0] = ingreso.nextInt();
        lista[1] = ingreso.nextInt();
        lista[2] = ingreso.nextInt();

        for (int i = 0; i < letra.length; i++) {
            if (letra[i] == 'a') {
                System.out.print("Ascendente" + " ");
                System.out.println(Arrays.toString(numeroAscendente(lista)));
            } else if (letra[i] == 'd') {
                System.out.print("Descendente" + " ");
                System.out.println(Arrays.toString(numeroDescendente(lista)));
            }


        }
    }
    private static int[] numeroAscendente(int[] inicio){
        for (int i = 0; i < inicio.length; i++) {
            for (int j = i+1; j < inicio.length; j++) {
                if(inicio[j]<inicio[i]){
                    int cambiarInicio= inicio[i];
                    int nuevoMenor= inicio[j];
                    inicio[i]=nuevoMenor;
                    inicio[j]=cambiarInicio;
                }

            }

        }
        return inicio;
    }

    private static int[] numeroDescendente(int[] comienzo) {
        for (int i = 0; i < comienzo.length; i++) {
            for (int j = i + 1; j < comienzo.length; j++) {
                if (comienzo[j] > comienzo[i]) {
                    int cambiarInicio = comienzo[i];
                    int nuevoMenor = comienzo[j];
                    comienzo[i] = nuevoMenor;
                    comienzo[j] = cambiarInicio;
                }
            }
        }
        return comienzo;
    }
}



