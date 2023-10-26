package lista3;

public class Pessoa {   
	

    private String nome;
    private int idade;

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;   /*this é uma que da acesso aos atributos da classe */ 
        this.idade = idade;
    }

    
    public void fazAniversario() {
        idade++;
    }

    
    public void imprimirIdade() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

}
}