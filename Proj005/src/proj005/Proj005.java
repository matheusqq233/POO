package proj005;

import java.util.Scanner;

public class Proj005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite seu nome: ");
        p1.nome = read.nextLine();
        
        System.out.println("Digite sua idade: ");
        p1.setIdade(read.nextInt() );
        
        System.out.println("Digite seu peso: ");
        p1.setPeso(read.nextDouble() );
        
        
        
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.getIdade() );
        System.out.println("Peso: " + p1.getPeso() );
    }
    
}
