
package classes;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class Principal {
    public static void main(String[] args) {
    Jogador jogador = new Jogador();
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe o seu nome: ");
    jogador.setNome(ler.nextLine());
    
    System.out.println("Informe qual sua posição(defesa, meio-Campo ou ataque): ");
    jogador.setPosicao(ler.nextLine());
    
    System.out.println("Informe sua nacionalidade: ");
    jogador.setNacionalidade(ler.nextLine());
    
    System.out.println("Informe seu dia e mês de nascimento(xx/xx): ");
    jogador.setDia(ler.nextLine());
    
    System.out.println("Informe o seu ano de nascimento(xxxx): ");
    jogador.setAnoNascimento(ler.nextInt());
    
    System.out.println("Informe sua altura: ");
    jogador.setAltura(ler.nextDouble());
    
    System.out.println("Informe seu peso: ");
    jogador.setPeso(ler.nextDouble());
    
    System.out.println(jogador.toString());
    }
    
}
