/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public class Violao5Cordas extends VioloesPrototype {
    
    protected Violao5Cordas(Violao5Cordas violaoCincoCorda){
        this.valor = violaoCincoCorda.getValor();
	this.descricao = violaoCincoCorda.getDescricao();
	this.eletrico = violaoCincoCorda.getEletrico();
	this.tipoCorda = violaoCincoCorda.getTipoCorda();
    }
    
    public Violao5Cordas(){
        this.valor = 0.0;
	this.descricao = "";
	this.eletrico = false;
	this.tipoCorda = "";
    }
    
    @Override
    public String exibirInfo(){
        return "Valor: "+this.getValor()+"\n"
                + "Descricao: "+this.getDescricao()+"\n"
                + "Eletrico: "+this.getEletrico()+"\n"
                + "Tipo de corda: "+this.toString();
    }

    @Override
    public VioloesPrototype clonar(){
        return(new Violao5Cordas(this) {});
    }
}
