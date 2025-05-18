package interface_abstraction;

public class MySecurity implements SecurityStandard{

    @Override
    public boolean verifyUser(String user, String password) {
        return user.equals("admin") && password.equals("abc");
    }
}
