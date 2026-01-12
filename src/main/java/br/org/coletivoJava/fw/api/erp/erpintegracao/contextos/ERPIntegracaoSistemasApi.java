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
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoApiERPCarameloCode;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfServicoLinkDeEntidadesERP;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfServicoLinkEntreEntidadesErpRestfull;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.reflections.ReflectionUtils;

@InfoApiERPCarameloCode(descricaoApi = "Integração Entre sistemas FWSB", nomeApi = "ERPIntegracao", slugInicial = "apiIntegracao")
public enum ERPIntegracaoSistemasApi implements ItfApiErpSuperBits<ItfIntegracaoERP> {

    RESTFUL;

    @Override
    public Class<? extends ItfIntegracaoERP> getInterface() {

        return ItfIntegracaoERP.class;
    }

    @Override
    public ItfServicoLinkEntreEntidadesErpRestfull getRepositorioLinkEntidadesByID() {
        String classeDTOStr = "br.org.coletivoJava.integracoes.restInterprestfull.implementacao.ServicoLinkEntreEntidadesErpRestfull";
        Class classeRepositorio = ReflectionUtils.forName(classeDTOStr);
        ItfServicoLinkEntreEntidadesErpRestfull repostitorio;
        try {
            repostitorio = (ItfServicoLinkEntreEntidadesErpRestfull) classeRepositorio.newInstance();
            return repostitorio;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ERPIntegracaoSistemasApi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public ItfIntegracaoERP getImplementacaoDoContexto() {

        return ItfApiErpSuperBits.super.getImplementacaoDoContexto(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
