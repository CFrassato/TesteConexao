package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TceMtSubelemento generated by hbm2java
 */
public class TceMtSubelemento  implements java.io.Serializable {


     private TceMtSubelementoId id;
     private TceMtElemento tceMtElemento;
     private String subelemento;
     private long srRecno;
     private Date gacesso;
     private Set cpMaterials = new HashSet(0);
     private Set tceMtDesdobramentos = new HashSet(0);
     private Set cpMaterialNatDesps = new HashSet(0);

    public TceMtSubelemento() {
    }

	
    public TceMtSubelemento(TceMtSubelementoId id, TceMtElemento tceMtElemento, String subelemento, long srRecno) {
        this.id = id;
        this.tceMtElemento = tceMtElemento;
        this.subelemento = subelemento;
        this.srRecno = srRecno;
    }
    public TceMtSubelemento(TceMtSubelementoId id, TceMtElemento tceMtElemento, String subelemento, long srRecno, Date gacesso, Set cpMaterials, Set tceMtDesdobramentos, Set cpMaterialNatDesps) {
       this.id = id;
       this.tceMtElemento = tceMtElemento;
       this.subelemento = subelemento;
       this.srRecno = srRecno;
       this.gacesso = gacesso;
       this.cpMaterials = cpMaterials;
       this.tceMtDesdobramentos = tceMtDesdobramentos;
       this.cpMaterialNatDesps = cpMaterialNatDesps;
    }
   
    public TceMtSubelementoId getId() {
        return this.id;
    }
    
    public void setId(TceMtSubelementoId id) {
        this.id = id;
    }
    public TceMtElemento getTceMtElemento() {
        return this.tceMtElemento;
    }
    
    public void setTceMtElemento(TceMtElemento tceMtElemento) {
        this.tceMtElemento = tceMtElemento;
    }
    public String getSubelemento() {
        return this.subelemento;
    }
    
    public void setSubelemento(String subelemento) {
        this.subelemento = subelemento;
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
    public Set getCpMaterials() {
        return this.cpMaterials;
    }
    
    public void setCpMaterials(Set cpMaterials) {
        this.cpMaterials = cpMaterials;
    }
    public Set getTceMtDesdobramentos() {
        return this.tceMtDesdobramentos;
    }
    
    public void setTceMtDesdobramentos(Set tceMtDesdobramentos) {
        this.tceMtDesdobramentos = tceMtDesdobramentos;
    }
    public Set getCpMaterialNatDesps() {
        return this.cpMaterialNatDesps;
    }
    
    public void setCpMaterialNatDesps(Set cpMaterialNatDesps) {
        this.cpMaterialNatDesps = cpMaterialNatDesps;
    }




}

