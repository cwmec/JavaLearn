package exercicio2;

public class exercicio5Rent {
    private String name;
    private String email;

    public exercicio5Rent(){

    }

    public exercicio5Rent(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return name + ", " + email;
    }
}
