public class MemberCard{

        private static int counter = 0;
        private static final String PREFIX = "LIB-";

	private String cardNo;
	private String studentName;
        private String department;
 	private int semester;
	private double feePaid;
	private boolean active;


 	
        private static String generateCardNo() {
        return PREFIX + String.format("%04d", counter++);
    
}
	
        public MemberCard(){
		
		cardNo = generateCardNo();
		studentName = "Unknown";
		department = "BSSE";
		semester = 1;
		feePaid = 0.0;
		active = true;

}

	public MemberCard(String studentName, String department, int semester, double feePaid, boolean active){
		this.studentName = studentName;
		this.department = department;
		this.semester = semester;
		this.feePaid = feePaid;
		this.active = active;
}
}
		
		
