import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final List<Cliente> clientes = new ArrayList<Cliente>();
    private final List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
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
