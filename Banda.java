import java.util.ArrayList;
import java.util.List;

public class Banda {
    private String nome;
    private EnumEstilo estilo;
    private List<Musico> musicos;
   
    public Banda(String nome, EnumEstilo estilo) {
        this.nome = nome;
        this.estilo = estilo;
        this.musicos = new ArrayList<>();
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumEstilo getEstilo() {
        return estilo;
    }

    public void setEstilo(EnumEstilo estilo) {
        this.estilo = estilo;
    }

    public List<Musico> getMusicos() {
        return getMusicos();
    }

    public void setMusicos(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public String toString() {
        return "Banda: \n" +
                "nome = " + nome + "\n" +
                "estilo = " + estilo + "\n" +
                "musicos = " + musicos;
    }
}