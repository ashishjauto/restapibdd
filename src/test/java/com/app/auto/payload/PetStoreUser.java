package com.app.auto.payload;


/**
 {
  ""id"": 0,
  ""username"": ""string"",
  ""firstName"": ""string"",
  ""lastName"": ""string"",
  ""email"": ""string"",
  ""password"": ""string"",
  ""phone"": ""string"",
  ""userStatus"": 0
}





 */
public  class PetStoreUser {

    int id;
     String userName;
    String firstName;
    String lastName;
    String email;
    String password;
    String phone;
    int userstatus=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(int userstatus) {
        this.userstatus = userstatus;
    }




}
