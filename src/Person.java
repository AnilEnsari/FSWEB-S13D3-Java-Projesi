public class Person {

    String firstname;
    String lastname;
    int age;
    String favoriteTeam;
    String[] hobbies;

    String birthday;



    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age,String favoriteTeam, String[] hobbies,  String birthday) {
        this(firstname,lastname,age);
        this.favoriteTeam = favoriteTeam;
        this.hobbies = hobbies;
        this.birthday = birthday;
    }

    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){

        return lastname;
    }
    public int getAge(){
        return age ;
    }
    public boolean isTeen (){

        return age>=13 && age <=19 ;

    }
    public String getFavoriteTeam(){

        return favoriteTeam;
    }
    public String getHobbies(){
        String hobby ="";

 for( String hob : hobbies){


     hobby += hob+" ";

 }
return hobby ;
    }
    public String getBirthday(){

        return birthday;
    }

}


