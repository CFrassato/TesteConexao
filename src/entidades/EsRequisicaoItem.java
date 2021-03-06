package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * EsRequisicaoItem generated by hbm2java
 */
public class EsRequisicaoItem  implements java.io.Serializable {


     private int reqItemId;
     private CpMaterial cpMaterial;
     private CpMedida cpMedida;
     private EsRequisicao esRequisicao;
     private int itemId;
     private String unid;
     private BigDecimal quant;
     private long srRecno;
     private Set esRetiradaItems = new HashSet(0);

    public EsRequisicaoItem() {
    }

	
    public EsRequisicaoItem(int reqItemId, CpMaterial cpMaterial, EsRequisicao esRequisicao, int itemId, BigDecimal quant, long srRecno) {
        this.reqItemId = reqItemId;
        this.cpMaterial = cpMaterial;
        this.esRequisicao = esRequisicao;
        this.itemId = itemId;
        this.quant = quant;
        this.srRecno = srRecno;
    }
    public EsRequisicaoItem(int reqItemId, CpMaterial cpMaterial, CpMedida cpMedida, EsRequisicao esRequisicao, int itemId, String unid, BigDecimal quant, long srRecno, Set esRetiradaItems) {
       this.reqItemId = reqItemId;
       this.cpMaterial = cpMaterial;
       this.cpMedida = cpMedida;
       this.esRequisicao = esRequisicao;
       this.itemId = itemId;
       this.unid = unid;
       this.quant = quant;
       this.srRecno = srRecno;
       this.esRetiradaItems = esRetiradaItems;
    }
   
    public int getReqItemId() {
        return this.reqItemId;
    }
    
    public void setReqItemId(int reqItemId) {
        this.reqItemId = reqItemId;
    }
    public CpMaterial getCpMaterial() {
        return this.cpMaterial;
    }
    
    public void setCpMaterial(CpMaterial cpMaterial) {
        this.cpMaterial = cpMaterial;
    }
    public CpMedida getCpMedida() {
        return this.cpMedida;
    }
    
    public void setCpMedida(CpMedida cpMedida) {
        this.cpMedida = cpMedida;
    }
    public EsRequisicao getEsRequisicao() {
        return this.esRequisicao;
    }
    
    public void setEsRequisicao(EsRequisicao esRequisicao) {
        this.esRequisicao = esRequisicao;
    }
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getUnid() {
        return this.unid;
    }
    
    public void setUnid(String unid) {
        this.unid = unid;
    }
    public BigDecimal getQuant() {
        return this.quant;
    }
    
    public void setQuant(BigDecimal quant) {
        this.quant = quant;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getEsRetiradaItems() {
        return this.esRetiradaItems;
    }
    
    public void setEsRetiradaItems(Set esRetiradaItems) {
        this.esRetiradaItems = esRetiradaItems;
    }




}


