package model;

public class Teacher extends User {
    // bridge methods agar kode lama yang pakai usersId TIDAK rusak
    public Integer getUsersId() { return getId(); }
    public void setUsersId(Integer id) { setId(id); }

    @Override public String roleName() { return "TEACHER"; }
}
