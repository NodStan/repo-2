package repo2;

public class user {
    public String name;
    public String password;

    public user(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;

    }

    public String getPassword(){
        return password;
    }
}
