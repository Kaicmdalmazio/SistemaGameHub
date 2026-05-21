
package domain;

import java.io.Serializable;
import java.sql.Date;do 


public class Cliente implements Serializable{
    private int idCliente;
    private String nome;
    private String enderecoEmail;
    private String cpf;
    private Date dtNacimento;
    private String telefone;
    
    
    public Cliente(){}
    
    
    //sem o id 
    public Cliente(String nome, String enderecoEmail, String cpf, date dtNacimento, String telefone) {
        this.nome = nome;
        this.enderecoEmail = enderecoEmail;
        this.cpf = cpf;
        this.dtNacimento = dtNacimento;
        this.telefone = telefone;
    }
    
    
    //para tabela com id
    public Cliente(int idCliente, String nome, String enderecoEmail, String cpf, date dtNacimento, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.enderecoEmail = enderecoEmail;
        this.cpf = cpf;
        this.dtNacimento = dtNacimento;
        this.telefone = telefone;
    }
    
    
}
