package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * CpCconsumoId generated by hbm2java
 */
public class CpCconsumoId  implements java.io.Serializable {


     private String secretariaId;
     private int codigo;

    public CpCconsumoId() {
    }

    public CpCconsumoId(String secretariaId, int codigo) {
       this.secretariaId = secretariaId;
       this.codigo = codigo;
    }
   
    public String getSecretariaId() {
        return this.secretariaId;
    }
    
    public void setSecretariaId(String secretariaId) {
        this.secretariaId = secretariaId;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CpCconsumoId) ) return false;
		 CpCconsumoId castOther = ( CpCconsumoId ) other; 
         
		 return ( (this.getSecretariaId()==castOther.getSecretariaId()) || ( this.getSecretariaId()!=null && castOther.getSecretariaId()!=null && this.getSecretariaId().equals(castOther.getSecretariaId()) ) )
 && (this.getCodigo()==castOther.getCodigo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSecretariaId() == null ? 0 : this.getSecretariaId().hashCode() );
         result = 37 * result + this.getCodigo();
         return result;
   }   


}


