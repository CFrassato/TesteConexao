package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gcbo generated by hbm2java
 */
public class Gcbo  implements java.io.Serializable {


     private String gcboId;
     private String gcboNome;
     private Date gacesso;
     private long srRecno;
     private Set esPacientes = new HashSet(0);

    public Gcbo() {
    }

	
    public Gcbo(String gcboId, String gcboNome, long srRecno) {
        this.gcboId = gcboId;
        this.gcboNome = gcboNome;
        this.srRecno = srRecno;
    }
    public Gcbo(String gcboId, String gcboNome, Date gacesso, long srRecno, Set esPacientes) {
       this.gcboId = gcboId;
       this.gcboNome = gcboNome;
       this.gacesso = gacesso;
       this.srRecno = srRecno;
       this.esPacientes = esPacientes;
    }
   
    public String getGcboId() {
        return this.gcboId;
    }
    
    public void setGcboId(String gcboId) {
        this.gcboId = gcboId;
    }
    public String getGcboNome() {
        return this.gcboNome;
    }
    
    public void setGcboNome(String gcboNome) {
        this.gcboNome = gcboNome;
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


