/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author 182210104
 */
public class Pessoa {
    
    //atributos da classe
    public String nome;
    public int anoDeNascimento;
    public byte numeroDeFilhos;
    public double salario; 
    
    //recebendo o ano atual e calculando idade
    public int calcularIdade(int anoAtual){
        return anoAtual - this.anoDeNascimento;
        
        //Calcular idade
    }
}
