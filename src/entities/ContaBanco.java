package entities;

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
}
