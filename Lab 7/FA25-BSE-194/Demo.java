public class Demo {

    public static void main(String[] args) {

        HospitalMember m1 = new Doctor("DR. Umer Rafique", "D-101", "Cardiology Dept");
        HospitalMember m2 = new Nurse("Sobia", "E-201", "ICU Dept");
        HospitalMember m3 = new LabTechnician("Abdul Hadi", "F-301", "Blood Bank");

        HospitalMember[] staff = { m1, m2, m3 };

        System.out.println("======= HOSPITAL STAFF RECORD (BEFORE) =======");
        for (HospitalMember member : staff) {
            System.out.println(member.toString());
            member.executeDuty();
            member.checkStatus();
            System.out.println("Hospital: " + member.getHospitalName());
            System.out.println("Workload: " + member.calculateWorkload());
            System.out.println("-----------------------------------------------");
        }

        System.out.println("\n======= LOOP 1: Updating Records =======");
        for (HospitalMember member : staff) {
            if (member instanceof Doctor) {
                ((Doctor) member).setDepartment("Neurology");
                System.out.println("Doctor department updated.");
            }
            if (member instanceof Nurse) {
                ((Nurse) member).setWard("Emergency");
                System.out.println("Nurse ward updated.");
            }
            if (member instanceof LabTechnician) {
                ((LabTechnician) member).setLabSection("Pathology");
                System.out.println("Lab section updated.");
            }
        }

        System.out.println("\n======= LOOP 2: Conditional Update =======");
        for (HospitalMember member : staff) {
            if (member instanceof Doctor) {
                Doctor doc = (Doctor) member;
                if (doc.getDepartment().equals("Neurology")) {
                    doc.setName("Dr. Ali Raza");
                    System.out.println("Dr. Ali Raza has now taken the charge");
                }
            }
            if (member instanceof Nurse) {
                Nurse nurse = (Nurse) member;
                if (nurse.getWard().equals("Emergency")) {
                    nurse.setId("E-199");
                    System.out.println("Nurse ID updated for emergency staff.");
                }
            }
            if (member instanceof LabTechnician) {
                LabTechnician lt = (LabTechnician) member;
                if (lt.getLabSection().equals("Pathology")) {
                    lt.setId("F-121");
                    System.out.println("LabTechician ID updated for pathology staff.");
                }
            }
        }

        System.out.println("\n======= HOSPITAL STAFF RECORD (AFTER) =======");
        for (HospitalMember member : staff) {
            System.out.println(member.toString());
            member.executeDuty();
            System.out.println("-----------------------------------------------");
        }
    }
}