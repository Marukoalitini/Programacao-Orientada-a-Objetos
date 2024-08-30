public class ContaBancaria {
    private double saldo;
    private final int idCliente;

    public ContaBancaria(int idCliente){
        this.idCliente = idCliente;
        saldo = 0;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double deposito) {
        this.saldo += deposito;
    }
    public void sacar(double saque) {
        this.saldo -= saque;
    }

}
