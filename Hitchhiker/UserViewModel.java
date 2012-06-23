package hitchhiker;

public class UserViewModel {

    private final String userName;
    private final String fullName;
    private final boolean isAdmin;

    public UserViewModel(String userName, String fullName, boolean admin) {
        this.userName = userName;
        this.fullName = fullName;
        this.isAdmin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}

