/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj011_checkbox;

import java.util.ArrayList;

/**
 *
 * @author 182210104
 */
public class Proj011_CHECKBOX {

    private String nome;
    
    private ArrayList hobby;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList hobby) {
        this.hobby = hobby;
    }
    
    public String toString(){
        return "\nNome: "+ nome;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
