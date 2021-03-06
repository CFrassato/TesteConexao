package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CpPedidoItem generated by hbm2java
 */
public class CpPedidoItem  implements java.io.Serializable {


     private int pedidoItemId;
     private CpMaterial cpMaterial;
     private CpMedida cpMedida;
     private CpPedido cpPedido;
     private int item;
     private BigDecimal quant;
     private String unid;
     private String compl;
     private BigDecimal prUnit;
     private BigDecimal prTotal;
     private String despesaId;
     private long srRecno;
     private Date gacesso;
     private Set cpSolicitacaoItems = new HashSet(0);

    public CpPedidoItem() {
    }

	
    public CpPedidoItem(int pedidoItemId, CpMaterial cpMaterial, CpPedido cpPedido, int item, BigDecimal quant, BigDecimal prUnit, BigDecimal prTotal, long srRecno) {
        this.pedidoItemId = pedidoItemId;
        this.cpMaterial = cpMaterial;
        this.cpPedido = cpPedido;
        this.item = item;
        this.quant = quant;
        this.prUnit = prUnit;
        this.prTotal = prTotal;
        this.srRecno = srRecno;
    }
    public CpPedidoItem(int pedidoItemId, CpMaterial cpMaterial, CpMedida cpMedida, CpPedido cpPedido, int item, BigDecimal quant, String unid, String compl, BigDecimal prUnit, BigDecimal prTotal, String despesaId, long srRecno, Date gacesso, Set cpSolicitacaoItems) {
       this.pedidoItemId = pedidoItemId;
       this.cpMaterial = cpMaterial;
       this.cpMedida = cpMedida;
       this.cpPedido = cpPedido;
       this.item = item;
       this.quant = quant;
       this.unid = unid;
       this.compl = compl;
       this.prUnit = prUnit;
       this.prTotal = prTotal;
       this.despesaId = despesaId;
       this.srRecno = srRecno;
       this.gacesso = gacesso;
       this.cpSolicitacaoItems = cpSolicitacaoItems;
    }
   
    public int getPedidoItemId() {
        return this.pedidoItemId;
    }
    
    public void setPedidoItemId(int pedidoItemId) {
        this.pedidoItemId = pedidoItemId;
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
    public CpPedido getCpPedido() {
        return this.cpPedido;
    }
    
    public void setCpPedido(CpPedido cpPedido) {
        this.cpPedido = cpPedido;
    }
    public int getItem() {
        return this.item;
    }
    
    public void setItem(int item) {
        this.item = item;
    }
    public BigDecimal getQuant() {
        return this.quant;
    }
    
    public void setQuant(BigDecimal quant) {
        this.quant = quant;
    }
    public String getUnid() {
        return this.unid;
    }
    
    public void setUnid(String unid) {
        this.unid = unid;
    }
    public String getCompl() {
        return this.compl;
    }
    
    public void setCompl(String compl) {
        this.compl = compl;
    }
    public BigDecimal getPrUnit() {
        return this.prUnit;
    }
    
    public void setPrUnit(BigDecimal prUnit) {
        this.prUnit = prUnit;
    }
    public BigDecimal getPrTotal() {
        return this.prTotal;
    }
    
    public void setPrTotal(BigDecimal prTotal) {
        this.prTotal = prTotal;
    }
    public String getDespesaId() {
        return this.despesaId;
    }
    
    public void setDespesaId(String despesaId) {
        this.despesaId = despesaId;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Date getGacesso() {
        return this.gacesso;
    }
    
    public void setGacesso(Date gacesso) {
        this.gacesso = gacesso;
    }
    public Set getCpSolicitacaoItems() {
        return this.cpSolicitacaoItems;
    }
    
    public void setCpSolicitacaoItems(Set cpSolicitacaoItems) {
        this.cpSolicitacaoItems = cpSolicitacaoItems;
    }




}


