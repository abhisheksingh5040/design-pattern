package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("1","Abhishek");
        User user2 = new User("2","Abhi");

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(user1);
        userManagement.addUser(user2);

        MyIterator iterator = userManagement.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
