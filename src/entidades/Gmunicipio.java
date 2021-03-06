package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gmunicipio generated by hbm2java
 */
public class Gmunicipio  implements java.io.Serializable {


     private int gmunicipioId;
     private Gsinpas gsinpas;
     private Guf guf;
     private String municipio;
     private String cep;
     private long srRecno;
     private Date gacesso;
     private Integer tceMunicipioId;
     private Set frMotoristas = new HashSet(0);
     private Set esPacientes = new HashSet(0);

    public Gmunicipio() {
    }

	
    public Gmunicipio(int gmunicipioId, String municipio, long srRecno) {
        this.gmunicipioId = gmunicipioId;
        this.municipio = municipio;
        this.srRecno = srRecno;
    }
    public Gmunicipio(int gmunicipioId, Gsinpas gsinpas, Guf guf, String municipio, String cep, long srRecno, Date gacesso, Integer tceMunicipioId, Set frMotoristas, Set esPacientes) {
       this.gmunicipioId = gmunicipioId;
       this.gsinpas = gsinpas;
       this.guf = guf;
       this.municipio = municipio;
       this.cep = cep;
       this.srRecno = srRecno;
       this.gacesso = gacesso;
       this.tceMunicipioId = tceMunicipioId;
       this.frMotoristas = frMotoristas;
       this.esPacientes = esPacientes;
    }
   
    public int getGmunicipioId() {
        return this.gmunicipioId;
    }
    
    public void setGmunicipioId(int gmunicipioId) {
        this.gmunicipioId = gmunicipioId;
    }
    public Gsinpas getGsinpas() {
        return this.gsinpas;
    }
    
    public void setGsinpas(Gsinpas gsinpas) {
        this.gsinpas = gsinpas;
    }
    public Guf getGuf() {
        return this.guf;
    }
    
    public void setGuf(Guf guf) {
        this.guf = guf;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
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
    public Integer getTceMunicipioId() {
        return this.tceMunicipioId;
    }
    
    public void setTceMunicipioId(Integer tceMunicipioId) {
        this.tceMunicipioId = tceMunicipioId;
    }
    public Set getFrMotoristas() {
        return this.frMotoristas;
    }
    
    public void setFrMotoristas(Set frMotoristas) {
        this.frMotoristas = frMotoristas;
    }
    public Set getEsPacientes() {
        return this.esPacientes;
    }
    
    public void setEsPacientes(Set esPacientes) {
        this.esPacientes = esPacientes;
    }




}


