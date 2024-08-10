import java.util.Scanner;

public class Carro {
    // Atributos
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public String placa;

    //Variáveis
    public int velocidade = 0;
    public char marcha = 'N';
    public boolean ligado = false;

    Carro(String marca, String modelo, int ano, String cor, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }
    Carro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a marca do carro?");
        marca = scanner.nextLine();
        System.out.println("Qual o modelo do carro?");
        modelo = scanner.nextLine();
        System.out.println("Qual o ano do carro?");
        ano = scanner.nextInt();
        System.out.println("Qual a cor do carro?");
        cor = scanner.nextLine();
        System.out.println("Qual a placa do carro?");
        placa = scanner.nextLine();
    }

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
        System.out.println("Carro acelerando");
        velocidade += 10;
    }
    public void frear(){
        System.out.println("Carro freando");
        velocidade -= 10;
    }
    public void velocidadeAtual(){
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
    public void trocarMarcha(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja trocar para qual marcha?");
        System.out.println("R - Ré, N - Neutro, 1 - 1ª, 2 - 2ª, 3 - 3ª, 4 - 4ª, 5 - 5ª");
        char marcha = scanner.next().charAt(0);
        switch (marcha) {
            case 'R':
                System.out.println("Marcha Ré");
                break;
            case 'N':
                System.out.println("Marcha Neutro");
                break;
            case '1':
                System.out.println("Marcha 1ª");
                break;
            case '2':
                System.out.println("Marcha 2ª");
                break;
            case '3':
                System.out.println("Marcha 3ª");
                break;
            case '4':
                System.out.println("Marcha 4ª");
                break;
            case '5':
                System.out.println("Marcha 5ª");
                break;
            default:
                System.out.println("Marcha inválida");
                break;
        }
    }
}
