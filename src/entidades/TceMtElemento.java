package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TceMtElemento generated by hbm2java
 */
public class TceMtElemento  implements java.io.Serializable {


     private String elementoId;
     private String elemento;
     private long srRecno;
     private Date gacesso;
     private Set cpMaterials = new HashSet(0);
     private Set tceMtSubelementos = new HashSet(0);
     private Set tceMtDesdobramentos = new HashSet(0);
     private Set cpMaterialNatDesps = new HashSet(0);

    public TceMtElemento() {
    }

	
    public TceMtElemento(String elementoId, String elemento, long srRecno) {
        this.elementoId = elementoId;
        this.elemento = elemento;
        this.srRecno = srRecno;
    }
    public TceMtElemento(String elementoId, String elemento, long srRecno, Date gacesso, Set cpMaterials, Set tceMtSubelementos, Set tceMtDesdobramentos, Set cpMaterialNatDesps) {
       this.elementoId = elementoId;
       this.elemento = elemento;
       this.srRecno = srRecno;
       this.gacesso = gacesso;
       this.cpMaterials = cpMaterials;
       this.tceMtSubelementos = tceMtSubelementos;
       this.tceMtDesdobramentos = tceMtDesdobramentos;
       this.cpMaterialNatDesps = cpMaterialNatDesps;
    }
   
    public String getElementoId() {
        return this.elementoId;
    }
    
    public void setElementoId(String elementoId) {
        this.elementoId = elementoId;
    }
    public String getElemento() {
        return this.elemento;
    }
    
    public void setElemento(String elemento) {
        this.elemento = elemento;
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
    public Set getTceMtSubelementos() {
        return this.tceMtSubelementos;
    }
    
    public void setTceMtSubelementos(Set tceMtSubelementos) {
        this.tceMtSubelementos = tceMtSubelementos;
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


