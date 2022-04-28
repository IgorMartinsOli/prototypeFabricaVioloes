/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public abstract class VioloesPrototype {
    protected Double valor;
    protected String descricao;
    protected Boolean eletrico;
    protected String tipoCorda;
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getEletrico() {
        return eletrico;
    }

    public void setEletrico(Boolean eletrico) {
        this.eletrico = eletrico;
    }

    public String getTipoCorda() {
        return tipoCorda;
    }

    public void setTipoCorda(String tipoCorda) {
        this.tipoCorda = tipoCorda;
    }
    
    public abstract String exibirInfo();
    
    public abstract VioloesPrototype clonar();
}
