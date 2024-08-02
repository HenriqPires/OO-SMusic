import java.util.ArrayList;
import java.util.List;


public class CD {

    private String titulo;
    private int ano;
    private boolean ehDuplo;

    private Banda banda;
    private List<Musica> musicas;


     public CD(String titulo, int ano, boolean ehDuplo, Banda banda) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;
        this.banda = banda;
        this.musicas = new ArrayList<>();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEhDuplo() {
        return ehDuplo;
    }

    public void setEhDuplo(boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String toString() {
        return "CD: \n" +
                "titulo = " + titulo + "\n" +
                "ano = " + ano + "\n" +
                "ehDuplo = " + ehDuplo + "\n" +
                "banda=" + banda + "\n" +
                "musicas=" + musicas;
    }
}
