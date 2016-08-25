package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CpRequisi generated by hbm2java
 */
public class CpRequisi  implements java.io.Serializable {


     private CpRequisiId id;
     private CpCconsumo cpCconsumo;
     private CpCcusto cpCcusto;
     private CpCompra cpCompra;
     private CpCondicaoPagamento cpCondicaoPagamento;
     private CpLocalEntrega cpLocalEntrega;
     private CpPrazoExecucao cpPrazoExecucao;
     private CpSolicitacao cpSolicitacao;
     private CpSolMat cpSolMat;
     private CpSubTipoCompra cpSubTipoCompra;
     private Gusuario gusuario;
     private LcCombDispBx lcCombDispBx;
     private Integer reduzidoCtaSaldo;
     private Date data;
     private int credor;
     private String atividade;
     private int prazo;
     private String complement;
     private Date previsao;
     private String responsa;
     private String anterior;
     private BigDecimal desconto;
     private Character situacao;
     private String justificativa;
     private BigDecimal valor;
     private char cancelada;
     private Date dtCancela;
     private String empenho;
     private long srRecno;
     private Character convenioSn;
     private String convNumero;
     private String tipResId;
     private String reservaId;
     private String empenhoAut;
     private Date gacesso;
     private String contNumero;
     private String obraNumero;
     private Date dtImpressao;
     private String usuImpressao;
     private Integer empInstrumentocontrato;
     private String almoxarifado;
     private char usaDesconto;
     private Integer tpDesconto;
     private Integer lcBloqueio;
     private Integer lcLocalposto;
     private int formaPagamento;
     private Set esAplicacaoDiretas = new HashSet(0);
     private Set lcCombDisps = new HashSet(0);
     private Set cpRqItenses = new HashSet(0);
     private Set esRecebimentos = new HashSet(0);

    public CpRequisi() {
    }

	
    public CpRequisi(CpRequisiId id, Date data, int credor, int prazo, BigDecimal desconto, BigDecimal valor, char cancelada, long srRecno, String almoxarifado, char usaDesconto, int formaPagamento) {
        this.id = id;
        this.data = data;
        this.credor = credor;
        this.prazo = prazo;
        this.desconto = desconto;
        this.valor = valor;
        this.cancelada = cancelada;
        this.srRecno = srRecno;
        this.almoxarifado = almoxarifado;
        this.usaDesconto = usaDesconto;
        this.formaPagamento = formaPagamento;
    }
    public CpRequisi(CpRequisiId id, CpCconsumo cpCconsumo, CpCcusto cpCcusto, CpCompra cpCompra, CpCondicaoPagamento cpCondicaoPagamento, CpLocalEntrega cpLocalEntrega, CpPrazoExecucao cpPrazoExecucao, CpSolicitacao cpSolicitacao, CpSolMat cpSolMat, CpSubTipoCompra cpSubTipoCompra, Gusuario gusuario, LcCombDispBx lcCombDispBx, Integer reduzidoCtaSaldo, Date data, int credor, String atividade, int prazo, String complement, Date previsao, String responsa, String anterior, BigDecimal desconto, Character situacao, String justificativa, BigDecimal valor, char cancelada, Date dtCancela, String empenho, long srRecno, Character convenioSn, String convNumero, String tipResId, String reservaId, String empenhoAut, Date gacesso, String contNumero, String obraNumero, Date dtImpressao, String usuImpressao, Integer empInstrumentocontrato, String almoxarifado, char usaDesconto, Integer tpDesconto, Integer lcBloqueio, Integer lcLocalposto, int formaPagamento, Set esAplicacaoDiretas, Set lcCombDisps, Set cpRqItenses, Set esRecebimentos) {
       this.id = id;
       this.cpCconsumo = cpCconsumo;
       this.cpCcusto = cpCcusto;
       this.cpCompra = cpCompra;
       this.cpCondicaoPagamento = cpCondicaoPagamento;
       this.cpLocalEntrega = cpLocalEntrega;
       this.cpPrazoExecucao = cpPrazoExecucao;
       this.cpSolicitacao = cpSolicitacao;
       this.cpSolMat = cpSolMat;
       this.cpSubTipoCompra = cpSubTipoCompra;
       this.gusuario = gusuario;
       this.lcCombDispBx = lcCombDispBx;
       this.reduzidoCtaSaldo = reduzidoCtaSaldo;
       this.data = data;
       this.credor = credor;
       this.atividade = atividade;
       this.prazo = prazo;
       this.complement = complement;
       this.previsao = previsao;
       this.responsa = responsa;
       this.anterior = anterior;
       this.desconto = desconto;
       this.situacao = situacao;
       this.justificativa = justificativa;
       this.valor = valor;
       this.cancelada = cancelada;
       this.dtCancela = dtCancela;
       this.empenho = empenho;
       this.srRecno = srRecno;
       this.convenioSn = convenioSn;
       this.convNumero = convNumero;
       this.tipResId = tipResId;
       this.reservaId = reservaId;
       this.empenhoAut = empenhoAut;
       this.gacesso = gacesso;
       this.contNumero = contNumero;
       this.obraNumero = obraNumero;
       this.dtImpressao = dtImpressao;
       this.usuImpressao = usuImpressao;
       this.empInstrumentocontrato = empInstrumentocontrato;
       this.almoxarifado = almoxarifado;
       this.usaDesconto = usaDesconto;
       this.tpDesconto = tpDesconto;
       this.lcBloqueio = lcBloqueio;
       this.lcLocalposto = lcLocalposto;
       this.formaPagamento = formaPagamento;
       this.esAplicacaoDiretas = esAplicacaoDiretas;
       this.lcCombDisps = lcCombDisps;
       this.cpRqItenses = cpRqItenses;
       this.esRecebimentos = esRecebimentos;
    }
   
