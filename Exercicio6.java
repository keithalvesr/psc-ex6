import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        double raio;
        double area;
        System.out.println("Bem vindo ao programa de calculo, informe o raio do circulo: ");
        
        //Ação do usuário: Informar o raio de um circulo
        Scanner teclado = new Scanner (System.in);
        raio = teclado.nextDouble();
        teclado.close();

        //Tarefa do programa: calcular 
        area = Math.PI * Math.pow(raio, 2);

        //Resposta do programa: Mostrar a area
        System.out.println("A área do círculo de raio " + raio + " é igual a " + area);
        



    }
    
}
