import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bem vindo ao Banco");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Ver Saldo");
            System.out.println("5 - Alterar informações Pessoais");
            System.out.println("6 - Consultar Ids");
            System.out.println("7 - Sair");
            System.out.println("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro");
                    System.out.println("Digite o nome: ");
                    String nome = scanner.nextLine();
                    while (StringUtils.validarInput(nome, "^[A-Za-z\\s]+$")) {
                        System.out.println("Nome inválido. Digite novamente: ");
                        nome = scanner.nextLine();
                    }
                    System.out.println("Digite o cpf: ");
                    String cpf = scanner.nextLine();
                    while (StringUtils.validarInput(cpf, "^\\d{11}$")) {
                        System.out.println("CPF inválido. Digite novamente: ");
                        cpf = scanner.nextLine();
                    }
                    System.out.println("Digite o endereço: ");
                    String endereco = scanner.nextLine();
                    while (StringUtils.validarInput(endereco, "^[A-Za-z0-9\\s,]+$")) {
                        System.out.println("Endereço inválido. Digite novamente: ");
                        endereco = scanner.nextLine();
                    }
                    System.out.println("Digite o telefone: ");
                    String telefone = scanner.nextLine();
                    while (StringUtils.validarInput(telefone, "^\\d{10,11}$")) {
                        System.out.println("Telefone inválido. Digite novamente: ");
                        telefone = scanner.nextLine();
                    }
                    System.out.println("Digite o email: ");
                    String email = scanner.nextLine();
                    while (StringUtils.validarInput(email, "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                        System.out.println("Email inválido. Digite novamente: ");
                        email = scanner.nextLine();
                    }
                    System.out.println("Digite a senha: ");
                    String senha = scanner.nextLine();
                    while (StringUtils.validarInput(senha, "^[A-Za-z0-9@#$%^&+=]{6,}$")) {
                        System.out.println("Senha inválida. Digite novamente: ");
                        senha = scanner.nextLine();
                    }
                    int id = banco.getProximoIdCliente();
                    Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email, senha, id);
                    ContaBancaria conta = new ContaBancaria(id);
                    banco.cadastrarCliente(cliente, conta);

                    System.out.println("Cliente cadastrado com sucesso");
                    break;
                case 2:
                    System.out.println("Depositar");
                    System.out.println("Digite o id do cliente: ");
                    int idDeposito = scanner.nextInt();
                    ContaBancaria contaDeposito = banco.getContaById(idDeposito);
                    if (contaDeposito == null) {
                        System.out.println("Id não encontrado");
                        break;
                    }
                    System.out.println("Insira a quantia de dinheiro a depositar");
                    double quantiaDepositar = scanner.nextDouble();
                    if (quantiaDepositar <= 0) {
                        System.out.println("Quantia de dinheiro inválida");
                        break;
                    }
                    contaDeposito.deposito(quantiaDepositar);
                    System.out.println("Depósito concluído com sucesso, novo Saldo = "+ contaDeposito.getSaldo());
                    break;
                case 3:
                    System.out.println("Sacar");
                    System.out.println("Digite o id do cliente: ");
                    int idSacar = scanner.nextInt();
                    ContaBancaria contaSacar = banco.getContaById(idSacar);
                    if (contaSacar == null) {
                        System.out.println("Id não encontrado");
                        break;
                    }
                    System.out.println("Insira a quantia de dinheiro a sacar");
                    double quantiaSacar = scanner.nextDouble();
                    if (quantiaSacar <= 0) {
                        System.out.println("Quantia de dinheiro inválida");
                        break;
                    }
                    contaSacar.sacar(quantiaSacar);
                    System.out.println("Saque concluído com sucesso, novo Saldo = " + contaSacar.getSaldo());
                    break;
                case 4:
                    System.out.println("Ver Saldo");
                    System.out.println("Digite o id do cliente: ");
                    int idSaldo = scanner.nextInt();
                    ContaBancaria contaSaldo = banco.getContaById(idSaldo);
                    if (contaSaldo == null) {
                        System.out.println("Id não encontrado");
                        break;
                    }
                    System.out.println("Seu salto atual é de : " + contaSaldo.getSaldo());
                    break;
                case 5:
                    System.out.println("Alterar informações Pessoais");
                    System.out.println("Digite o id do cliente: ");
                    int idAlterar = scanner.nextInt();
                    Cliente clienteAlterar = banco.getClienteById(idAlterar);
                    if (clienteAlterar == null) {
                        System.out.println("Id não encontrado");
                        break;
                    }
                    System.out.println("Digite o nome: ");
                    String nomeAlterar = scanner.nextLine();
                    while (StringUtils.validarInput(nomeAlterar, "^[A-Za-z\\s]+$")) {
                        System.out.println("Nome inválido. Digite novamente: ");
                        nomeAlterar = scanner.nextLine();
                    }
                    System.out.println("Digite o cpf: ");
                    String cpfAlterar = scanner.nextLine();
                    while (StringUtils.validarInput(cpfAlterar, "^\\d{11}$")) {
                        System.out.println("CPF inválido. Digite novamente: ");
                        cpfAlterar = scanner.nextLine();
                    }
                    System.out.println("Digite o endereço: ");
                    String enderecoAlterar = scanner.nextLine();
                    while (StringUtils.validarInput(enderecoAlterar, "^[A-Za-z0-9\\s,]+$")) {
                        System.out.println("Endereço inválido. Digite novamente: ");
                        enderecoAlterar = scanner.nextLine();
                    }
                    System.out.println("Digite o telefone: ");
                    String telefoneAlterar = scanner.nextLine();
                    while (StringUtils.validarInput(telefoneAlterar, "^\\d{10,11}$")) {
                        System.out.println("Telefone inválido. Digite novamente: ");
                        telefoneAlterar = scanner.nextLine();
                    }
                    System.out.println("Digite o email: ");
                    String emailAlterar = scanner.nextLine();
                    while (StringUtils.validarInput(emailAlterar, "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                        System.out.println("Email inválido. Digite novamente: ");
                        emailAlterar = scanner.nextLine();
                    }
                    System.out.println("Digite a senha: ");
                    String senhaAlterar = scanner.nextLine();
                    while (StringUtils.validarInput(senhaAlterar, "^[A-Za-z0-9@#$%^&+=]{6,}$")) {
                        System.out.println("Senha inválida. Digite novamente: ");
                        senhaAlterar = scanner.nextLine();
                    }
                    clienteAlterar.setNome(nomeAlterar);
                    clienteAlterar.setCpf(cpfAlterar);
                    clienteAlterar.setEndereco(enderecoAlterar);
                    clienteAlterar.setTelefone(telefoneAlterar);
                    clienteAlterar.setEmail(emailAlterar);
                    clienteAlterar.setSenha(senhaAlterar);
                    System.out.println("Informações alteradas com sucesso");
                    break;
                case 6:
                    System.out.println("Consultar Ids:");
                    banco.getClientesNames();
                case 7:
                    System.out.println("Sair");
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
