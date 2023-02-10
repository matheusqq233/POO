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
class Funcionario {
    String nome;
    double salario;
    
    

    /*
        double recuperarSalario(){
            this.salario=this.salario * 0.9;
         return this.salario;
*\
        //metodo com retorno e argumento
*/
 double recuperarSalario(double bonus){
            this.salario=this.salario * 0.9;
         return this.salario + bonus;

 }
}
