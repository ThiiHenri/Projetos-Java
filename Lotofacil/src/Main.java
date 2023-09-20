import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner leia = new Scanner(System.in);
        Scanner leiaNum = new Scanner(System.in);
        Scanner numeroDiv = new Scanner (System.in);

        Random numeroAle = new Random();

        char letraPremiada = 'T', letra;
        int escolhaMenu, numAleatorio, valor, numeroletra;
        float numDiv;


        System.out.println("Menu de Jogos Lotofacil");
        System.out.println("Menu LOTOFÁCIL:\n" +
                "1) Apostar de 0 a 100\n" +
                "2) Apostar de A à Z\n" +
                "3) Apostar em par ou ímpar\n" +
                "0) Sair");

        escolhaMenu = leia.nextInt();

        switch (escolhaMenu){

            case 1:
                System.out.println("Digite um numero para aposta: ");
                numAleatorio = leiaNum.nextInt();
                valor = numeroAle.nextInt(101);
                    if (numAleatorio>100 || numAleatorio<0)
                        System.out.println("Numero digitado e invalido");
                    else
                    {
                        System.out.println("O numero sorteado foi: " + valor);
                        if (numAleatorio == valor)
                            System.out.println("Você ganhou R$1000,00 reais");
                        else
                            System.out.println("Que pena! O numero sorteado foi: " + valor);
                    }
                    break;

            case 2:
                System.out.println("Digite uma Letra: ");
                    numeroletra = System.in.read();
                    letra = Character.toUpperCase((char) numeroletra);
                        if(letra == letraPremiada)
                            System.out.println("Você ganhou R$500,00 reais");
                        else
                            System.out.println("Que pena! A letra sorteada foi " + letraPremiada);
                        break;


            case 3:
                System.out.println("Digite um numero, para verificar se e PAR ou IMPAR: ");
                numDiv = numeroDiv.nextFloat();
                    if (numDiv % 2 == 0)
                        System.out.println("Você ganhou R$100,00");
                    else
                        System.out.println("Que pena! O numero digitado é impar e a premiação foi para numeros pares.");
                    break;


            case 4:
                break;


        }

    }
}