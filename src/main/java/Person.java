public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean objectEquals(Object o){
        Person p = (Person) o;
        boolean status = false;
        if(this.firstName.equalsIgnoreCase(p.firstName) && this.lastName.equalsIgnoreCase(p.lastName)
            && this.age==p.age && this.gender.equalsIgnoreCase(p.gender)){
            status = true;
        }
        return status;
    }

    @Override
    public String toString(){
        return "Person = Name:" +firstName + "\nSurname:" + "\nAge: " +age +"\nGender: " + gender;
    }
}
