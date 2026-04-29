package org.example.administracao;


public class Usuario {
    private Status status;
    protected enum Status {
        ATIVO, AFASTADO, DESLIGADO
    }
    
    private String email;
    private String nome;
    private String senha;
    private String pais;
    private String identificacao;

    // Constructor padrao da classe
    public Usuario(Status status, String email, String nome, String senha, String pais, String identificacao) {
        this.status = status;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.pais = pais;
        this.identificacao = identificacao;
    }

    // Getters e Setters
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
            
}
