package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Gbairro generated by hbm2java
 */
public class Gbairro  implements java.io.Serializable {


     private String gbairroId;
     private String bairro;
     private long srRecno;
     private Date gacesso;
     private char bairroDic;
     private String loteamento;
     private BigDecimal urIluEdi;
     private BigDecimal urIluTer;
     private BigDecimal m2PadTer;
     private BigDecimal urColetaLixo;
     private Set frMotoristas = new HashSet(0);
     private Set esPacientes = new HashSet(0);

    public Gbairro() {
    }

	
    public Gbairro(String gbairroId, String bairro, long srRecno, char bairroDic) {
        this.gbairroId = gbairroId;
        this.bairro = bairro;
        this.srRecno = srRecno;
        this.bairroDic = bairroDic;
    }
    public Gbairro(String gbairroId, String bairro, long srRecno, Date gacesso, char bairroDic, String loteamento, BigDecimal urIluEdi, BigDecimal urIluTer, BigDecimal m2PadTer, BigDecimal urColetaLixo, Set frMotoristas, Set esPacientes) {
       this.gbairroId = gbairroId;
       this.bairro = bairro;
       this.srRecno = srRecno;
       this.gacesso = gacesso;
       this.bairroDic = bairroDic;
       this.loteamento = loteamento;
       this.urIluEdi = urIluEdi;
       this.urIluTer = urIluTer;
       this.m2PadTer = m2PadTer;
       this.urColetaLixo = urColetaLixo;
       this.frMotoristas = frMotoristas;
       this.esPacientes = esPacientes;
    }
   
    public String getGbairroId() {
        return this.gbairroId;
    }
    
    public void setGbairroId(String gbairroId) {
        this.gbairroId = gbairroId;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
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
    public char getBairroDic() {
        return this.bairroDic;
    }
    
    public void setBairroDic(char bairroDic) {
        this.bairroDic = bairroDic;
    }
    public String getLoteamento() {
        return this.loteamento;
    }
    
    public void setLoteamento(String loteamento) {
        this.loteamento = loteamento;
    }
    public BigDecimal getUrIluEdi() {
        return this.urIluEdi;
    }
    
    public void setUrIluEdi(BigDecimal urIluEdi) {
        this.urIluEdi = urIluEdi;
    }
    public BigDecimal getUrIluTer() {
        return this.urIluTer;
    }
    
    public void setUrIluTer(BigDecimal urIluTer) {
        this.urIluTer = urIluTer;
    }
    public BigDecimal getM2PadTer() {
        return this.m2PadTer;
    }
    
    public void setM2PadTer(BigDecimal m2PadTer) {
        this.m2PadTer = m2PadTer;
    }
    public BigDecimal getUrColetaLixo() {
        return this.urColetaLixo;
    }
    
    public void setUrColetaLixo(BigDecimal urColetaLixo) {
        this.urColetaLixo = urColetaLixo;
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


