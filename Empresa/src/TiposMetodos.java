/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 182210104
 */
public class TiposMetodos {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        
        f1.nome = "Carla";
        f1.salarioBase = 6327.30;
        
        //invocando metodo sem retorno e sem argumento
        //f1.dobrarSalario();
        
        //invocando metodo sem retorno e com argumento
        f1.descontarAdiantamento(200);
        
        //invocando metodo com retorno e sem agumento
        
        double ferias = f1.calcularFerias();
        
        //invocando metodo com retorno e com argumento
        
        double horasExtras = f1.calcularHorasExtras(15);
        
        //exibindo as informaçoes na tela
        System.out.println("Olá " + f1.nome + ", seu salario é de R$ " + f1.salarioBase);
        System.out.println("O valor de suas férias é de R$ " + ferias);
        System.out.println("O valor de suas horas extras é de R$ " + horasExtras);
        
        
    f1.dobrarSalario();
    System.out.println("Olá: " + f1.nome + ", seu salario é de R$ " + f1.dobrarSalario);    
    }
}
