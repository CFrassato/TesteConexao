package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * EsMovimentacaoContab generated by hbm2java
 */
public class EsMovimentacaoContab  implements java.io.Serializable {


     private int movimentoId;
     private EsAplicacaoDireta esAplicacaoDireta;
     private EsRecebimento esRecebimento;
     private int emLiquidacao;
     private Date data;
     private String exercicio;
     private String empenho;
     private BigDecimal vlTotal;
     private Integer fonteDestinacaoId;
     private String natDespId;
     private long srRecno;

    public EsMovimentacaoContab() {
    }

	
    public EsMovimentacaoContab(int movimentoId, int emLiquidacao, Date data, long srRecno) {
        this.movimentoId = movimentoId;
        this.emLiquidacao = emLiquidacao;
        this.data = data;
        this.srRecno = srRecno;
    }
    public EsMovimentacaoContab(int movimentoId, EsAplicacaoDireta esAplicacaoDireta, EsRecebimento esRecebimento, int emLiquidacao, Date data, String exercicio, String empenho, BigDecimal vlTotal, Integer fonteDestinacaoId, String natDespId, long srRecno) {
       this.movimentoId = movimentoId;
       this.esAplicacaoDireta = esAplicacaoDireta;
       this.esRecebimento = esRecebimento;
       this.emLiquidacao = emLiquidacao;
       this.data = data;
       this.exercicio = exercicio;
       this.empenho = empenho;
       this.vlTotal = vlTotal;
       this.fonteDestinacaoId = fonteDestinacaoId;
       this.natDespId = natDespId;
       this.srRecno = srRecno;
    }
   
    public int getMovimentoId() {
        return this.movimentoId;
    }
    
    public void setMovimentoId(int movimentoId) {
        this.movimentoId = movimentoId;
    }
    public EsAplicacaoDireta getEsAplicacaoDireta() {
        return this.esAplicacaoDireta;
    }
    
    public void setEsAplicacaoDireta(EsAplicacaoDireta esAplicacaoDireta) {
        this.esAplicacaoDireta = esAplicacaoDireta;
    }
    public EsRecebimento getEsRecebimento() {
        return this.esRecebimento;
    }
    
    public void setEsRecebimento(EsRecebimento esRecebimento) {
        this.esRecebimento = esRecebimento;
    }
    public int getEmLiquidacao() {
        return this.emLiquidacao;
    }
    
    public void setEmLiquidacao(int emLiquidacao) {
        this.emLiquidacao = emLiquidacao;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getExercicio() {
        return this.exercicio;
    }
    
    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }
    public String getEmpenho() {
        return this.empenho;
    }
    
    public void setEmpenho(String empenho) {
        this.empenho = empenho;
    }
    public BigDecimal getVlTotal() {
        return this.vlTotal;
    }
    
    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }
    public Integer getFonteDestinacaoId() {
        return this.fonteDestinacaoId;
    }
    
    public void setFonteDestinacaoId(Integer fonteDestinacaoId) {
        this.fonteDestinacaoId = fonteDestinacaoId;
    }
    public String getNatDespId() {
        return this.natDespId;
    }
    
    public void setNatDespId(String natDespId) {
        this.natDespId = natDespId;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }




}

