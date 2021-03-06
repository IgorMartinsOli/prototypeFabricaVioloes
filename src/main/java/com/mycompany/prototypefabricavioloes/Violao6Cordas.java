/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public class Violao6Cordas extends VioloesPrototype {
    
    protected Violao6Cordas(Violao6Cordas violaoSeisCorda){
            this.valor = violaoSeisCorda.getValor();
	    this.descricao = violaoSeisCorda.getDescricao();
	    this.eletrico = violaoSeisCorda.getEletrico();
	    this.tipoCorda = violaoSeisCorda.getTipoCorda();
    }
    
    public Violao6Cordas(){
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
        return(new Violao6Cordas(this) {});
    }
}
