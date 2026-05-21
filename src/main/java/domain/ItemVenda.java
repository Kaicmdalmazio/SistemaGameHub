package domain;

import javax.persistence.*;

@Entity
@Table(name = "item_venda")
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_venda")
    private int idItemVenda;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "preco_unitario", nullable = false)
    private float precoUnitario;

    @ManyToOne
    @JoinColumn(name = "id_compra", nullable = false)
    private Venda venda;

    @ManyToOne
    @JoinColumn(name = "id_jogo", nullable = false)
    private Jogo jogo;

    public ItemVenda() {
    }

    public ItemVenda(int idItemVenda, int quantidade, float precoUnitario, Venda venda, Jogo jogo) {
        this.idItemVenda = idItemVenda;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.venda = venda;
        this.jogo = jogo;
    }

    public ItemVenda(int quantidade, float precoUnitario, Venda venda, Jogo jogo) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.venda = venda;
        this.jogo = jogo;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}