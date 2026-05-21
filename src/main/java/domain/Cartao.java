package domain;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "cartao")
@DiscriminatorValue("CARTAO")
@PrimaryKeyJoinColumn(name = "id_pagamento")
public class Cartao extends Pagamento {

    @Column(name = "numero_cartao", nullable = false, length = 20)
    private String numeroCartao;

    @Column(name = "nome_titular", nullable = false, length = 100)
    private String nomeTitular;

    @Temporal(TemporalType.DATE)
    @Column(name = "validade", nullable = false)
    private Date validade;

    @Column(name = "cvv", nullable = false, length = 4)
    private String cvv;

    public Cartao() {
    }

    public Cartao(float valor, Date dataPagamento, Venda venda,
                  String numeroCartao, String nomeTitular, Date validade, String cvv) {
        super(valor, dataPagamento, venda);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.cvv = cvv;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}