/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author 182210104
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario func = new Funcionario();
        
        func.nome = "Roberto";        
        func.salario = 1500;
        //func.recuperarSalario();
        double salarioRecuperado = func.recuperarSalario(350);
        
        System.out.println("O salario do Roberto é: " + salarioRecuperado);
    }
    
}
