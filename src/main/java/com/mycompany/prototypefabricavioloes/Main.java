/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prototypefabricavioloes;

/**
 *
 * @author igor_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Violao3Cordas PrototypeViolao3Cordas = new Violao3Cordas();
        Violao4Cordas PrototypeViolao4Cordas = new Violao4Cordas();
        Violao5Cordas PrototypeViolao5Cordas = new Violao5Cordas();
        Violao6Cordas PrototypeViolao6Cordas = new Violao6Cordas();
        Violao7Cordas PrototypeViolao7Cordas = new Violao7Cordas();
        
        VioloesPrototype classico = PrototypeViolao6Cordas.clonar();
        classico.setDescricao("O violão clássico é um modelo acústico e funciona com seis cordas (na maioria das vezes, feitas de nylon). "
                + "Além da facilidade em encontrar esse modelo, ele possui um custo mais baixo quando comparado aos outros tipos, e também é"
                + " indicado para iniciantes graças à sua leveza e maciez.");
        classico.setEletrico(false);
        classico.setTipoCorda("Nylon");
        classico.setValor(2000.00);
        
        System.out.println(classico.getDescricao());
        
        VioloesPrototype folk = PrototypeViolao6Cordas.clonar();
        //TODO complementar atributos
        
        VioloesPrototype flet = PrototypeViolao6Cordas.clonar();
        //TODO complementar atributos
        
        VioloesPrototype jumbo = PrototypeViolao6Cordas.clonar();
        //TODO complementar atributos
        
        VioloesPrototype setecordas = PrototypeViolao7Cordas.clonar();
        //TODO complementar atributos
    }
}
