public class Carro {
    // Atributos
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public String placa;

    //
    public int velocidade = 0;
    public int marcha = 0;
    public boolean ligado = false;

    // Métodos
    public void ligar() {
        if (ligado) {
            System.out.println("Carro já está ligado");
        }
        else {
            System.out.println("Carro ligado");
            ligado = true;
        }
    }
    public void desligar(){
        if (ligado) {
            System.out.println("Carro desligado");
            ligado = false;
        }
        else {
            System.out.println("Carro já está desligado");
        }
    }
    public void acelerar(){

    }
    public void frear(){
        System.out.println("Carro freando");
    }
    public void trocarMarcha(){
        System.out.println("Carro trocando marcha");
    }
}
