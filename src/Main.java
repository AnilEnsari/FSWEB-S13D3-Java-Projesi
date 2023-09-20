public class Main {
    public static void main(String[] args) {



    Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
        System.out.println("*********************************");
    Person person2 = new Person("Anıl","Ensari",33,"Galatasaray",new String[]{"futbol","basketbol","development"},"26.11.1990");
        System.out.println("Firstname: " + person2.getFirstName());

        System.out.println("LastName: " + person2.getLastName());

        System.out.println("Age: " + person2.getAge());
        System.out.println("Favorite Team: " + person2.getFavoriteTeam());
        System.out.println("Hobbies: " + person2.getHobbies().trim());
        System.out.println("Birthday: " + person2.getBirthday());


    }
}
