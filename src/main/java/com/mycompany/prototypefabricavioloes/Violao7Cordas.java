/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public class Violao7Cordas extends VioloesPrototype {
    
    protected Violao7Cordas(Violao7Cordas violaoSeteCorda){
        this.valor = violaoSeteCorda.getValor();
	    this.descricao = violaoSeteCorda.getDescricao();
	    this.eletrico = violaoSeteCorda.getEletrico();
	    this.tipoCorda = violaoSeteCorda.getTipoCorda();
    }
    
    public Violao7Cordas(){
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
        return(new Violao7Cordas(this) {});
    }
}