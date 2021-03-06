package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EsAplicacaoDireta generated by hbm2java
 */
public class EsAplicacaoDireta  implements java.io.Serializable {


     private int aplicacaoDiretaId;
     private CpCcusto cpCcusto;
     private CpCompra cpCompra;
     private CpRequisi cpRequisi;
     private CpSecretaria cpSecretaria;
     private CpSolMat cpSolMat;
     private EsDeposito esDeposito;
     private Gusuario gusuario;
     private String nfNumero;
     private String nfSerie;
     private Date nfEmissao;
     private long srRecno;
     private int tipo;
     private String atividade;
     private Integer credorId;
     private BigDecimal desconto;
     private Date dataAplicacao;
     private String obs;
     private String empenho;
     private String solicitanteId;
     private String motivoAlteracao;
     private Set esConsumoContabs = new HashSet(0);
     private Set esMovimentacaoContabs = new HashSet(0);
     private Set esAplicacaoDiretaItems = new HashSet(0);

    public EsAplicacaoDireta() {
    }

	
    public EsAplicacaoDireta(int aplicacaoDiretaId, EsDeposito esDeposito, long srRecno, int tipo) {
        this.aplicacaoDiretaId = aplicacaoDiretaId;
        this.esDeposito = esDeposito;
        this.srRecno = srRecno;
        this.tipo = tipo;
    }
    public EsAplicacaoDireta(int aplicacaoDiretaId, CpCcusto cpCcusto, CpCompra cpCompra, CpRequisi cpRequisi, CpSecretaria cpSecretaria, CpSolMat cpSolMat, EsDeposito esDeposito, Gusuario gusuario, String nfNumero, String nfSerie, Date nfEmissao, long srRecno, int tipo, String atividade, Integer credorId, BigDecimal desconto, Date dataAplicacao, String obs, String empenho, String solicitanteId, String motivoAlteracao, Set esConsumoContabs, Set esMovimentacaoContabs, Set esAplicacaoDiretaItems) {
       this.aplicacaoDiretaId = aplicacaoDiretaId;
       this.cpCcusto = cpCcusto;
       this.cpCompra = cpCompra;
       this.cpRequisi = cpRequisi;
       this.cpSecretaria = cpSecretaria;
       this.cpSolMat = cpSolMat;
       this.esDeposito = esDeposito;
       this.gusuario = gusuario;
       this.nfNumero = nfNumero;
       this.nfSerie = nfSerie;
       this.nfEmissao = nfEmissao;
       this.srRecno = srRecno;
       this.tipo = tipo;
       this.atividade = atividade;
       this.credorId = credorId;
       this.desconto = desconto;
       this.dataAplicacao = dataAplicacao;
       this.obs = obs;
       this.empenho = empenho;
       this.solicitanteId = solicitanteId;
       this.motivoAlteracao = motivoAlteracao;
       this.esConsumoContabs = esConsumoContabs;
       this.esMovimentacaoContabs = esMovimentacaoContabs;
       this.esAplicacaoDiretaItems = esAplicacaoDiretaItems;
    }
   
    public int getAplicacaoDiretaId() {
        return this.aplicacaoDiretaId;
    }
    
    public void setAplicacaoDiretaId(int aplicacaoDiretaId) {
        this.aplicacaoDiretaId = aplicacaoDiretaId;
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
    public Gusuario getGusuario() {
        return this.gusuario;
    }
    
    public void setGusuario(Gusuario gusuario) {
        this.gusuario = gusuario;
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
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getAtividade() {
        return this.atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public Integer getCredorId() {
        return this.credorId;
    }
    
    public void setCredorId(Integer credorId) {
        this.credorId = credorId;
    }
    public BigDecimal getDesconto() {
        return this.desconto;
    }
    
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
    public Date getDataAplicacao() {
        return this.dataAplicacao;
    }
    
    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }
    public String getObs() {
        return this.obs;
    }
    
    public void setObs(String obs) {
        this.obs = obs;
    }
    public String getEmpenho() {
        return this.empenho;
    }
    
    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }
    public String getSolicitanteId() {
        return this.solicitanteId;
    }
    
    public void setSolicitanteId(String solicitanteId) {
        this.solicitanteId = solicitanteId;
    }
    public String getMotivoAlteracao() {
        return this.motivoAlteracao;
    }
    
    public void setMotivoAlteracao(String motivoAlteracao) {
        this.motivoAlteracao = motivoAlteracao;
    }
    public Set getEsConsumoContabs() {
        return this.esConsumoContabs;
    }
    
    public void setEsConsumoContabs(Set esConsumoContabs) {
        this.esConsumoContabs = esConsumoContabs;
    }
    public Set getEsMovimentacaoContabs() {
        return this.esMovimentacaoContabs;
    }
    
    public void setEsMovimentacaoContabs(Set esMovimentacaoContabs) {
        this.esMovimentacaoContabs = esMovimentacaoContabs;
    }
    public Set getEsAplicacaoDiretaItems() {
        return this.esAplicacaoDiretaItems;
    }
    
    public void setEsAplicacaoDiretaItems(Set esAplicacaoDiretaItems) {
        this.esAplicacaoDiretaItems = esAplicacaoDiretaItems;
    }




}


