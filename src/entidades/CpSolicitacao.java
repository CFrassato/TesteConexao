package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CpSolicitacao generated by hbm2java
 */
public class CpSolicitacao  implements java.io.Serializable {


     private CpSolicitacaoId id;
     private CpCcusto cpCcusto;
     private CpCompra cpCompra;
     private CpCondicaoPagamento cpCondicaoPagamento;
     private CpDepartamento cpDepartamento;
     private CpGrupo cpGrupo;
     private CpLocalEntrega cpLocalEntrega;
     private CpPedido cpPedido;
     private CpPrazoExecucao cpPrazoExecucao;
     private CpSecretaria cpSecretaria;
     private CpSubgrupo cpSubgrupo;
     private CpSubTipoCompra cpSubTipoCompra;
     private Integer reduzidoCtaSaldo;
     private String despesaId;
     private Date data;
     private String complemento;
     private Integer solicitacaoExt;
     private int status;
     private long srRecno;
     private BigDecimal valor;
     private Date gacesso;
     private Date datCancel;
     private String motCancel;
     private String usuCancel;
     private String justifica;
     private Character origem;
     private String gusuarioId;
     private String contNumero;
     private int tpMovimentacao;
     private String obraNumero;
     private String gusuarioIdConcluir;
     private String usuAprovou;
     private String ipAprovou;
     private String usuImpressao;
     private Date dtImpressao;
     private String usaSrp;
     private Integer empInstrumentocontrato;
     private int quantParcelas;
     private Date venctoInicial;
     private int prazo;
     private String infAdicional;
     private String obsCotacao;
     private Character convenioSn;
     private String convNumero;
     private String almoxarifado;
     private Date solicitacaoHora;
     private String contDesc;
     private Integer tpMaterialTce;
     private Character remume;
     private Set cpSolicitacaoItems = new HashSet(0);
     private Set cpRequisis = new HashSet(0);

    public CpSolicitacao() {
    }

	
    public CpSolicitacao(CpSolicitacaoId id, CpDepartamento cpDepartamento, CpSecretaria cpSecretaria, Date data, int status, long srRecno, BigDecimal valor, int tpMovimentacao, String usaSrp, int quantParcelas, Date venctoInicial, int prazo, String almoxarifado) {
        this.id = id;
        this.cpDepartamento = cpDepartamento;
        this.cpSecretaria = cpSecretaria;
        this.data = data;
        this.status = status;
        this.srRecno = srRecno;
        this.valor = valor;
        this.tpMovimentacao = tpMovimentacao;
        this.usaSrp = usaSrp;
        this.quantParcelas = quantParcelas;
        this.venctoInicial = venctoInicial;
        this.prazo = prazo;
        this.almoxarifado = almoxarifado;
    }
    public CpSolicitacao(CpSolicitacaoId id, CpCcusto cpCcusto, CpCompra cpCompra, CpCondicaoPagamento cpCondicaoPagamento, CpDepartamento cpDepartamento, CpGrupo cpGrupo, CpLocalEntrega cpLocalEntrega, CpPedido cpPedido, CpPrazoExecucao cpPrazoExecucao, CpSecretaria cpSecretaria, CpSubgrupo cpSubgrupo, CpSubTipoCompra cpSubTipoCompra, Integer reduzidoCtaSaldo, String despesaId, Date data, String complemento, Integer solicitacaoExt, int status, long srRecno, BigDecimal valor, Date gacesso, Date datCancel, String motCancel, String usuCancel, String justifica, Character origem, String gusuarioId, String contNumero, int tpMovimentacao, String obraNumero, String gusuarioIdConcluir, String usuAprovou, String ipAprovou, String usuImpressao, Date dtImpressao, String usaSrp, Integer empInstrumentocontrato, int quantParcelas, Date venctoInicial, int prazo, String infAdicional, String obsCotacao, Character convenioSn, String convNumero, String almoxarifado, Date solicitacaoHora, String contDesc, Integer tpMaterialTce, Character remume, Set cpSolicitacaoItems, Set cpRequisis) {
       this.id = id;
       this.cpCcusto = cpCcusto;
       this.cpCompra = cpCompra;
       this.cpCondicaoPagamento = cpCondicaoPagamento;
       this.cpDepartamento = cpDepartamento;
       this.cpGrupo = cpGrupo;
       this.cpLocalEntrega = cpLocalEntrega;
       this.cpPedido = cpPedido;
       this.cpPrazoExecucao = cpPrazoExecucao;
       this.cpSecretaria = cpSecretaria;
       this.cpSubgrupo = cpSubgrupo;
       this.cpSubTipoCompra = cpSubTipoCompra;
       this.reduzidoCtaSaldo = reduzidoCtaSaldo;
       this.despesaId = despesaId;
       this.data = data;
       this.complemento = complemento;
       this.solicitacaoExt = solicitacaoExt;
       this.status = status;
       this.srRecno = srRecno;
       this.valor = valor;
       this.gacesso = gacesso;
       this.datCancel = datCancel;
       this.motCancel = motCancel;
       this.usuCancel = usuCancel;
       this.justifica = justifica;
       this.origem = origem;
       this.gusuarioId = gusuarioId;
       this.contNumero = contNumero;
       this.tpMovimentacao = tpMovimentacao;
       this.obraNumero = obraNumero;
       this.gusuarioIdConcluir = gusuarioIdConcluir;
       this.usuAprovou = usuAprovou;
       this.ipAprovou = ipAprovou;
       this.usuImpressao = usuImpressao;
       this.dtImpressao = dtImpressao;
       this.usaSrp = usaSrp;
       this.empInstrumentocontrato = empInstrumentocontrato;
       this.quantParcelas = quantParcelas;
       this.venctoInicial = venctoInicial;
       this.prazo = prazo;
       this.infAdicional = infAdicional;
       this.obsCotacao = obsCotacao;
       this.convenioSn = convenioSn;
       this.convNumero = convNumero;
       this.almoxarifado = almoxarifado;
       this.solicitacaoHora = solicitacaoHora;
       this.contDesc = contDesc;
       this.tpMaterialTce = tpMaterialTce;
       this.remume = remume;
       this.cpSolicitacaoItems = cpSolicitacaoItems;
       this.cpRequisis = cpRequisis;
    }
   
