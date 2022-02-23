/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.erpintegracao.contextos;

/**
 *
 * @author desenvolvedorninja01
 */
import br.org.coletivoJava.fw.api.erp.erpintegracao.servico.ItfIntegracaoERP;
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

@ApiERPColetivoJavaFW(descricaoApi = "Integração Entre sistemas FWSB", nomeApi = "ERPIntegracao", slugInicial = "apiIntegracao")
public enum ERPIntegracaoSistemasApi implements ItfApiErpSuperBits<ItfIntegracaoERP> {

    RESTFUL;

    @Override
    public Class<? extends ItfIntegracaoERP> getInterface() {

        return ItfIntegracaoERP.class;
    }
}
