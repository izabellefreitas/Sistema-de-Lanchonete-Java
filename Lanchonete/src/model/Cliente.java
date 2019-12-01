package model;

/**
 *
 * @author Sonia
 */
public class Cliente {
    private String nomeCliente;
    private int cpf;
    
    public Cliente(String nomeCliente, int cpf){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }
    
    public void setNomeCliente(String nomeCliente)
    {
        this.nomeCliente=nomeCliente;
    }
    
    public String getNomeCliente()
    {
        return this.nomeCliente;
    }
    
    public void setCpf(int cpf)
    {
        this.cpf=cpf;
    }
    
    public int getCpf()
    {
        return this.cpf;
    }
}
