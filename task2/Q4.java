package part4.task2;

public class Q4 {
    public static void main(String[] args) {
        User user = new User("Alice", 30);
        User user2 = new User("Bob", 25);
        User user3 = new User("Charlie", 35);
        MyRepository<User> userRepository = new MyRepository<>();
        userRepository.save(user);
        userRepository.save(user2);
        userRepository.save(user3);
        
        String s1="hello";
        String s2="Java";
        String s3="World";
        MyRepository<String> stringRepository = new MyRepository<>();
        stringRepository.save(s1);
        stringRepository.save(s2);
        stringRepository.save(s3);

        int i1=1;
        int i2=2;
        int i3=3;
        MyRepository<Integer> integerRepository = new MyRepository<>();
        integerRepository.save(i1);
        integerRepository.save(i2);
        integerRepository.save(i3);

        stringRepository.printAll();
        userRepository.printAll();
        integerRepository.printAll();
    }
}