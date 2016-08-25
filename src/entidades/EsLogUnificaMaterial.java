package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * EsLogUnificaMaterial generated by hbm2java
 */
public class EsLogUnificaMaterial  implements java.io.Serializable {


     private int logId;
     private Integer materialId;
     private String material;
     private String elementoId;
     private String subelementoId;
     private String desdobramentoId;
     private Integer materialIdFinal;
     private String materialFinal;
     private String gusuarioId;
     private Date gacesso;
     private String banco;
     private long srRecno;

    public EsLogUnificaMaterial() {
    }

	
    public EsLogUnificaMaterial(int logId, long srRecno) {
        this.logId = logId;
        this.srRecno = srRecno;
    }
    public EsLogUnificaMaterial(int logId, Integer materialId, String material, String elementoId, String subelementoId, String desdobramentoId, Integer materialIdFinal, String materialFinal, String gusuarioId, Date gacesso, String banco, long srRecno) {
       this.logId = logId;
       this.materialId = materialId;
       this.material = material;
       this.elementoId = elementoId;
       this.subelementoId = subelementoId;
       this.desdobramentoId = desdobramentoId;
       this.materialIdFinal = materialIdFinal;
       this.materialFinal = materialFinal;
       this.gusuarioId = gusuarioId;
       this.gacesso = gacesso;
       this.banco = banco;
       this.srRecno = srRecno;
    }
   
    public int getLogId() {
        return this.logId;
    }
    
    public void setLogId(int logId) {
        this.logId = logId;
    }
    public Integer getMaterialId() {
        return this.materialId;
    }
    
    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }
    public String getMaterial() {
        return this.material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getElementoId() {
        return this.elementoId;
    }
    
    public void setElementoId(String elementoId) {
        this.elementoId = elementoId;
    }
    public String getSubelementoId() {
        return this.subelementoId;
    }
    
    public void setSubelementoId(String subelementoId) {
        this.subelementoId = subelementoId;
    }
    public String getDesdobramentoId() {
        return this.desdobramentoId;
    }
    
    public void setDesdobramentoId(String desdobramentoId) {
        this.desdobramentoId = desdobramentoId;
    }
    public Integer getMaterialIdFinal() {
        return this.materialIdFinal;
    }
    
    public void setMaterialIdFinal(Integer materialIdFinal) {
        this.materialIdFinal = materialIdFinal;
    }
    public String getMaterialFinal() {
        return this.materialFinal;
    }
    
    public void setMaterialFinal(String materialFinal) {
        this.materialFinal = materialFinal;
    }
    public String getGusuarioId() {
        return this.gusuarioId;
    }
    
    public void setGusuarioId(String gusuarioId) {
        this.gusuarioId = gusuarioId;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public String getBanco() {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }




}