    public CpSolicitacaoId getId() {
        return this.id;
    }
    
    public void setId(CpSolicitacaoId id) {
        this.id = id;
    }
    public CpCcusto getCpCcusto() {
        return this.cpCcusto;
    }
    
    public void setCpCcusto(CpCcusto cpCcusto) {
        this.cpCcusto = cpCcusto;
    }
    public CpCompra getCpCompra() {
        return this.cpCompra;
    }
    
    public void setCpCompra(CpCompra cpCompra) {
        this.cpCompra = cpCompra;
    }
    public CpCondicaoPagamento getCpCondicaoPagamento() {
        return this.cpCondicaoPagamento;
    }
    
    public void setCpCondicaoPagamento(CpCondicaoPagamento cpCondicaoPagamento) {
        this.cpCondicaoPagamento = cpCondicaoPagamento;
    }
    public CpDepartamento getCpDepartamento() {
        return this.cpDepartamento;
    }
    
    public void setCpDepartamento(CpDepartamento cpDepartamento) {
        this.cpDepartamento = cpDepartamento;
    }
    public CpGrupo getCpGrupo() {
        return this.cpGrupo;
    }
    
    public void setCpGrupo(CpGrupo cpGrupo) {
        this.cpGrupo = cpGrupo;
    }
    public CpLocalEntrega getCpLocalEntrega() {
        return this.cpLocalEntrega;
    }
    
    public void setCpLocalEntrega(CpLocalEntrega cpLocalEntrega) {
        this.cpLocalEntrega = cpLocalEntrega;
    }
    public CpPedido getCpPedido() {
        return this.cpPedido;
    }
    
    public void setCpPedido(CpPedido cpPedido) {
        this.cpPedido = cpPedido;
    }
    public CpPrazoExecucao getCpPrazoExecucao() {
        return this.cpPrazoExecucao;
    }
    
    public void setCpPrazoExecucao(CpPrazoExecucao cpPrazoExecucao) {
        this.cpPrazoExecucao = cpPrazoExecucao;
    }
    public CpSecretaria getCpSecretaria() {
        return this.cpSecretaria;
    }
    
    public void setCpSecretaria(CpSecretaria cpSecretaria) {
        this.cpSecretaria = cpSecretaria;
    }
    public CpSubgrupo getCpSubgrupo() {
        return this.cpSubgrupo;
    }
    
    public void setCpSubgrupo(CpSubgrupo cpSubgrupo) {
        this.cpSubgrupo = cpSubgrupo;
    }
    public CpSubTipoCompra getCpSubTipoCompra() {
        return this.cpSubTipoCompra;
    }
    
    public void setCpSubTipoCompra(CpSubTipoCompra cpSubTipoCompra) {
        this.cpSubTipoCompra = cpSubTipoCompra;
    }
    public Integer getReduzidoCtaSaldo() {
        return this.reduzidoCtaSaldo;
    }
    
    public void setReduzidoCtaSaldo(Integer reduzidoCtaSaldo) {
        this.reduzidoCtaSaldo = reduzidoCtaSaldo;
    }
    public String getDespesaId() {
        return this.despesaId;
    }
    
