package model;

public abstract class User {
    private Integer id;
    private String username;
    private String passwordHash;
    private boolean verified;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
    public boolean isVerified() { return verified; }
    public void setVerified(boolean verified) { this.verified = verified; }

    // bisa dioverride kalau perlu
    public String roleName() { return "USER"; }
}
