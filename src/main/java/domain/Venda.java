package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private int idCompra;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_venda", nullable = false)
    private Date data;

    @Column(name = "valor_venda", nullable = false)
    private float valorVenda;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemVenda> itensVenda = new ArrayList<>();

    @OneToOne(mappedBy = "venda", cascade = CascadeType.ALL)
    private Pagamento pagamento;

    public Venda() {
    }

    public Venda(int idCompra, Date data, float valorVenda, Cliente cliente) {
        this.idCompra = idCompra;
        this.data = data;
        this.valorVenda = valorVenda;
        this.cliente = cliente;
    }

    public Venda(Date data, float valorVenda, Cliente cliente) {
        this.data = data;
        this.valorVenda = valorVenda;
        this.cliente = cliente;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}