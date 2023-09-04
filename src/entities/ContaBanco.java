package entities;

import java.text.DecimalFormat;

public class ContaBanco {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBanco() {}

    public ContaBanco(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setNomeCliente(nomeCliente);
        this.setSaldo(saldo);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimal = new DecimalFormat("0.00");

        sb.append("Olá ");
        sb.append(this.getNomeCliente());
        sb.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
        sb.append(this.getAgencia());
        sb.append(", conta ");
        sb.append(this.getNumero());
        sb.append(" e seu saldo ");
        sb.append(decimal.format(this.getSaldo()));
        sb.append(" já está disponível!");
        return sb.toString();
    }
}
