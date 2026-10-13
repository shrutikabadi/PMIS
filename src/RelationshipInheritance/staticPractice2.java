package RelationshipInheritance;

class UserAccount{
    private String username;
    private static int totalUsers = 0;

    UserAccount(String username) {
        this.username = username;
        totalUsers++;
    }

    String getUsername(){
        return username;
    }

    static int getTotalUsers() {
        return totalUsers;
    }
}

public class staticPractice2 {
    public static void main(String[] args){

        System.out.println("Initial user count: "+ UserAccount.getTotalUsers());

        UserAccount u1 = new UserAccount("Arav");
        UserAccount u2 = new UserAccount("Priya");
        UserAccount u3 = new UserAccount("Rohan");

        System.out.println("UserName: "+u1.getUsername());
        System.out.println("UserName: "+u2.getUsername());
        System.out.println("UserName: "+u3.getUsername());

        System.out.println("Total users after registration: "+ UserAccount.getTotalUsers());
    }
}
