/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj06;

/**
 *
 * @author 182210104
 */
public class Data {
    
    private byte dia;
    private byte mes;
    private int ano;
    
    public void setDia(byte dia){
        
        this.dia = dia;
    }
    
    public byte getDia(){
        return this.dia;
    }
    public void setMes(byte mes){
        this.mes = mes;
    }
    public byte getMes(){
        return this.mes;
    }
        public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

        public String toString(){
            return this.dia + "/" + this.mes + "/" + this.ano;
        }
}
