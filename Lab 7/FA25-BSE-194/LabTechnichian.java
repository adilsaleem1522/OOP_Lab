public class LabTechnician extends HospitalMember {

    private String labSection;

    public LabTechnician(String name, String id, String labSection) {
        super(name, id);
        this.labSection = labSection;
    }

    @Override
    public void executeDuty() {
        System.out.println(this.name + " is running lab tests.");
    }

    @Override
    public double calculateWorkload() {
        return 5.0;
    }

    public String getLabSection() {
         return labSection; 
         }
    public void setLabSection(String labSection) {
         this.labSection = labSection; 
         }

    @Override
    public String toString() {
        return "[LabTechician]\nName: " + name + "\nID: " + id + "\nLab Section: " + labSection;
    }
}