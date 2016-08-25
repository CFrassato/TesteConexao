package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gparentesco generated by hbm2java
 */
public class Gparentesco  implements java.io.Serializable {


     private int gparCodigo;
     private String gparDescricao;
     private Date gacesso;
     private long srRecno;
     private Set esPacientes = new HashSet(0);

    public Gparentesco() {
    }

	
    public Gparentesco(int gparCodigo, long srRecno) {
        this.gparCodigo = gparCodigo;
        this.srRecno = srRecno;
    }
    public Gparentesco(int gparCodigo, String gparDescricao, Date gacesso, long srRecno, Set esPacientes) {
       this.gparCodigo = gparCodigo;
       this.gparDescricao = gparDescricao;
       this.gacesso = gacesso;
       this.srRecno = srRecno;
       this.esPacientes = esPacientes;
    }
   
    public int getGparCodigo() {
        return this.gparCodigo;
    }
    
    public void setGparCodigo(int gparCodigo) {
        this.gparCodigo = gparCodigo;
    }
    public String getGparDescricao() {
        return this.gparDescricao;
    }
    
    public void setGparDescricao(String gparDescricao) {
        this.gparDescricao = gparDescricao;
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
    public Set getEsPacientes() {
        return this.esPacientes;
    }
    
    public void setEsPacientes(Set esPacientes) {
        this.esPacientes = esPacientes;
    }




}


