package pe.edu.idat.ECFinal_Villar_Axel;

public class userVO {

    private int id;
    private String username;
    private String pass;
    private String email;
    private String ip_address;

    public userVO() {
    }

    public userVO(String username, String pass, String email, String ip_address) {
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.ip_address = ip_address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

}
