public class Pessoa {
    
    private String nome;
    private int idade;

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

   
    public void fazAniversario() {
        idade++;
    }

   
    public void imprimirIdade() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    //MAIN PARA EXECUTAR

    public static void main(String[] args) {
        // Criar uma variavel "pessoa", com nome e idade inicial
        Pessoa pessoa = new Pessoa("João", 25);

        // Fazer alguns aniversários
        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        // Imprimir nome e idade
        pessoa.imprimirIdade();
    }
}
