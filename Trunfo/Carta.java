package Trunfo;

//Biblioteca de Aleatoriedade (Randomização);
import java.util.Random;

//Criação das cartas do jogo:
public class Carta 
{
    int potencia;
    int veloc_max;
    int veloc_0_100;
    int peso;
    int consumo;
    
    
    Carta(){
        Random gerarValor = new Random();
        potencia = gerarValor.nextInt(600);
        veloc_max = gerarValor.nextInt(395);
        veloc_0_100 = gerarValor.nextInt(45);
        peso = gerarValor.nextInt(2000);
        consumo = gerarValor.nextInt(20);
    }
    
    void exibirCarta(){
        System.out.println("------- Carta -------");
        System.out.println("1 - Potencia...: " + potencia);
        System.out.println("2 - Veloc Max..: " + veloc_max);
        System.out.println("3 - Veloc 0-100: " + veloc_0_100);
        System.out.println("4 - Peso.......: " + peso);
        System.out.println("5 - Consumo....: " + consumo);
        System.out.println("---------------------");
    }
    
}
