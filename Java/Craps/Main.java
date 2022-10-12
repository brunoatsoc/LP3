//Importa os pacotes que o programa precisa
import java.util.Random;
import java.util.Scanner;
//Fim da importação

//Inicio da classe Main
public class Main{
    //Função main
    public static void main(String[] args){
        int counter = 1;
        Scanner choice = new Scanner(System.in);

        while(true){
            if(counter != 0){
                int dice1 = rollDice();
                int dice2 = rollDice();

                verification(dice1, dice2);
            }else{
                choice.close();

                break;
            }

            System.out.printf("Você quer continuar? (0 para sair 1 para continuar): ");
            counter = choice.nextInt();
        }
    }//Fim da função main

    //Função que vai gerar os valores de cada dado
    public static int rollDice(){
        Random dice = new Random();

        return (dice.nextInt(6) + 1);
    }//Fim da função rollDice

    //Função que verifica se o jogador ganhou, vai ter que jogar o segundo estagio ou perdeu
    public static void verification(int diceValue1, int diceValue2){
        int value = diceValue1 + diceValue2;

        //O jogador ganha
        if((value == 7) || (value == 11)){
            System.out.printf("Dado 1: %d Dado2: %d\nPonto: %d\nVocê ganhou\n\n", diceValue1, diceValue2, value);

            return;
        }else if((value >= 4 && value <= 6) || (value >= 8 && value <= 10)){ //O jogador tem que jogar o segundo estagio
            System.out.printf("Dado 1: %d Dado 2: %d\nPonto: %d\nIniciando estagio 2\n\n", diceValue1, diceValue2, value);
            
            int i = 1;

            while(true){
                int x = rollDice(), y = rollDice();
                int newValue = x + y;

                System.out.printf("Dado 1: %d Dado 2: %d\nJogada %d: %d\n\n", x, y, i, newValue);

                if((newValue == 7)){
                    System.out.printf("Você perdeu :-(\n\n");

                    return;
                }else if(newValue == value){
                    System.out.printf("Você venceu\n\n");

                    return;
                }

                i++;
            }
        }else{ //O jogador perde
            System.out.printf("Dado 1: %d Dado2: %d\nPonto: %d\nVocê perdeu :-(\n\n", diceValue1, diceValue2, value);
        }
    }//Fin da função verification
}//Fim da classe Main