package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * LcCombDispBx generated by hbm2java
 */
public class LcCombDispBx  implements java.io.Serializable {


     private int combDispBxId;
     private FrMotorista frMotorista;
     private LcCombDisp lcCombDisp;
     private Date datahora;
     private BigDecimal quant;
     private int hodometro;
     private long srRecno;
     private String autorizacao;
     private String tipoBx;
     private String observacao;
     private Integer depositoId;
     private Integer convenioId;
     private Integer lexCardId;
     private Set cpRequisis = new HashSet(0);
     private Set esRetiradas = new HashSet(0);

    public LcCombDispBx() {
    }

	
    public LcCombDispBx(int combDispBxId, FrMotorista frMotorista, LcCombDisp lcCombDisp, Date datahora, BigDecimal quant, int hodometro, long srRecno, String tipoBx) {
        this.combDispBxId = combDispBxId;
        this.frMotorista = frMotorista;
        this.lcCombDisp = lcCombDisp;
        this.datahora = datahora;
        this.quant = quant;
        this.hodometro = hodometro;
        this.srRecno = srRecno;
        this.tipoBx = tipoBx;
    }
    public LcCombDispBx(int combDispBxId, FrMotorista frMotorista, LcCombDisp lcCombDisp, Date datahora, BigDecimal quant, int hodometro, long srRecno, String autorizacao, String tipoBx, String observacao, Integer depositoId, Integer convenioId, Integer lexCardId, Set cpRequisis, Set esRetiradas) {
       this.combDispBxId = combDispBxId;
       this.frMotorista = frMotorista;
       this.lcCombDisp = lcCombDisp;
       this.datahora = datahora;
       this.quant = quant;
       this.hodometro = hodometro;
       this.srRecno = srRecno;
       this.autorizacao = autorizacao;
       this.tipoBx = tipoBx;
       this.observacao = observacao;
       this.depositoId = depositoId;
       this.convenioId = convenioId;
       this.lexCardId = lexCardId;
       this.cpRequisis = cpRequisis;
       this.esRetiradas = esRetiradas;
    }
   
    public int getCombDispBxId() {
        return this.combDispBxId;
    }
    
    public void setCombDispBxId(int combDispBxId) {
        this.combDispBxId = combDispBxId;
    }
    public FrMotorista getFrMotorista() {
        return this.frMotorista;
    }
    
    public void setFrMotorista(FrMotorista frMotorista) {
        this.frMotorista = frMotorista;
    }
    public LcCombDisp getLcCombDisp() {
        return this.lcCombDisp;
    }
    
    public void setLcCombDisp(LcCombDisp lcCombDisp) {
        this.lcCombDisp = lcCombDisp;
    }
    public Date getDatahora() {
        return this.datahora;
    }
    
    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }
    public BigDecimal getQuant() {
        return this.quant;
    }
    
    public void setQuant(BigDecimal quant) {
        this.quant = quant;
    }
    public int getHodometro() {
        return this.hodometro;
    }
    
    public void setHodometro(int hodometro) {
        this.hodometro = hodometro;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public String getAutorizacao() {
        return this.autorizacao;
    }
    
    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }
    public String getTipoBx() {
        return this.tipoBx;
    }
    
    public void setTipoBx(String tipoBx) {
        this.tipoBx = tipoBx;
    }
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Integer getDepositoId() {
        return this.depositoId;
    }
    
    public void setDepositoId(Integer depositoId) {
        this.depositoId = depositoId;
    }
    public Integer getConvenioId() {
        return this.convenioId;
    }
    
    public void setConvenioId(Integer convenioId) {
        this.convenioId = convenioId;
    }
    public Integer getLexCardId() {
        return this.lexCardId;
    }
    
    public void setLexCardId(Integer lexCardId) {
        this.lexCardId = lexCardId;
    }
    public Set getCpRequisis() {
        return this.cpRequisis;
    }
    
    public void setCpRequisis(Set cpRequisis) {
        this.cpRequisis = cpRequisis;
    }
    public Set getEsRetiradas() {
        return this.esRetiradas;
    }
    
    public void setEsRetiradas(Set esRetiradas) {
        this.esRetiradas = esRetiradas;
    }




}

