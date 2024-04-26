import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Pessoa> listaPessoas = new ArrayList<>();

    public static void cadastrar(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    public static List<Pessoa> getlistaPessoas() {
        return listaPessoas;
    }


}
