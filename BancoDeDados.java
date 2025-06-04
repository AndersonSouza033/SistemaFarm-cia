// Importando bibliotecas
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {
    // Criando uma tabela ArrayList para armazenar clientes!
    private static Map<Long, Cliente> clientes = new HashMap<>();

    // Criando um Cliente na ArrayList de clientes para teste!
    static{
        Cliente cliente = new Cliente("Anderson Souza", "1234", "(27) 9 9602-8417", "29/05/2005", 20, 12345678900l, 29100100, 10, "Rua 10", "bairro", "cidade", "UF");
        getClientes().put(cliente.getCPF(), cliente);
    }

    // Métodos Getters!
    public static Map<Long, Cliente> getClientes(){
        return clientes;
    }

    // Métodos Setters
    public static void setClientes(Map<Long, Cliente> clientes){
        BancoDeDados.clientes = clientes;
    }

    // Método para adicionar o cliente a tabela!
    public static void adicionarCliente(Cliente cliente){
        if (clientes.containsKey(cliente.getCPF())){
            System.out.println("CPF já cadastrado!");
            return;
        }
        getClientes().put(cliente.getCPF(), cliente);
    }
}
