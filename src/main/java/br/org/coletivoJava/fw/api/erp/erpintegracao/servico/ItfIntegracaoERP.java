package br.org.coletivoJava.fw.api.erp.erpintegracao.servico;

import br.org.coletivoJava.fw.api.erp.erpintegracao.model.ItfSistemaERPAtual;
import br.org.coletivoJava.fw.api.erp.erpintegracao.model.ItfSistemaErp;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfRespostaAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.List;

/**
 * @author desenvolvedorninja01
 * @since 16/10/2019
 * @version 1.0
 */
public interface ItfIntegracaoERP {

    public ItfRespostaAcaoDoSistema getResposta(ItfSistemaErp pSistema, String nomeAcao, ItfBeanSimples pParametro);

    public List<String> getAcoesDisponiveis(ItfSistemaErp pSistema, String nomeAcao, ItfBeanSimples pParametro);

    public List<String> getAcoesDisponiveis(ItfSistemaErp pSistema, String nomeAcao);

    public List<String> getAcoesDisponiveis(ItfSistemaErp pSistema);

    public ItfRespostaAcaoDoSistema enviarChavePublica(ItfSistemaErp pSistema);

    public boolean adicionarSistemaConfianca(String pChavePublica, String url);

    public String gerarTokenUsuarioLogado(ItfSistemaErp pSistema);

    public ItfSistemaERPAtual getSistemaAtual();

}
