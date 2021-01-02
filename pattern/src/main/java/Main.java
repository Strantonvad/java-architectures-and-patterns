public class Main {
    public static void main(String[] args) {

        //Builder паттерн

        User user1 = new UserBuilderImpl("Pupkin", "Ivan")
            .setAge(30)
            .setPhone("1234567")
            .setAddress("Some address 1234")
            .build();

        User user2 = new UserBuilderImpl("Petrov", "Petr")
            .setAge(20)
            .setPhone("7654321")
            .setAddress("Some address 4321")
            .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
