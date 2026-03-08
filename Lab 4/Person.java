public class Person {
    private String name;
    private String email;
    private Date dob;

    public Person() {
    }

    public Person(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;  // compostion
    }
    //deep cpy
    public Person(Person other){
        this(other.name,other.email,new Date(other.dob));
    }

    public void setName(String name){
        this.name=name;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Person p){
        if(this.name.equals(p.name) && this.email.equals(p.email) && this.dob == p.dob)
            return true;
        else
            return false;
    }

}