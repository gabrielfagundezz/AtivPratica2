public class Professor extends Pessoa{

    private String materia;

    public Professor(){

    }

    public Professor(String nome, int idade, String cargo, int cpf, String materia) {

        super(nome, idade, cargo, cpf);
        this.materia = materia;

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nMatéria: " + materia;

    }

    
    
}