    public CpRequisiId getId() {
        return this.id;
    }
    
    public void setId(CpRequisiId id) {
        this.id = id;
    }
    public CpCconsumo getCpCconsumo() {
        return this.cpCconsumo;
    }
    
    public void setCpCconsumo(CpCconsumo cpCconsumo) {
        this.cpCconsumo = cpCconsumo;
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
    public CpLocalEntrega getCpLocalEntrega() {
        return this.cpLocalEntrega;
    }
    
    public void setCpLocalEntrega(CpLocalEntrega cpLocalEntrega) {
        this.cpLocalEntrega = cpLocalEntrega;
    }
    public CpPrazoExecucao getCpPrazoExecucao() {
        return this.cpPrazoExecucao;
    }
    
    public void setCpPrazoExecucao(CpPrazoExecucao cpPrazoExecucao) {
        this.cpPrazoExecucao = cpPrazoExecucao;
    }
    public CpSolicitacao getCpSolicitacao() {
        return this.cpSolicitacao;
    }
    
    public void setCpSolicitacao(CpSolicitacao cpSolicitacao) {
        this.cpSolicitacao = cpSolicitacao;
    }
    public CpSolMat getCpSolMat() {
        return this.cpSolMat;
    }
    
    public void setCpSolMat(CpSolMat cpSolMat) {
        this.cpSolMat = cpSolMat;
    }
    public CpSubTipoCompra getCpSubTipoCompra() {
        return this.cpSubTipoCompra;
    }
    
    public void setCpSubTipoCompra(CpSubTipoCompra cpSubTipoCompra) {
        this.cpSubTipoCompra = cpSubTipoCompra;
    }
    public Gusuario getGusuario() {
        return this.gusuario;
    }
    
    public void setGusuario(Gusuario gusuario) {
        this.gusuario = gusuario;
    }
    public LcCombDispBx getLcCombDispBx() {
        return this.lcCombDispBx;
    }
    
    public void setLcCombDispBx(LcCombDispBx lcCombDispBx) {
        this.lcCombDispBx = lcCombDispBx;
    }
    public Integer getReduzidoCtaSaldo() {
        return this.reduzidoCtaSaldo;
    }
    
    public void setReduzidoCtaSaldo(Integer reduzidoCtaSaldo) {
        this.reduzidoCtaSaldo = reduzidoCtaSaldo;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public int getCredor() {
        return this.credor;
    }
    
    public void setCredor(int credor) {
        this.credor = credor;
    }
    public String getAtividade() {
        return this.atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public int getPrazo() {
        return this.prazo;
    }
    
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    public String getComplement() {
        return this.complement;
    }
    
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public Date getPrevisao() {
        return this.previsao;
    }
    
    public void setPrevisao(Date previsao) {
        this.previsao = previsao;
    }
    public String getResponsa() {
        return this.responsa;
    }
    
    public void setResponsa(String responsa) {
        this.responsa = responsa;
    }
    public String getAnterior() {
        return this.anterior;
    }
    
    public void setAnterior(String anterior) {
        this.anterior = anterior;
    }
    public BigDecimal getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    public Character getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }
    public String getJustificativa() {
        return this.justificativa;
    }
    
    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public char getCancelada() {
        return this.cancelada;
    }
    
    public void setCancelada(char cancelada) {
        this.cancelada = cancelada;
    }
    public Date getDtCancela() {
        return this.dtCancela;
    }
    
    public void setDtCancela(Date dtCancela) {
        this.dtCancela = dtCancela;
    }
    public String getEmpenho() {
        return this.empenho;
    }
    
    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
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
    public String getTipResId() {
        return this.tipResId;
    }
    
    public void setTipResId(String tipResId) {
        this.tipResId = tipResId;
    }
    public String getReservaId() {
        return this.reservaId;
    }
    
    public void setReservaId(String reservaId) {
        this.reservaId = reservaId;
    }
    public String getEmpenhoAut() {
        return this.empenhoAut;
    }
    
    public void setEmpenhoAut(String empenhoAut) {
        this.empenhoAut = empenhoAut;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public String getContNumero() {
        return this.contNumero;
    }
    
    public void setContNumero(String contNumero) {
        this.contNumero = contNumero;
    }
    public String getObraNumero() {
        return this.obraNumero;
    }
    
    public void setObraNumero(String obraNumero) {
        this.obraNumero = obraNumero;
    }
    public Date getDtImpressao() {
        return this.dtImpressao;
    }
    
    public void setDtImpressao(Date dtImpressao) {
        this.dtImpressao = dtImpressao;
    }
    public String getUsuImpressao() {
        return this.usuImpressao;
    }
    
    public void setUsuImpressao(String usuImpressao) {
        this.usuImpressao = usuImpressao;
    }
    public Integer getEmpInstrumentocontrato() {
        return this.empInstrumentocontrato;
    }
    
    public void setEmpInstrumentocontrato(Integer empInstrumentocontrato) {
        this.empInstrumentocontrato = empInstrumentocontrato;
    }
    public String getAlmoxarifado() {
        return this.almoxarifado;
    }
    
    public void setAlmoxarifado(String almoxarifado) {
        this.almoxarifado = almoxarifado;
    }
    public char getUsaDesconto() {
        return this.usaDesconto;
    }
    
    public void setUsaDesconto(char usaDesconto) {
        this.usaDesconto = usaDesconto;
    }
    public Integer getTpDesconto() {
        return this.tpDesconto;
    }
    
    public void setTpDesconto(Integer tpDesconto) {
        this.tpDesconto = tpDesconto;
    }
    public Integer getLcBloqueio() {
        return this.lcBloqueio;
    }
    
    public void setLcBloqueio(Integer lcBloqueio) {
        this.lcBloqueio = lcBloqueio;
    }
    public Integer getLcLocalposto() {
        return this.lcLocalposto;
    }
    
    public void setLcLocalposto(Integer lcLocalposto) {
        this.lcLocalposto = lcLocalposto;
    }
    public int getFormaPagamento() {
        return this.formaPagamento;
    }
    
    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public Set getEsAplicacaoDiretas() {
        return this.esAplicacaoDiretas;
    }
    
    public void setEsAplicacaoDiretas(Set esAplicacaoDiretas) {
        this.esAplicacaoDiretas = esAplicacaoDiretas;
    }
    public Set getLcCombDisps() {
        return this.lcCombDisps;
    }
    
    public void setLcCombDisps(Set lcCombDisps) {
        this.lcCombDisps = lcCombDisps;
    }
    public Set getCpRqItenses() {
        return this.cpRqItenses;
    }
    
    public void setCpRqItenses(Set cpRqItenses) {
        this.cpRqItenses = cpRqItenses;
    }
    public Set getEsRecebimentos() {
        return this.esRecebimentos;
    }
    
    public void setEsRecebimentos(Set esRecebimentos) {
        this.esRecebimentos = esRecebimentos;
    }




}

