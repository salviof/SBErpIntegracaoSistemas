package br.org.coletivoJava.fw.api.erp.erpintegracao.servico;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfRespostaAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfSistemaERP;
import com.super_bits.modulosSB.SBCore.modulos.erp.SolicitacaoControllerERP;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Map;
import br.org.coletivoJava.fw.api.erp.erpintegracao.model.ItfSistemaERPLocal;

/**
 * @author desenvolvedorninja01
 * @since 16/10/2019
 * @version 1.0
 */
public interface ItfIntegracaoERP {

    public ItfResposta getResposta(ItfSistemaERP pSistema, String nomeAcao, ComoEntidadeSimples pParametro);

    public ItfResposta getRespostaComoAdmin(ItfSistemaERP pSistema, String nomeAcao, ComoEntidadeSimples pParametro);

    public String getRespostaJsonString(ItfRespostaAcaoDoSistema pResposta);

    public List<String> getAcoesDisponiveis(ItfSistemaERP pSistema, String nomeAcao, ComoEntidadeSimples pParametro);

    public List<String> getAcoesDisponiveis(ItfSistemaERP pSistema, String nomeAcao);

    public List<String> getAcoesDisponiveis(ItfSistemaERP pSistema);

    public ItfRespostaAcaoDoSistema enviarChavePublica(ItfSistemaERP pSistema);

    public boolean adicionarSistemaConfianca(String pChavePublica, String url);

    public String gerarTokenUsuarioLogado(ItfSistemaERP pSistema);

    public String gerarTokenSistemaComoAdmin(ItfSistemaERP pSistema);

    public ItfSistemaERPLocal getSistemaAtual();

    public ItfSistemaERP getSistemaByChavePublica(String pChavePublica);

    public ItfSistemaERP getSistemaByHashChavePublica(String hashChavePuvlica);

    public ItfSistemaERPLocal getSistemaLocalByHashChavePublica(String hashChavePuvlica);

    public ItfSistemaERP getSistemaByDominio(String pChavePublica);

    public ComoEntidadeSimples gerarConversaoJsonStringToObjeto(ItfSistemaERP pSistema, String pJson);

    public ComoEntidadeSimples gerarConversaoJsonStringToObjeto(String pJson);

    public ComoEntidadeSimples gerarConversaoJsonToObjeto(ItfSistemaERP pSistema, JsonObject pJson);

    public ComoEntidadeSimples gerarConversaoJsonToObjeto(JsonObject pJson);

    /**
     *
     * @param pSistema Servico Remoto Restfull
     * @param pItemToJson Item do tipo @ComoEntidadeSimples que será transformado em
     * Json
     * @param pUsarIdComoIdRemoto Especifica se ao converter o item simples, o
     * id do item deve ser usado como id remoto correspondente
     * @return
     */
    public JsonObject gerarConversaoObjetoToJson(ItfSistemaERP pSistema, ComoEntidadeSimples pItemToJson, boolean pUsarIdComoIdRemoto);

    public JsonObject gerarConversaoObjetoToJson(ComoEntidadeSimples pJson);

    public ItfRespostaAcaoDoSistema gerarRespostaAcaoDoSistemaServico(SolicitacaoControllerERP pSolicitacao);

    public String executarAcaoPacoteServico();

}
