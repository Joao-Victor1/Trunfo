
package Trunfo;

import java.util.Random;
import java.util.Scanner;


public class Tabuleiro {
    
    Jogador play1 = new Jogador();
    Jogador play2 = new Jogador();
    Scanner ler = new Scanner(System.in);
    Random gerarEscolha = new Random();
    
    Tabuleiro(){
        
        play2.nome = "Computador";
        System.out.println("Digite o seu nome: ");
        play1.nome = ler.next();
    }
    
    void exibirPlacar(){   
        System.out.println("********  PLACAR ********");
        System.out.println(play1.nome+"   vs    "+play2.nome);
        System.out.println(play1.pontos+"             "+play2.pontos);
        System.out.println("*************************");
    }
    
    
    void duelo(){
        int escolha;
        for(int i=0; i<=4; i++){
            if (i%2==0){
                play1.monte[i].exibirCarta();
                System.out.println(play1.nome+" escolha o atributo: ");
                escolha = ler.nextInt();
                switch(escolha){
                    case 1 : if(play1.monte[i].potencia > play2.monte[i].potencia){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             } 
                             break;
                    case 2 : if(play1.monte[i].veloc_max > play2.monte[i].veloc_max){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             }
                             break;  
                    
                    case 3 : if(play1.monte[i].veloc_0_100 > play2.monte[i].veloc_0_100){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             }
                             break;
                    case 4 : if(play1.monte[i].peso < play2.monte[i].peso){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             } 
                             break;
                    case 5 : if(play1.monte[i].consumo > play2.monte[i].consumo){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             }
                             break;
                    default : System.out.println("Escolha invalida.");
                             break;
                    
                }
            }
            else{
                escolha = gerarEscolha.nextInt(5);
                switch(escolha){
                    case 1 : if(play1.monte[i].potencia > play2.monte[i].potencia){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             } 
                             break;
                    case 2 : if(play1.monte[i].veloc_max > play2.monte[i].veloc_max){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             }
                             break;  
                    
                    case 3 : if(play1.monte[i].veloc_0_100 > play2.monte[i].veloc_0_100){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             }
                             break;
                    case 4 : if(play1.monte[i].peso < play2.monte[i].peso){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             } 
                             break;
                    case 5 : if(play1.monte[i].consumo > play2.monte[i].consumo){
                                play1.pontos++;
                             }   
                             else{
                                play2.pontos++;
                             }
                             break;
                    default : System.out.println("Escolha invalida.");
                             break;
                }
            }
            exibirPlacar();
        }       
    }    
}
