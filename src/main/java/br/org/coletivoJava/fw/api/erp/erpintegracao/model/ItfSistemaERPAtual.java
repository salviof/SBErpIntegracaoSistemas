/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.erpintegracao.model;

import com.super_bits.modulosSB.SBCore.modulos.erp.ItfSistemaERP;

/**
 *
 * @author sfurbino
 */
public interface ItfSistemaERPAtual extends ItfSistemaERP {

    public String getChavePrivada();
}
