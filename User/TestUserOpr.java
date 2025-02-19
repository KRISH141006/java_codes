public class TestUserOpr {
    public static void main(String[] args) {
        UserOperations uopr = new UserOperations();
        uopr.addUser();
        for(User user: uopr.listUsers()) {
            System.out.println(user);
        }
    }
}
