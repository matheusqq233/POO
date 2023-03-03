/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj012_jinternalframe;

import java.util.ArrayList;

/**
 *
 * @author 182210104
 */
public class Proj012_JInternalFrame {

        private String nome;
        
        private String telefone;
        
        private String email;
        
        private String sexo;
        
        private ArrayList formapaga;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList getFormapaga() {
        return formapaga;
    }

    public void setFormapaga(ArrayList formapaga) {
        this.formapaga = formapaga;
    }
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "\nNome: " + nome +"\nTelefone: " + telefone + "\nEmail: " + email + "\nSexo: " + sexo + "\nForma de pagamento: " + formapaga;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}