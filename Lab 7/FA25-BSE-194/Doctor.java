public class Doctor extends HospitalMember {

    private String department;

    public Doctor(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void executeDuty() {
        System.out.println(this.name + " is currently working.");
    }

    @Override
    public double calculateWorkload() {
        return 8.0;
    }
    public String getDepartment() {
         return department; 
         }
    public void setDepartment(String department) {
         this.department = department;
         }

    @Override
    public String toString() {
        return "[Doctor]\nName: " + name + "\nID: " + id + "\nDepartment: " + department;
    }
}