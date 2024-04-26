public class Coordenador extends Pessoa{

    private int departamento;

    public Coordenador(String nome, int idade, String cargo, int cpf, int departamento) {

        super(nome, idade, cargo, cpf);
        this.departamento = departamento;

    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        
        return super.toString() + "\nDepartamento: " + departamento;

    }

    
}
