package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * CpDepartamentoId generated by hbm2java
 */
public class CpDepartamentoId  implements java.io.Serializable {


     private String secretariaId;
     private int departamentoId;

    public CpDepartamentoId() {
    }

    public CpDepartamentoId(String secretariaId, int departamentoId) {
       this.secretariaId = secretariaId;
       this.departamentoId = departamentoId;
    }
   
    public String getSecretariaId() {
        return this.secretariaId;
    }
    
    public void setSecretariaId(String secretariaId) {
        this.secretariaId = secretariaId;
    }
    public int getDepartamentoId() {
        return this.departamentoId;
    }
    
    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CpDepartamentoId) ) return false;
		 CpDepartamentoId castOther = ( CpDepartamentoId ) other; 
         
		 return ( (this.getSecretariaId()==castOther.getSecretariaId()) || ( this.getSecretariaId()!=null && castOther.getSecretariaId()!=null && this.getSecretariaId().equals(castOther.getSecretariaId()) ) )
 && (this.getDepartamentoId()==castOther.getDepartamentoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSecretariaId() == null ? 0 : this.getSecretariaId().hashCode() );
         result = 37 * result + this.getDepartamentoId();
         return result;
   }   


}


