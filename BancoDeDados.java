// Importando bibliotecas
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    // Criando uma tabela ArrayList para armazenar clientes!
    private static List<Cliente> clientes = new ArrayList<>();

    // Métodos Getters!
    public List<Cliente> getClientes(){
        return clientes;
    }

    // Métodos Setters
    public void setClientes(List<Cliente> clientes){
        BancoDeDados.clientes = clientes;
    }

}
