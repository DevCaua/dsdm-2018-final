package br.ufg.inf.dsdm.caua539.sitpassmobile.data.Entities;

public class Usuario {

    private String nome;
    private String cpf;
    private String session;
    private double saldo;

    public String getProfilepicurl() {
        return profilepicurl;
    }

    public void setProfilepicurl(String profilepicurl) {
        this.profilepicurl = profilepicurl;
    }

    private String profilepicurl;

    public String getNome() {
        return nome;
    }

    public String getSession() {
        return session;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}
