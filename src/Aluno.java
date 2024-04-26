public class Aluno extends Pessoa{

    private int matricula;

    public Aluno(String nome, int idade, String cargo, int cpf,int matricula) {

        super(nome, idade, cargo,cpf);
        this.matricula = matricula;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nMatricula: " + matricula;

    }

    
    
}
