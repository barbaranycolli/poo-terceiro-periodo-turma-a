package BIM1.Lista5Lojas;

public class Cliente {
        private String nome;
                private int idade;
                private String cidade;
                private String bairro;
                private String rua;
    
    
                public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
                    this.nome = nome;
                    this.idade = idade;
                    this.cidade = cidade;
                    this.bairro = bairro;
                    this.rua = rua;
                }
    
    
               
            public void apresentarse()
            {
                System.out.println("Me chamo " + nome + " tenho " + idade + "anos");
            }
}