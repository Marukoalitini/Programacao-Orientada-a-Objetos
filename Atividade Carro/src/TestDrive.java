public class TestDrive {
    public static void main(String[] args) {
        /*Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.ano = 2020;
        carro.cor = "Vermelho";
        carro.placa = "ABC-1234";
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Placa: " + carro.placa);
        */
        Carro carro = new Carro("Fiat", "Uno", 2020, "Vermelho", "ABC-1234");
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Cor: " + carro.cor);
        System.out.println("Placa: " + carro.placa);
        carro.ligar();
        carro.ligar();
        carro.acelerar();
        carro.velocidadeAtual();
        carro.acelerar();
        carro.velocidadeAtual();
        carro.frear();
        carro.velocidadeAtual();
        carro.desligar();
        carro.desligar();
        carro.trocarMarcha();

        Carro carro2 = new Carro();
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Placa: " + carro2.placa);

        carro2.ligar();
        carro2.ligar();
        carro2.acelerar();
        carro2.velocidadeAtual();
        carro2.acelerar();
        carro2.velocidadeAtual();
        carro2.frear();
        carro2.velocidadeAtual();
        carro2.desligar();
        carro2.desligar();
        carro2.trocarMarcha();


    }
}
