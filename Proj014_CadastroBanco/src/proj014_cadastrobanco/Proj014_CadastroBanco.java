/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj014_cadastrobanco;

/**
 *
 * @author 182210104
 */
public class Proj014_CadastroBanco {

        private String CodCli;

    public String getCodCli() {
        return CodCli;
    }

    public void setCodCli(String CodCli) {
        this.CodCli = CodCli;
    }
                
        private String nome;
        
        private String telefone;
        
        private String rua;
        
        private String bairro;
        
        private String data;

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
        
        public String toString(){
        return "\nCodigo do Cliente: "+ CodCli +"\nNome: " + nome +"\nTelefone: " + telefone + "\nRua: "+ rua + "\nBairro: "+ bairro + "\nData: "+ data;
        }  
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
