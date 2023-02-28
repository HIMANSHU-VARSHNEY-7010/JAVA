public class employee {
    public String firstname ;
    public String lastname ;
    public String age ;
    public String designation ;

    employee(){
        this.firstname="" ;
        this.lastname="" ;
        this.age="";
        this.designation="" ;
    }

    employee(String firstName , String lastName , String age , String designation){
        this.firstname=firstName ;
        this.lastname=lastName ;
        this.age=age;
        this.designation=designation ;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }
    public String toString(){
        return firstname +" "+lastname +" is "+age + " years old and working as "+designation ;

    }
}