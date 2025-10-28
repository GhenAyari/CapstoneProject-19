package serviceauth;

public interface LoginStrategy {
    int login(String username, String password); // return userId or -1
}
