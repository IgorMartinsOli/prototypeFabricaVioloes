/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public class Violao3Cordas extends VioloesPrototype {
    
    protected Violao3Cordas(Violao3Cordas violaoTresCorda){
        this.valor = violaoTresCorda.getValor();
	    this.descricao = violaoTresCorda.getDescricao();
	    this.eletrico = violaoTresCorda.getEletrico();
	    this.tipoCorda = violaoTresCorda.getTipoCorda();
    }
    
    public Violao3Cordas(){
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
        return(new Violao3Cordas(this) {});
    }
}