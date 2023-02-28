/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj010_revisao;

/**
 *
 * @author 182210104
 */
public class Proj010_Revisao {

    private String nome;

    private String data_nasc;

    private String cpf;

    private String endereco;

    private int fone;

    private String curso;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

        public String toString(){
        return "\nCurso Selecionado: "+this.curso+
                "\nNome: " +this.nome + "\nData de nascimento: " + this.data_nasc + "\nCPF: " + this.cpf + "\nEndereço: " + this.endereco + "\nTelefone: " + this.fone;
    }

    public static void main(String[] args) {
    }

}
