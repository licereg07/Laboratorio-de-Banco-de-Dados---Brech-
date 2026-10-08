package beans;

public class Brecho {
    
    // Atributos privados
    private int id;
    private String titulo;
    private String marca;
    private String categoria;
    private String tamanho;
    private String condicao;
    private double preco;
    private String status;

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCondicao() {
        return condicao;
    }

    public double getPreco() {
        return preco;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
