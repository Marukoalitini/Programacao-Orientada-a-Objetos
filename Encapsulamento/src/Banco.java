import java.util.ArrayList;

public class Banco {
    private final ArrayList<Cliente> clientes = new ArrayList<>();
    private final ArrayList<ContaBancaria> contas = new ArrayList<>();
    public void cadastrarCliente(Cliente cliente, ContaBancaria conta){
        clientes.add(cliente);
        contas.add(conta);
        
    }
    public void getClientesNames(){
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNome());
            System.out.println(cliente.getId());
        }
    }
    public Cliente getClienteById(int id){
        for (Cliente cliente : clientes){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }
    public ContaBancaria getContaById(int id){
        for (ContaBancaria conta : contas){
            if (conta.getIdCliente() == id){
                return conta;
            }
        }
        return null;
    }

    public int getProximoIdCliente(){
        return clientes.size() + 1;
    }
}
