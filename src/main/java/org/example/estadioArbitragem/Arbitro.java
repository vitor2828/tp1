/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.estadioArbitragem;

import java.util.List;
import org.example.administracao.Papel;
import org.example.administracao.Permissao;

public class Arbitro extends Papel{
    
    private final static List<? extends Permissao> listaPermissoes = List.of(new DesignacaoArbitro());
    private int experiencia;
    private String nome;
    private String nacionalidade;
    public Arbitro(String nome, String nacionalidade, int experiencia) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.experiencia = experiencia;
    }
    
    public Arbitro(){
        this.experiencia = experiencia;
        this.nomePapel = "ARBITRO";
    }
  
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        if (experiencia < 0 || experiencia > 30){
            throw new IllegalArgumentException("Experiencia inválida.");
        }
        this.experiencia = experiencia;
        
        
    }
     public void validarNacionalidadePartida(String nacionalidadeSelecao1, String nacionalidadeSelecao2) {
        if (this.nacionalidade.equalsIgnoreCase(nacionalidadeSelecao1) ||
            this.nacionalidade.equalsIgnoreCase(nacionalidadeSelecao2)) {
        throw new IllegalArgumentException("Regra violada: O árbitro não pode atuar em partidas de sua própria nacionalidade.");
}

     }
    @Override
    public String getNomePapel(){
        return nomePapel;
    }
    
    @Override
    public List<? extends Permissao> getPermissoes(){
        return listaPermissoes;
    }
    
    @Override
    public String toString() {
        return "Árbitro";
    }
}