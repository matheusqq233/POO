package projeto;

import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Pessoa peop = new Pessoa();
        

        System.out.println("Digite seu nome: ");
        peop.nome = read.nextLine();
        
        System.out.println("Informe o ano do seu nascimento: ");
        peop.anoDeNascimento = read.nextInt();
        
        System.out.println("Informe o ano atual: ");
        int anoAtual = read.nextInt();
        
        System.out.println("Quantos filhos você tem? ");
        peop.numeroDeFilhos = read.nextByte();
        
        System.out.println("Qual o seu salario? ");
        peop.salario = read.nextDouble();
        
        
        System.out.println("Olá " + peop.nome + ", Seu salario é de R$" + peop.salario);
        System.out.println("Você nasceu no ano de " + peop.anoDeNascimento + "e tem " + peop.calcularIdade(anoAtual) + " anos");
        System.out.println("Você tem: "+ peop.numeroDeFilhos + " Filhos");
        
        
    }
    
}
