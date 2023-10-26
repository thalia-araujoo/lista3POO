public class Porta {
    // Atributos
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    // Construtor
    public Porta() {
        aberta = false; // Inicialmente, a porta está fechada
        cor = "branco"; // Cor padrão é branca
        dimensaoX = 80.0; // Dimensões padrão
        dimensaoY = 200.0;
        dimensaoZ = 4.0;
    }

    // Método para abrir a porta
    public void abre() {
        aberta = true;
    }

    // Método para fechar a porta
    public void fecha() {
        aberta = false;
    }

    // Método para pintar a porta com uma cor especificada
    public void pinta(String novaCor) {
        cor = novaCor;
    }

    // Método para verificar se a porta está aberta
    public boolean estaAberta() {
        return aberta;
    }

    public static void main(String[] args) {
        // Criar uma porta
        Porta porta = new Porta();

        // Abrir e fechar a porta
        porta.abre();
        System.out.println("A porta está aberta: " + porta.estaAberta());
        porta.fecha();
        System.out.println("A porta está aberta: " + porta.estaAberta());

        // Pintar a porta de diferentes cores
        porta.pinta("vermelho");
        System.out.println("A cor da porta é: " + porta.cor);

        // Alterar as dimensões da porta
        porta.dimensaoX = 90.0;
        porta.dimensaoY = 210.0;
        porta.dimensaoZ = 5.0;
        System.out.println("Dimensões da porta: " + porta.dimensaoX + "x" + porta.dimensaoY + "x" + porta.dimensaoZ);
    }
}
