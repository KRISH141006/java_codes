// define person class with following datamembers
// firstname 
// lastname
// Gender
// address
// contact
// email id

public class parentcls {
    String firstName;
    String lastName;
    String gender;
    String address;
    String contact;
    String email_id;

    public parentcls(String firstName ,String lastName ,String gender ,String address ,String contact ,String email_id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.email_id = email_id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public void setlastName(String lirstName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setContact(String contact){
        this.contact = contact;
    }
    public String getContact(){
        return this.contact;
    }

    public void setEmail_id(String email_id){
        this.email_id = email_id;
    }
    public String getEmail_id(){
        return this.email_id;
    }

    public String toString(){
        return this.firstName + "\n" + this.lastName + "\n" + this.gender + "\n" + this.address + "\n" + this.contact + "\n" + this.email_id;
    }

}

