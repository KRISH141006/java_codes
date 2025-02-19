//wajp to accept details of user like user name , full name , password , role from the user to add new user.if the role
// admin than he can do following operation
//-->add new user
//-->update that user
//-->delete the user
//or the user can edit his only data
// add logic of authentication
//roles are admin and normal user
//authentication is a process to validate the user.
//auhtorazation is the ability to acess the particular resourse.

class User{
    private String username;
    private String password;
    private String role;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String toString(){
        return this.username +  " " + this.password + " " + this.role;
    }

}