/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.tpis2.trabalho.banco.entidade;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Pedro
 */
@Named(value = "deposito")
@Dependent
public class Deposito extends Transacao {

    /**
     * Creates a new instance of Deposito
     */
    private Conta contaDestino;
    
    public Deposito() {
    }
    
}
