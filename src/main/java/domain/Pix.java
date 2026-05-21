package domain;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "pix")
@DiscriminatorValue("PIX")
@PrimaryKeyJoinColumn(name = "id_pagamento")
public class Pix extends Pagamento {

    @Column(name = "chave_pix", nullable = false, length = 150)
    private String chavePix;

    public Pix() {
    }

    public Pix(float valor, Date dataPagamento, Venda venda, String chavePix) {
        super(valor, dataPagamento, venda);
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}