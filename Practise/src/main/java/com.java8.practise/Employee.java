package com.java8.practise;

public class Employee {

    private String name;
    private String deptname;
    private String contactNo;
    private String email;

    public Employee(){

    }

    public Employee(String name, String deptname, String contactNo, String email) {
        this.name = name;
        this.deptname = deptname;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
