package funcionamento;

public class Carro {

    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;

    void liga() {
        System.out.println("O Carro está ligado");
    }
    void acelera(double quantidade) {
    double velocidadeNova = this.velocidadeAtual + quantidade;
    this.velocidadeAtual = velocidadeNova;
    }
    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 20) {
            return 1;
        }
        if (this.velocidadeAtual >= 20 && this.velocidadeAtual < 40) {
            return 2;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 60) {
            return 3;
        }
        if (this.velocidadeAtual >= 60 && this.velocidadeAtual < 80) {
            return 4;
        }
        if (this.velocidadeAtual >= 80 && this.velocidadeAtual < 100) {
            return 5;
        }
        return 6;
}
}