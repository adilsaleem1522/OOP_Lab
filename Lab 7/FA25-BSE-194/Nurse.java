public class Nurse extends HospitalMember {

    private String ward;

    public Nurse(String name, String id, String ward) {
        super(name, id);
        this.ward = ward;
    }

    @Override
    public void executeDuty() {
        System.out.println(this.name + " is currntly in the ward.");
    }

    @Override
    public double calculateWorkload() {
        return 6.0;
    }

    public String getWard() { 
        return ward; 
        }
    public void setWard(String ward) {
        this.ward = ward;
        }

    @Override
    public String toString() {
        return "[Nurse]\nName: " + name + "\nID: " + id + "\nWard: " + ward;
    }
}