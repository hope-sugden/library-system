package com.example.librarysystem;

public class User {
    private String name;
    private Boolean isAdmin;

    public User(String name, Boolean isAdmin) {
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name=").append(name);
        sb.append(", isAdmin=").append(isAdmin);
        sb.append('}');
        return sb.toString();
    }
}
