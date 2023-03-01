/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj012_jinternalframe;

/**
 *
 * @author 182210104
 */
public class Proj012_JInternalFrame {

        private String nome;
    
        private int idade;
        
        private String cpf;
        
        private String cidade;  
        
        private String telefone;
        
        private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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
        return "\nNome: " +this.nome + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nCidade: " + this.cidade + "\nTelefone: " + this.telefone + "\nEmail: " + this.email;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
