package pojos;
// Generated May 21, 2016 2:50:29 PM by Hibernate Tools 4.3.1



/**
 * Projectsimages generated by hbm2java
 */
public class Projectsimages  implements java.io.Serializable {


     private Integer imageId;
     private Projectsforusers projectsforusers;
     private String imageUrl;

    public Projectsimages() {
    }

    public Projectsimages(Projectsforusers projectsforusers, String imageUrl) {
       this.projectsforusers = projectsforusers;
       this.imageUrl = imageUrl;
    }
   
    public Integer getImageId() {
        return this.imageId;
    }
    
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }
    public Projectsforusers getProjectsforusers() {
        return this.projectsforusers;
    }
    
    public void setProjectsforusers(Projectsforusers projectsforusers) {
        this.projectsforusers = projectsforusers;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }




}


