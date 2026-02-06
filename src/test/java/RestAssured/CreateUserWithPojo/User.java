package RestAssured.CreateUserWithPojo;

//pojo class:
public class User {

    private String names;
    private String email;
    private String gender;
    private String status;

    public User(String names, String email, String gender, String status) {
        this.names = names;
        this.email = email;
        this.gender = gender;
        this.status = status;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "names='" + names + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
