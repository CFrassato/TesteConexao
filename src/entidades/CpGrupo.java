package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CpGrupo generated by hbm2java
 */
public class CpGrupo  implements java.io.Serializable {


     private int grupoId;
     private String grupo;
     private long srRecno;
     private Set cpMaterials = new HashSet(0);
     private Set cpSubgrupos = new HashSet(0);
     private Set cpSolicitacaos = new HashSet(0);

    public CpGrupo() {
    }

	
    public CpGrupo(int grupoId, String grupo, long srRecno) {
        this.grupoId = grupoId;
        this.grupo = grupo;
        this.srRecno = srRecno;
    }
    public CpGrupo(int grupoId, String grupo, long srRecno, Set cpMaterials, Set cpSubgrupos, Set cpSolicitacaos) {
       this.grupoId = grupoId;
       this.grupo = grupo;
       this.srRecno = srRecno;
       this.cpMaterials = cpMaterials;
       this.cpSubgrupos = cpSubgrupos;
       this.cpSolicitacaos = cpSolicitacaos;
    }
   
    public int getGrupoId() {
        return this.grupoId;
    }
    
    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
    }
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public long getSrRecno() {
        return this.srRecno;
    }
    
    public void setSrRecno(long srRecno) {
        this.srRecno = srRecno;
    }
    public Set getCpMaterials() {
        return this.cpMaterials;
    }
    
    public void setCpMaterials(Set cpMaterials) {
        this.cpMaterials = cpMaterials;
    }
    public Set getCpSubgrupos() {
        return this.cpSubgrupos;
    }
    
    public void setCpSubgrupos(Set cpSubgrupos) {
        this.cpSubgrupos = cpSubgrupos;
    }
    public Set getCpSolicitacaos() {
        return this.cpSolicitacaos;
    }
    
    public void setCpSolicitacaos(Set cpSolicitacaos) {
        this.cpSolicitacaos = cpSolicitacaos;
    }




}


