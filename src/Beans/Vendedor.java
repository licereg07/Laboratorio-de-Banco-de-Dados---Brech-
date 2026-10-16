package Beans;

public class Vendedor {
    private int id;
    private String nome;
    private String cpf;
    private double comissao;

    public Vendedor() {}

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getCpf() { 
        return cpf; 
    }
    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public double getComissao() { 
        return comissao; 
    }
    public void setComissao(double comissao) { 
        this.comissao = comissao; 
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
