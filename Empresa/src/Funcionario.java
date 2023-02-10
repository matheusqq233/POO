/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 182210104
 */
public class Funcionario {

    //sem retorno e sem argumento
    public String nome;
    public double salarioBase;
    public double dobrarSalario;
    public void dobrarSalario(){
    
    this.dobrarSalario = this.salarioBase*2;
    }
    //com retorno e sem argumento
    public double calcularFerias(){
    
    return this.salarioBase * 1.33;
    }
    //sem retorno e com arumento
    public void descontarAdiantamento(double valor){
        
        this.salarioBase = this.salarioBase - valor;
    }
    
    
    //com retorno e com argumento
    public double calcularHorasExtras(double totalDeHoras){
        
        return this.salarioBase/220*2*totalDeHoras;
    }
}
