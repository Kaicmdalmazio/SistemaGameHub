package domain;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "pagamento")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private int idPagamento;

    @Column(name = "valor", nullable = false)
    private float valor;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private Date dataPagamento;

    @OneToOne
    @JoinColumn(name = "id_compra", nullable = false, unique = true)
    private Venda venda;

    public Pagamento() {
    }

    public Pagamento(int idPagamento, float valor, Date dataPagamento, Venda venda) {
        this.idPagamento = idPagamento;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.venda = venda;
    }

    public Pagamento(float valor, Date dataPagamento, Venda venda) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.venda = venda;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}