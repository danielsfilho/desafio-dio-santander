package entities;

import exceptions.ContaBancoException;

import java.text.DecimalFormat;

public class ContaBanco {
    private Integer numConta;
    private String numAgencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBanco() {}

    public ContaBanco(Integer numConta, String numAgencia, String nomeCliente, Double saldo) {
        this.setNumConta(numConta);
        this.setNumAgencia(numAgencia);
        this.setNomeCliente(nomeCliente);
        this.setSaldo(saldo);
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        if(numConta == null) {
            throw new ContaBancoException("O numero da conta não pode estar vazio!");
        }
        this.numConta = this.numConta;
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        if(numAgencia.isEmpty()) {
            throw new ContaBancoException("O campo de agência não pode estar vazio!");
        }
        this.numAgencia = numAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente.isEmpty()) {
            throw new ContaBancoException("O campo de cliente não pode estar vazio!");
        }
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        if(saldo == null) {
            throw new ContaBancoException("O campo de saldo não pode estar vazio!");
        }
        if(saldo < 0) {
            throw new ContaBancoException("O valor de saldo deve ser maior que 0!");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimal = new DecimalFormat("0.00");

        sb.append("Olá ");
        sb.append(this.getNomeCliente());
        sb.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
        sb.append(this.getNumAgencia());
        sb.append(", conta ");
        sb.append(this.getNumConta());
        sb.append(" e seu saldo ");
        sb.append(decimal.format(this.getSaldo()));
        sb.append(" já está disponível!");
        return sb.toString();
    }
}
