public class Cliente {
    // Atributos principais!
    private String nome;
    private String senha;
    private String telefone;
    private String dataNascimento;
    private int idade;
    private long CPF;

    // Atributos de endereço!
    private int CEP;
    private int numero;
    private final String rua;
    private String bairro;
    private String cidade;
    private String UF;

    // Atributos de saúde!
    private float altura;
    private float peso;
    private String sangue;

    // Métodos Getters!
    public String getNome(){
        return nome;
    }

    public String getSenha(){
        return senha;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    public int getIdade(){
        return idade;
    }

    public long getCPF(){
        return CPF;
    }

    public int getCEP(){
        return CEP;
    }

    public int getNumero(){
        return numero;
    }

    public String getRua(){
        return rua;
    }

    public String getBairro(){
        return bairro;
    }

    public String getCidade(){
        return cidade;
    }

    public String getUF(){
        return UF;
    }

    public float getAltura(){
        return altura;
    }

    public float getPeso(){
        return peso;
    }

    public String getSangue(){
        return sangue;
    }

    // Métodos Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCPF(long CPF){
        this.CPF = CPF;
    }

    public void setCEP(int CEP){
        this.CEP = CEP;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setUF(String UF){
        this.UF = UF;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public void setSangue(String sangue){
        this.sangue = sangue;
    }

    // Método contrutor!
    public Cliente(String nome, String senha,String telefone, String dataNascimento, int idade, long CPF, int CEP, int numero, String rua, String bairro, String cidade, String UF){
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.CPF = CPF;
        this.CEP = CEP;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }

}