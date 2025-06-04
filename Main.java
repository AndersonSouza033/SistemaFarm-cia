// Importando bibliotecas
import java.util.Scanner;

public class Main {
    // Iniciando o scanner!
    private static final Scanner scanner = new Scanner(System.in);

    // Iniciando o sistema!
    public static void main(String[] args) {
        recuperarSenha();
        login();
    }

    // Método para recuperar senha!
    public static void recuperarSenha(){
        System.out.println("Digite seu CPF: ");
        Long CPF = scanner.nextLong();
        scanner.nextLine(); // Limpar Buffer!
        
        // Procura na lista direto pelo CPF!
        Cliente c = BancoDeDados.getClientes().get(CPF);
        // Verifica se achou o CPF na lista e pede a nova senha!
        if (c != null){
            System.out.println("Nova senha: ");
            String novaSenha = scanner.nextLine();
            // Salva a nova senha na lista!
            c.setSenha(novaSenha);
        }else{
            System.err.println("CPF inválido ou não cadastrado!");
        }
    }

    // Método de login!
    public static void login(){
        System.out.println("CPF: ");
        long CPF = scanner.nextLong();
        scanner.nextLine(); // Limpar Buffer!

        System.out.println("Senha: ");
        String senha = scanner.nextLine();
        
        // Procura na lista direto pelo CPF!
        Cliente c = BancoDeDados.getClientes().get(CPF);
        // Verifica se achou o cliente na lista e verifica a senha se está correta!
        if (c != null && c.getSenha().equals(senha)){
            System.out.println("Longin efetuado!");
        }else{
            System.out.println("CPF ou senha incorretos!");
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
