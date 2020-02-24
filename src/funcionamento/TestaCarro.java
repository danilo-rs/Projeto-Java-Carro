package funcionamento;

public class TestaCarro {
    public static void main(String[] args) {
    Carro meuCarro = new Carro();

    meuCarro.cor = "Vermelho";
    meuCarro.modelo = "Ferrari";
    meuCarro.velocidadeAtual = 80;
    meuCarro.velocidadeMaxima = 250;
    meuCarro.liga();

    meuCarro.acelera(50);
    System.out.println("O Carro está com: " +meuCarro.velocidadeAtual+" km/h");
    meuCarro.pegaMarcha();
    System.out.println("O Carro está na marcha: "+meuCarro.pegaMarcha()+".");
    }
}

