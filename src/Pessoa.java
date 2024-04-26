public class Pessoa {
    
    private String nome;
    private int idade;
    private String cargo;
    private int cpf;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String cargo, int cpf) {

        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.cpf = cpf;

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nIdade: " + idade + 
                "\nCargo: " + cargo + "\nCPF: " + cpf;
    }

    

    

   

    


}
