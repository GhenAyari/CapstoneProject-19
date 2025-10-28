package model;

public class Student extends User {
    public Integer getUsersId() { return getId(); }
    public void setUsersId(Integer id) { setId(id); }

    @Override public String roleName() { return "STUDENT"; }
}
