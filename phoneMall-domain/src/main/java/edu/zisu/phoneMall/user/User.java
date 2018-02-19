package edu.zisu.phoneMall.user;

public class User {
    private Long userId;
    private String userName;
    private String userMail;
    private String userType;
    private String userPassWd;

    public User() {
    }

    public User(String userName, String userMail, String userPassWd) {
        this.userName = userName;
        this.userMail = userMail;
        this.userPassWd = userPassWd;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassWd() {
        return userPassWd;
    }

    public void setUserPassWd(String userPassWd) {
        this.userPassWd = userPassWd;
    }
}
