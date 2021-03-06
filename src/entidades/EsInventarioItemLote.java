package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * EsInventarioItemLote generated by hbm2java
 */
public class EsInventarioItemLote  implements java.io.Serializable {


     private int inventarioItemLoteId;
     private CpCcusto cpCcusto;
     private EsInventarioItemDet esInventarioItemDet;
     private EsLoteRemedio esLoteRemedio;
     private EsPaciente esPaciente;
     private Gusuario gusuario;
     private String lote;
     private Date fabricacao;
     private Date validade;
     private String medicoId;
     private String atendenteId;
     private BigDecimal quant;
     private Date gacesso;
     private long srRecno;

    public EsInventarioItemLote() {
    }

	
    public EsInventarioItemLote(int inventarioItemLoteId, EsInventarioItemDet esInventarioItemDet, BigDecimal quant, Date gacesso, long srRecno) {
        this.inventarioItemLoteId = inventarioItemLoteId;
        this.esInventarioItemDet = esInventarioItemDet;
        this.quant = quant;
        this.gacesso = gacesso;
        this.srRecno = srRecno;
    }
    public EsInventarioItemLote(int inventarioItemLoteId, CpCcusto cpCcusto, EsInventarioItemDet esInventarioItemDet, EsLoteRemedio esLoteRemedio, EsPaciente esPaciente, Gusuario gusuario, String lote, Date fabricacao, Date validade, String medicoId, String atendenteId, BigDecimal quant, Date gacesso, long srRecno) {
       this.inventarioItemLoteId = inventarioItemLoteId;
       this.cpCcusto = cpCcusto;
       this.esInventarioItemDet = esInventarioItemDet;
       this.esLoteRemedio = esLoteRemedio;
       this.esPaciente = esPaciente;
       this.gusuario = gusuario;
       this.lote = lote;
       this.fabricacao = fabricacao;
       this.validade = validade;
       this.medicoId = medicoId;
       this.atendenteId = atendenteId;
       this.quant = quant;
       this.gacesso = gacesso;
       this.srRecno = srRecno;
    }
   
    public int getInventarioItemLoteId() {
        return this.inventarioItemLoteId;
    }
    
    public void setInventarioItemLoteId(int inventarioItemLoteId) {
        this.inventarioItemLoteId = inventarioItemLoteId;
    }
    public CpCcusto getCpCcusto() {
        return this.cpCcusto;
    }
    
    public void setCpCcusto(CpCcusto cpCcusto) {
        this.cpCcusto = cpCcusto;
    }
    public EsInventarioItemDet getEsInventarioItemDet() {
        return this.esInventarioItemDet;
    }
    
    public void setEsInventarioItemDet(EsInventarioItemDet esInventarioItemDet) {
        this.esInventarioItemDet = esInventarioItemDet;
    }
    public EsLoteRemedio getEsLoteRemedio() {
        return this.esLoteRemedio;
    }
    
    public void setEsLoteRemedio(EsLoteRemedio esLoteRemedio) {
        this.esLoteRemedio = esLoteRemedio;
    }
    public EsPaciente getEsPaciente() {
        return this.esPaciente;
    }
    
    public void setEsPaciente(EsPaciente esPaciente) {
        this.esPaciente = esPaciente;
    }
    public Gusuario getGusuario() {
        return this.gusuario;
    }
    
    public void setGusuario(Gusuario gusuario) {
        this.gusuario = gusuario;
    }
    public String getLote() {
        return this.lote;
    }
    
    public void setLote(String lote) {
        this.lote = lote;
    }
    public Date getFabricacao() {
        return this.fabricacao;
    }
    
    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }
    public Date getValidade() {
        return this.validade;
    }
    
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    public String getMedicoId() {
        return this.medicoId;
    }
    
    public void setMedicoId(String medicoId) {
        this.medicoId = medicoId;
    }
    public String getAtendenteId() {
        return this.atendenteId;
    }
    
    public void setAtendenteId(String atendenteId) {
        this.atendenteId = atendenteId;
    }
    public BigDecimal getQuant() {
        return this.quant;
    }
    
    public void setQuant(BigDecimal quant) {
        this.quant = quant;
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




}