    public void setDespesaId(String despesaId) {
        this.despesaId = despesaId;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public Integer getSolicitacaoExt() {
        return this.solicitacaoExt;
    }
    
    public void setSolicitacaoExt(Integer solicitacaoExt) {
        this.solicitacaoExt = solicitacaoExt;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public Date getDatCancel() {
        return this.datCancel;
    }
    
    public void setDatCancel(Date datCancel) {
        this.datCancel = datCancel;
    }
    public String getMotCancel() {
        return this.motCancel;
    }
    
    public void setMotCancel(String motCancel) {
        this.motCancel = motCancel;
    }
    public String getUsuCancel() {
        return this.usuCancel;
    }
    
    public void setUsuCancel(String usuCancel) {
        this.usuCancel = usuCancel;
    }
    public String getJustifica() {
        return this.justifica;
    }
    
    public void setJustifica(String justifica) {
        this.justifica = justifica;
    }
    public Character getOrigem() {
        return this.origem;
    }
    
    public void setOrigem(Character origem) {
        this.origem = origem;
    }
    public String getGusuarioId() {
        return this.gusuarioId;
    }
    
    public void setGusuarioId(String gusuarioId) {
        this.gusuarioId = gusuarioId;
    }
    public String getContNumero() {
        return this.contNumero;
    }
    
    public void setContNumero(String contNumero) {
        this.contNumero = contNumero;
    }
    public int getTpMovimentacao() {
        return this.tpMovimentacao;
    }
    
    public void setTpMovimentacao(int tpMovimentacao) {
        this.tpMovimentacao = tpMovimentacao;
    }
    public String getObraNumero() {
        return this.obraNumero;
    }
    
    public void setObraNumero(String obraNumero) {
        this.obraNumero = obraNumero;
    }
    public String getGusuarioIdConcluir() {
        return this.gusuarioIdConcluir;
    }
    
    public void setGusuarioIdConcluir(String gusuarioIdConcluir) {
        this.gusuarioIdConcluir = gusuarioIdConcluir;
    }
    public String getUsuAprovou() {
        return this.usuAprovou;
    }
    
    public void setUsuAprovou(String usuAprovou) {
        this.usuAprovou = usuAprovou;
    }
    public String getIpAprovou() {
        return this.ipAprovou;
    }
    
    public void setIpAprovou(String ipAprovou) {
        this.ipAprovou = ipAprovou;
    }
    public String getUsuImpressao() {
        return this.usuImpressao;
    }
    
    public void setUsuImpressao(String usuImpressao) {
        this.usuImpressao = usuImpressao;
    }
    public Date getDtImpressao() {
        return this.dtImpressao;
    }
    
    public void setDtImpressao(Date dtImpressao) {
        this.dtImpressao = dtImpressao;
    }
    public String getUsaSrp() {
        return this.usaSrp;
    }
    
    public void setUsaSrp(String usaSrp) {
        this.usaSrp = usaSrp;
    }
    public Integer getEmpInstrumentocontrato() {
        return this.empInstrumentocontrato;
    }
    
    public void setEmpInstrumentocontrato(Integer empInstrumentocontrato) {
        this.empInstrumentocontrato = empInstrumentocontrato;
    }
    public int getQuantParcelas() {
        return this.quantParcelas;
    }
    
    public void setQuantParcelas(int quantParcelas) {
        this.quantParcelas = quantParcelas;
    }
    public Date getVenctoInicial() {
        return this.venctoInicial;
    }
    
    public void setVenctoInicial(Date venctoInicial) {
        this.venctoInicial = venctoInicial;
    }
    public int getPrazo() {
        return this.prazo;
    }
    
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    public String getInfAdicional() {
        return this.infAdicional;
    }
    
    public void setInfAdicional(String infAdicional) {
        this.infAdicional = infAdicional;
    }
    public String getObsCotacao() {
        return this.obsCotacao;
    }
    
    public void setObsCotacao(String obsCotacao) {
        this.obsCotacao = obsCotacao;
    }
    public Character getConvenioSn() {
        return this.convenioSn;
    }
    
    public void setConvenioSn(Character convenioSn) {
        this.convenioSn = convenioSn;
    }
    public String getConvNumero() {
        return this.convNumero;
    }
    
    public void setConvNumero(String convNumero) {
        this.convNumero = convNumero;
    }
    public String getAlmoxarifado() {
        return this.almoxarifado;
    }
    
    public void setAlmoxarifado(String almoxarifado) {
        this.almoxarifado = almoxarifado;
    }
    public Date getSolicitacaoHora() {
        return this.solicitacaoHora;
    }
    
    public void setSolicitacaoHora(Date solicitacaoHora) {
        this.solicitacaoHora = solicitacaoHora;
    }
    public String getContDesc() {
        return this.contDesc;
    }
    
    public void setContDesc(String contDesc) {
        this.contDesc = contDesc;
    }
    public Integer getTpMaterialTce() {
        return this.tpMaterialTce;
    }
    
    public void setTpMaterialTce(Integer tpMaterialTce) {
        this.tpMaterialTce = tpMaterialTce;
    }
    public Character getRemume() {
        return this.remume;
    }
    
    public void setRemume(Character remume) {
        this.remume = remume;
    }
    public Set getCpSolicitacaoItems() {
        return this.cpSolicitacaoItems;
    }
    
    public void setCpSolicitacaoItems(Set cpSolicitacaoItems) {
        this.cpSolicitacaoItems = cpSolicitacaoItems;
    }
    public Set getCpRequisis() {
        return this.cpRequisis;
    }
    
    public void setCpRequisis(Set cpRequisis) {
        this.cpRequisis = cpRequisis;
    }




}


