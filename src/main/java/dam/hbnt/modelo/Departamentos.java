package dam.hbnt.modelo;
// Generated 30 de gen. 2020, 9:57:56 by Hibernate Tools 4.3.1



/**
 * Departamentos generated by hbm2java
 */
public class Departamentos  implements java.io.Serializable {


     private byte deptNo;
     private String dnombre;
     private String loc;

    public Departamentos() {
    }

	
    public Departamentos(byte deptNo) {
        this.deptNo = deptNo;
    }
    public Departamentos(byte deptNo, String dnombre, String loc) {
       this.deptNo = deptNo;
       this.dnombre = dnombre;
       this.loc = loc;
    }
   
    public byte getDeptNo() {
        return this.deptNo;
    }
    
    public void setDeptNo(byte deptNo) {
        this.deptNo = deptNo;
    }
    public String getDnombre() {
        return this.dnombre;
    }
    
    public void setDnombre(String dnombre) {
        this.dnombre = dnombre;
    }
    public String getLoc() {
        return this.loc;
    }
    
    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
     return "Departamento: ["+this.getDeptNo()+","+this.getDnombre()+","+ this.getLoc()+"]";
    }

    


}


