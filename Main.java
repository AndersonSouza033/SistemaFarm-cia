// Importando bibliotecas
import java.util.Scanner;

public class Main {
    // Iniciando o scanner!
    private static final Scanner scanner = new Scanner(System.in);

    // Iniciando o sistema!
    public static void main(String[] args) {
        login();
    }

    // Método de login!
    public static void login(){
        System.out.println("CPF: ");
        long CPF = scanner.nextLong();
        


        Cliente c = BancoDeDados.getClientes().get(CPF);
        if (c != null){
            System.out.println("Achei o cpf!");
            System.err.println(c.getCPF());
        }else{
            System.out.println("Não achei o cpf!");
        }
    }

    // Método para ler os dados do cadastro!
    public static void cadastrarCliente(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Senha: ");
        String senha = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Confirmar senha: ");
        String senha2 = scanner.nextLine();

        System.out.println("Data de Nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer!

        System.out.println("CPF: ");
        int CPF = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer!

        System.out.println("CEP: ");
        int CEP = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer!

        System.out.println("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer!

        System.out.println("Rua: ");
        String rua = scanner.nextLine();

        System.out.println("Bairro: ");
        String bairro = scanner.nextLine();

        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("UF: ");
        String UF = scanner.nextLine();

        // Verifica as senhas estão iguais!
        if (senha.equals(senha2)){
            // Cria um novo cliente com os atributos do método construtor da classe Cliente!
            Cliente cliente = new Cliente(nome, senha, telefone, dataNascimento, idade, CPF, CEP, numero, rua, bairro, cidade, UF);
            
            // Método da classe BancoDeDados para adicionar o novo cliente a tabela ArrayList clientes!
            BancoDeDados.adicionarCliente(cliente);
        }else{
            System.err.println("Erro: as senhas não coincidem!");
        }
    }
}
