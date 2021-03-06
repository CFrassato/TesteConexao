package entidades;
// Generated 25/08/2016 16:42:18 by Hibernate Tools 4.3.1



/**
 * CpDespesaId generated by hbm2java
 */
public class CpDespesaId  implements java.io.Serializable {


     private int ganoId;
     private String despesaId;

    public CpDespesaId() {
    }

    public CpDespesaId(int ganoId, String despesaId) {
       this.ganoId = ganoId;
       this.despesaId = despesaId;
    }
   
    public int getGanoId() {
        return this.ganoId;
    }
    
    public void setGanoId(int ganoId) {
        this.ganoId = ganoId;
    }
    public String getDespesaId() {
        return this.despesaId;
    }
    
    public void setDespesaId(String despesaId) {
        this.despesaId = despesaId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CpDespesaId) ) return false;
		 CpDespesaId castOther = ( CpDespesaId ) other; 
         
		 return (this.getGanoId()==castOther.getGanoId())
 && ( (this.getDespesaId()==castOther.getDespesaId()) || ( this.getDespesaId()!=null && castOther.getDespesaId()!=null && this.getDespesaId().equals(castOther.getDespesaId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getGanoId();
         result = 37 * result + ( getDespesaId() == null ? 0 : this.getDespesaId().hashCode() );
         return result;
   }   


}


