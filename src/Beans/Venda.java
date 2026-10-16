package Beans;

import java.sql.Timestamp;

public class Venda {
    private int id;
    private int idCliente;
    private int idVendedor;
    private Timestamp dataVenda;
    private double valorTotal;

    public Venda() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }
    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Timestamp getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(Timestamp dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
