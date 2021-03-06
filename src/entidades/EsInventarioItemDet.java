package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * EsInventarioItemDet generated by hbm2java
 */
public class EsInventarioItemDet  implements java.io.Serializable {


     private int inventarioItemDetId;
     private CpSecretaria cpSecretaria;
     private EsInventarioItem esInventarioItem;
     private Gusuario gusuario;
     private String atividade;
     private Integer ganoIdAtiv;
     private BigDecimal quant;
     private char eos;
     private Integer recId;
     private Integer retiradaId;
     private Date gacesso;
     private long srRecno;
     private Integer materialNatDespId;
     private Set esInventarioItemLotes = new HashSet(0);

    public EsInventarioItemDet() {
    }

	
    public EsInventarioItemDet(int inventarioItemDetId, CpSecretaria cpSecretaria, EsInventarioItem esInventarioItem, BigDecimal quant, char eos, Date gacesso, long srRecno) {
        this.inventarioItemDetId = inventarioItemDetId;
        this.cpSecretaria = cpSecretaria;
        this.esInventarioItem = esInventarioItem;
        this.quant = quant;
        this.eos = eos;
        this.gacesso = gacesso;
        this.srRecno = srRecno;
    }
    public EsInventarioItemDet(int inventarioItemDetId, CpSecretaria cpSecretaria, EsInventarioItem esInventarioItem, Gusuario gusuario, String atividade, Integer ganoIdAtiv, BigDecimal quant, char eos, Integer recId, Integer retiradaId, Date gacesso, long srRecno, Integer materialNatDespId, Set esInventarioItemLotes) {
       this.inventarioItemDetId = inventarioItemDetId;
       this.cpSecretaria = cpSecretaria;
       this.esInventarioItem = esInventarioItem;
       this.gusuario = gusuario;
       this.atividade = atividade;
       this.ganoIdAtiv = ganoIdAtiv;
       this.quant = quant;
       this.eos = eos;
       this.recId = recId;
       this.retiradaId = retiradaId;
       this.gacesso = gacesso;
       this.srRecno = srRecno;
       this.materialNatDespId = materialNatDespId;
       this.esInventarioItemLotes = esInventarioItemLotes;
    }
   
    public int getInventarioItemDetId() {
        return this.inventarioItemDetId;
    }
    
    public void setInventarioItemDetId(int inventarioItemDetId) {
        this.inventarioItemDetId = inventarioItemDetId;
    }
    public CpSecretaria getCpSecretaria() {
        return this.cpSecretaria;
    }
    
    public void setCpSecretaria(CpSecretaria cpSecretaria) {
        this.cpSecretaria = cpSecretaria;
    }
    public EsInventarioItem getEsInventarioItem() {
        return this.esInventarioItem;
    }
    
    public void setEsInventarioItem(EsInventarioItem esInventarioItem) {
        this.esInventarioItem = esInventarioItem;
    }
    public Gusuario getGusuario() {
        return this.gusuario;
    }
    
    public void setGusuario(Gusuario gusuario) {
        this.gusuario = gusuario;
    }
    public String getAtividade() {
        return this.atividade;
    }
    
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public Integer getGanoIdAtiv() {
        return this.ganoIdAtiv;
    }
    
    public void setGanoIdAtiv(Integer ganoIdAtiv) {
        this.ganoIdAtiv = ganoIdAtiv;
    }
    public BigDecimal getQuant() {
        return this.quant;
    }
    
    public void setQuant(BigDecimal quant) {
        this.quant = quant;
    }
    public char getEos() {
        return this.eos;
    }
    
    public void setEos(char eos) {
        this.eos = eos;
    }
    public Integer getRecId() {
        return this.recId;
    }
    
    public void setRecId(Integer recId) {
        this.recId = recId;
    }
    public Integer getRetiradaId() {
        return this.retiradaId;
    }
    
    public void setRetiradaId(Integer retiradaId) {
        this.retiradaId = retiradaId;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Integer getMaterialNatDespId() {
        return this.materialNatDespId;
    }
    
    public void setMaterialNatDespId(Integer materialNatDespId) {
        this.materialNatDespId = materialNatDespId;
    }
    public Set getEsInventarioItemLotes() {
        return this.esInventarioItemLotes;
    }
    
    public void setEsInventarioItemLotes(Set esInventarioItemLotes) {
        this.esInventarioItemLotes = esInventarioItemLotes;
    }




}


