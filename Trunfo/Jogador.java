package Trunfo;

//Criação dos jogadores
public class Jogador 
{
    String nome;
    int pontos;
    Carta monte[] = new Carta[5];
    
    Jogador(){
         pontos = 0;   
    
         for(int i=0; i<=4; i++){
            monte[i] = new Carta();
        }
    }
    
    
    void exibirMonte(){
        for(int i=0; i<=4; i++){
            monte[i].exibirCarta();
        }
        
    }
    
}
