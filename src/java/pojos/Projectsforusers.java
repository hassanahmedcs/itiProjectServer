package pojos;
// Generated May 19, 2016 3:27:38 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Projectsforusers generated by hbm2java
 */
public class Projectsforusers  implements java.io.Serializable {


     private Integer projectId;
     private Categorytable categorytable;
     private Users users;
     private String projectName;
     private String projectDescription;
     private int budget;
     private Date startDate;
     private Date projectDeadLine;
     private Set porposas = new HashSet(0);
     private Set projectsimageses = new HashSet(0);
     private Set postforprojectses = new HashSet(0);
     private Set detailses = new HashSet(0);
     private Set tagsofprojectses = new HashSet(0);

    public Projectsforusers() {
    }

	
    public Projectsforusers(Categorytable categorytable, Users users, String projectName, String projectDescription, int budget, Date startDate) {
        this.categorytable = categorytable;
        this.users = users;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.budget = budget;
        this.startDate = startDate;
    }
    public Projectsforusers(Categorytable categorytable, Users users, String projectName, String projectDescription, int budget, Date startDate, Date projectDeadLine, Set porposas, Set projectsimageses, Set postforprojectses, Set detailses, Set tagsofprojectses) {
       this.categorytable = categorytable;
       this.users = users;
       this.projectName = projectName;
       this.projectDescription = projectDescription;
       this.budget = budget;
       this.startDate = startDate;
       this.projectDeadLine = projectDeadLine;
       this.porposas = porposas;
       this.projectsimageses = projectsimageses;
       this.postforprojectses = postforprojectses;
       this.detailses = detailses;
       this.tagsofprojectses = tagsofprojectses;
    }
   
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public Categorytable getCategorytable() {
        return this.categorytable;
    }
    
    public void setCategorytable(Categorytable categorytable) {
        this.categorytable = categorytable;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public String getProjectName() {
        return this.projectName;
    }
    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectDescription() {
        return this.projectDescription;
    }
    
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
    public int getBudget() {
        return this.budget;
    }
    
    public void setBudget(int budget) {
        this.budget = budget;
    }
    public Date getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getProjectDeadLine() {
        return this.projectDeadLine;
    }
    
    public void setProjectDeadLine(Date projectDeadLine) {
        this.projectDeadLine = projectDeadLine;
    }
    public Set getPorposas() {
        return this.porposas;
    }
    
    public void setPorposas(Set porposas) {
        this.porposas = porposas;
    }
    public Set getProjectsimageses() {
        return this.projectsimageses;
    }
    
    public void setProjectsimageses(Set projectsimageses) {
        this.projectsimageses = projectsimageses;
    }
    public Set getPostforprojectses() {
        return this.postforprojectses;
    }
    
    public void setPostforprojectses(Set postforprojectses) {
        this.postforprojectses = postforprojectses;
    }
    public Set getDetailses() {
        return this.detailses;
    }
    
    public void setDetailses(Set detailses) {
        this.detailses = detailses;
    }
    public Set getTagsofprojectses() {
        return this.tagsofprojectses;
    }
    
    public void setTagsofprojectses(Set tagsofprojectses) {
        this.tagsofprojectses = tagsofprojectses;
    }




}

