package edu.zisu.phoneMall.user;

public class User {
    private Long userId;
    private String userName;
    private int userType;
    private String userPassWd;

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

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getUserPassWd() {
        return userPassWd;
    }

    public void setUserPassWd(String userPassWd) {
        this.userPassWd = userPassWd;
    }
}
