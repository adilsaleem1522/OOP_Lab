public abstract class HospitalMember {

    protected String name;
    protected String id;

    public HospitalMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void executeDuty();

    public abstract double calculateWorkload();

    public void displayInfo() {
        System.out.println("Name: " + this.name + "\nID: " + this.id);
    }

    public void checkStatus() {
        System.out.println(this.name + " is a current member of the hospital.");
    }

    public final String getHospitalName() {
        return "THQ Hospital Taunsa Sharif";
    }

    public String getName() {
         return name; 
         }
    public String getId() {
         return id; 
         }
    public void setName(String name) { 
        this.name = name; 
        }
    public void setId(String id) { 
        this.id = id; 
        }
}