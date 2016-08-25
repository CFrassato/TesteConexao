package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EsRecebimento generated by hbm2java
 */
public class EsRecebimento  implements java.io.Serializable {


     private int recId;
     private CpCompra cpCompra;
     private CpRequisi cpRequisi;
     private CpSecretaria cpSecretaria;
     private CpSolMat cpSolMat;
     private EsDeposito esDeposito;
     private EsProcessoInventario esProcessoInventario;
     private EsTipoAplicacao esTipoAplicacao;
     private Date data;
     private String nfNumero;
     private String nfSerie;
     private Date nfEmissao;
     private int credorId;
     private String atividade;
     private String gusuarioId;
     private long srRecno;
     private String empenho;
     private BigDecimal desconto;
     private String obs;
     private Integer lcBloqueio;
     private Date gacessoInclusao;
     private String motivoAlteracao;
     private int abastecimento;
     private Set esMovimentacaoContabs = new HashSet(0);
     private Set esRecebimentoItems = new HashSet(0);

    public EsRecebimento() {
    }

	
    public EsRecebimento(int recId, CpSecretaria cpSecretaria, EsDeposito esDeposito, EsTipoAplicacao esTipoAplicacao, Date data, int credorId, long srRecno, int abastecimento) {
        this.recId = recId;
        this.cpSecretaria = cpSecretaria;
        this.esDeposito = esDeposito;
        this.esTipoAplicacao = esTipoAplicacao;
        this.data = data;
        this.credorId = credorId;
        this.srRecno = srRecno;
        this.abastecimento = abastecimento;
    }
    public EsRecebimento(int recId, CpCompra cpCompra, CpRequisi cpRequisi, CpSecretaria cpSecretaria, CpSolMat cpSolMat, EsDeposito esDeposito, EsProcessoInventario esProcessoInventario, EsTipoAplicacao esTipoAplicacao, Date data, String nfNumero, String nfSerie, Date nfEmissao, int credorId, String atividade, String gusuarioId, long srRecno, String empenho, BigDecimal desconto, String obs, Integer lcBloqueio, Date gacessoInclusao, String motivoAlteracao, int abastecimento, Set esMovimentacaoContabs, Set esRecebimentoItems) {
       this.recId = recId;
       this.cpCompra = cpCompra;
       this.cpRequisi = cpRequisi;
       this.cpSecretaria = cpSecretaria;
       this.cpSolMat = cpSolMat;
       this.esDeposito = esDeposito;
       this.esProcessoInventario = esProcessoInventario;
       this.esTipoAplicacao = esTipoAplicacao;
       this.data = data;
       this.nfNumero = nfNumero;
       this.nfSerie = nfSerie;
       this.nfEmissao = nfEmissao;
       this.credorId = credorId;
       this.atividade = atividade;
       this.gusuarioId = gusuarioId;
       this.srRecno = srRecno;
       this.empenho = empenho;
       this.desconto = desconto;
       this.obs = obs;
       this.lcBloqueio = lcBloqueio;
       this.gacessoInclusao = gacessoInclusao;
       this.motivoAlteracao = motivoAlteracao;
       this.abastecimento = abastecimento;
       this.esMovimentacaoContabs = esMovimentacaoContabs;
       this.esRecebimentoItems = esRecebimentoItems;
    }
   
    public int getRecId() {
        return this.recId;
    }
    
    public void setRecId(int recId) {
        this.recId = recId;
    }
    public CpCompra getCpCompra() {
        return this.cpCompra;
    }
    
    public void setCpCompra(CpCompra cpCompra) {
        this.cpCompra = cpCompra;
    }
    public CpRequisi getCpRequisi() {
        return this.cpRequisi;
    }
    
    public void setCpRequisi(CpRequisi cpRequisi) {
        this.cpRequisi = cpRequisi;
    }
    public CpSecretaria getCpSecretaria() {
        return this.cpSecretaria;
    }
    
    public void setCpSecretaria(CpSecretaria cpSecretaria) {
        this.cpSecretaria = cpSecretaria;
    }
    public CpSolMat getCpSolMat() {
        return this.cpSolMat;
    }
    
    public void setCpSolMat(CpSolMat cpSolMat) {
        this.cpSolMat = cpSolMat;
    }
    public EsDeposito getEsDeposito() {
        return this.esDeposito;
    }
    
    public void setEsDeposito(EsDeposito esDeposito) {
        this.esDeposito = esDeposito;
    }
    public EsProcessoInventario getEsProcessoInventario() {
        return this.esProcessoInventario;
    }
    
    public void setEsProcessoInventario(EsProcessoInventario esProcessoInventario) {
        this.esProcessoInventario = esProcessoInventario;
    }
    public EsTipoAplicacao getEsTipoAplicacao() {
        return this.esTipoAplicacao;
    }
    
    public void setEsTipoAplicacao(EsTipoAplicacao esTipoAplicacao) {
        this.esTipoAplicacao = esTipoAplicacao;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getNfNumero() {
        return this.nfNumero;
    }
    
    public void setNfNumero(String nfNumero) {
        this.nfNumero = nfNumero;
    }
    public String getNfSerie() {
        return this.nfSerie;
    }
    
    public void setNfSerie(String nfSerie) {
        this.nfSerie = nfSerie;
    }
    public Date getNfEmissao() {
        return this.nfEmissao;
    }
    
    public void setNfEmissao(Date nfEmissao) {
        this.nfEmissao = nfEmissao;
    }
    public int getCredorId() {
        return this.credorId;
    }
    
    public void setCredorId(int credorId) {
        this.credorId = credorId;
    }
    public String getAtividade() {
        return this.atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public String getGusuarioId() {
        return this.gusuarioId;
    }
    
    public void setGusuarioId(String gusuarioId) {
        this.gusuarioId = gusuarioId;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public String getEmpenho() {
        return this.empenho;
    }
    
    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }
    public BigDecimal getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }
    public Integer getLcBloqueio() {
        return this.lcBloqueio;
    }
    
    public void setLcBloqueio(Integer lcBloqueio) {
        this.lcBloqueio = lcBloqueio;
    }
    public Date getGacessoInclusao() {
        return this.gacessoInclusao;
    }
    
    public void setGacessoInclusao(Date gacessoInclusao) {
        this.gacessoInclusao = gacessoInclusao;
    }
    public String getMotivoAlteracao() {
        return this.motivoAlteracao;
    }
    
    public void setMotivoAlteracao(String motivoAlteracao) {
        this.motivoAlteracao = motivoAlteracao;
    }
    public int getAbastecimento() {
        return this.abastecimento;
    }
    
    public void setAbastecimento(int abastecimento) {
        this.abastecimento = abastecimento;
    }
    public Set getEsMovimentacaoContabs() {
        return this.esMovimentacaoContabs;
    }
    
    public void setEsMovimentacaoContabs(Set esMovimentacaoContabs) {
        this.esMovimentacaoContabs = esMovimentacaoContabs;
    }
    public Set getEsRecebimentoItems() {
        return this.esRecebimentoItems;
    }
    
    public void setEsRecebimentoItems(Set esRecebimentoItems) {
        this.esRecebimentoItems = esRecebimentoItems;
    }




}

