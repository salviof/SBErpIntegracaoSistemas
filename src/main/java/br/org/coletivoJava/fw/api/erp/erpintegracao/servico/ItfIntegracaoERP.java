package br.org.coletivoJava.fw.api.erp.erpintegracao.servico;

import br.org.coletivoJava.fw.api.erp.erpintegracao.model.ItfSistemaERPAtual;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfRespostaAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfSistemaERP;
import com.super_bits.modulosSB.SBCore.modulos.erp.SolicitacaoControllerERP;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import jakarta.json.JsonObject;
import java.util.List;

/**
 * @author desenvolvedorninja01
 * @since 16/10/2019
 * @version 1.0
 */
public interface ItfIntegracaoERP {

    public ItfResposta getResposta(ItfSistemaERP pSistema, String nomeAcao, ItfBeanSimples pParametro);

    public List<String> getAcoesDisponiveis(ItfSistemaERP pSistema, String nomeAcao, ItfBeanSimples pParametro);

    public List<String> getAcoesDisponiveis(ItfSistemaERP pSistema, String nomeAcao);

    public List<String> getAcoesDisponiveis(ItfSistemaERP pSistema);

    public ItfRespostaAcaoDoSistema enviarChavePublica(ItfSistemaERP pSistema);

    public boolean adicionarSistemaConfianca(String pChavePublica, String url);

    public String gerarTokenUsuarioLogado(ItfSistemaERP pSistema);

    public ItfSistemaERPAtual getSistemaAtual();

    public ItfSistemaERP getSistemaByChavePublica(String pChavePublica);

    public ItfSistemaERP getSistemaByHashChavePublica(String hashChavePuvlica);

    public ItfSistemaERP getSistemaByDominio(String pChavePublica);

    public ItfBeanSimples gerarConversaoJsonStringToObjeto(ItfSistemaERP pSistema, String pJson);

    public ItfBeanSimples gerarConversaoJsonStringToObjeto(String pJson);

    public ItfBeanSimples gerarConversaoJsonToObjeto(ItfSistemaERP pSistema, JsonObject pJson);

    public ItfBeanSimples gerarConversaoJsonToObjeto(JsonObject pJson);

    public JsonObject gerarConversaoObjetoToJson(ItfSistemaERP pSistema, ItfBeanSimples pJson);

    public JsonObject gerarConversaoObjetoToJson(ItfBeanSimples pJson);

    public ItfRespostaAcaoDoSistema getRespostaAcaoDoSistema(SolicitacaoControllerERP pSolicitacao);

    public String executarAcaoPacoteServico();

}
