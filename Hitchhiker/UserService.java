package hitchhiker;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean hasAccessTo(String userName, boolean isAdmin) {
        User user = userRepository.getByUserName(userName);

        if (userRepository.isAdmin(user)) {
            return true;
        }

        return false;
    }
}
