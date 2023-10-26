import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

class Modelo {
    private int codigo;
    private String descricao;

    public Modelo(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}

class Marca {
    private int codigo;
    private String descricao;

    public Marca(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}

class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
}

class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}

class Automovel {
    private String numeroPlaca;
    private String cor;
    private int ano;
    private String tipoCombustivel;
    private int numeroPortas;
    private double quilometragem;
    private String renavam;
    private String chassi;
    private double valorLocacao;
    private Modelo modelo;
    private Marca marca;

    public Automovel(String numeroPlaca, String cor, int ano, String tipoCombustivel, int numeroPortas, double quilometragem,
                     String renavam, String chassi, double valorLocacao, Modelo modelo, Marca marca) {
        this.numeroPlaca = numeroPlaca;
        this.cor = cor;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.numeroPortas = numeroPortas;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
        this.modelo = modelo;
        this.marca = marca;
    }
}

class Locacao {
    private Automovel automovel;
    private String dataHoraLocacao;
    private String dataHoraDevolucao;
    private double valorLocacao;
    private Cliente cliente;

    public Locacao(Automovel automovel, String dataHoraLocacao, String dataHoraDevolucao, double valorLocacao, Cliente cliente) {
        this.automovel = automovel;
        this.dataHoraLocacao = dataHoraLocacao;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.valorLocacao = valorLocacao;
        this.cliente = cliente;
    }
}

public class SistemaLocacaoVeiculos {
    public static void main(String[] args) {
        // Criação de objetos
        Endereco enderecoCliente1 = new Endereco("Rua A", 123, "Bairro 1", "Cidade 1");
        Cliente cliente1 = new Cliente("Cliente 1", "12345678901", "123-456-7890", enderecoCliente1);

        Endereco enderecoCliente2 = new Endereco("Rua B", 456, "Bairro 2", "Cidade 2");
        Cliente cliente2 = new Cliente("Cliente 2", "98765432101", "987-654-3210", enderecoCliente2);

        Marca marca1 = new Marca(1, "Marca 1");
        Modelo modelo1 = new Modelo(101, "Modelo 1");
        Automovel automovel1 = new Automovel("ABC123", "Vermelho", 2023, "Gasolina", 4, 10000, "12345", "67890", 50.0, modelo1, marca1);

        Locacao locacao1 = new Locacao(automovel1, "2023-10-26 10:00", "2023-10-27 10:00", 50.0, cliente1);

        // Exibição de informações
        System.out.println("Informações do Cliente 1:");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        System.out.println("Endereço: " + cliente1.endereco.rua + ", " + cliente1.endereco.numero + ", " + cliente1.endereco.bairro + ", " + cliente1.endereco.cidade);

        System.out.println("\nInformações do Automóvel 1:");
        System.out.println("Placa: " + automovel1.numeroPlaca);
        System.out.println("Cor: " + automovel1.cor);
        System.out.println("Ano: " + automovel1.ano);
        System.out.println("Modelo: " + automovel1.modelo.descricao);
        System.out.println("Marca: " + automovel1.marca.descricao);

        System.out.println("\nInformações da Locação 1:");
        System.out.println("Data e Hora de Locação: " + locacao1.dataHoraLocacao);
        System.out.println("Data e Hora de Devolução: " + locacao1.dataHoraDevolucao);
        System.out.println("Valor da Locação: " + locacao1.valorLocacao);

    }
}
