/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public class Violao4Cordas extends VioloesPrototype {
    
    protected Violao4Cordas(Violao4Cordas violaoQuatroCorda){
        this.valor = violaoQuatroCorda.getValor();
	this.descricao = violaoQuatroCorda.getDescricao();
	this.eletrico = violaoQuatroCorda.getEletrico();
	this.tipoCorda = violaoQuatroCorda.getTipoCorda();
    }
    
    public Violao4Cordas(){
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
        return(new Violao4Cordas(this) {});
    }
}
