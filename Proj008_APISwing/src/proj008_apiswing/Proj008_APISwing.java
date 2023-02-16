package proj008_apiswing;

    public class Proj008_APISwing {
        private String nome;
    
        private int idade;
        
        public String getNome(){
            return this.nome;
        }    
        public void setNome(String nome){
            this.nome = nome;
        }
        public int getIdade(){
            return this.idade;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public String toString(){
            return "\nNome: " +this.nome + "\nIdade: " + this.idade;
        }

}
