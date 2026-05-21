package domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jogo")
    private int idJogo;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "genero", length = 50)
    private String genero;

    @Column(name = "preco", nullable = false)
    private float preco;

    @Column(name = "classificacao", length = 20)
    private String classificacao;

    @OneToMany(mappedBy = "jogo")
    private List<ItemVenda> itensVenda = new ArrayList<>();

    public Jogo() {
    }

    public Jogo(int idJogo, String nome, String genero, float preco, String classificacao) {
        this.idJogo = idJogo;
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.classificacao = classificacao;
    }

    public Jogo(String nome, String genero, float preco, String classificacao) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.classificacao = classificacao;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
}