package pojos;
// Generated May 19, 2016 3:27:38 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Porposa generated by hbm2java
 */
public class Porposa  implements java.io.Serializable {


     private Integer porpId;
     private Projectsforusers projectsforusers;
     private Users users;
     private int price;
     private Date startDate;
     private Date deadLinePor;
     private String statusOfPorposa;
     private Set detailses = new HashSet(0);

    public Porposa() {
    }

	
    public Porposa(Projectsforusers projectsforusers, Users users, int price, Date startDate, Date deadLinePor, String statusOfPorposa) {
        this.projectsforusers = projectsforusers;
        this.users = users;
        this.price = price;
        this.startDate = startDate;
        this.deadLinePor = deadLinePor;
        this.statusOfPorposa = statusOfPorposa;
    }
    public Porposa(Projectsforusers projectsforusers, Users users, int price, Date startDate, Date deadLinePor, String statusOfPorposa, Set detailses) {
       this.projectsforusers = projectsforusers;
       this.users = users;
       this.price = price;
       this.startDate = startDate;
       this.deadLinePor = deadLinePor;
       this.statusOfPorposa = statusOfPorposa;
       this.detailses = detailses;
    }
   
    public Integer getPorpId() {
        return this.porpId;
    }
    
    public void setPorpId(Integer porpId) {
        this.porpId = porpId;
    }
    public Projectsforusers getProjectsforusers() {
        return this.projectsforusers;
    }
    
    public void setProjectsforusers(Projectsforusers projectsforusers) {
        this.projectsforusers = projectsforusers;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getDeadLinePor() {
        return this.deadLinePor;
    }
    
    public void setDeadLinePor(Date deadLinePor) {
        this.deadLinePor = deadLinePor;
    }
    public String getStatusOfPorposa() {
        return this.statusOfPorposa;
    }
    
    public void setStatusOfPorposa(String statusOfPorposa) {
        this.statusOfPorposa = statusOfPorposa;
    }
    public Set getDetailses() {
        return this.detailses;
    }
    
    public void setDetailses(Set detailses) {
        this.detailses = detailses;
    }




}

