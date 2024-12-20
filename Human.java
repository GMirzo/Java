package HappyFamilyProject;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }
    public Human(String name, String surname, int dateOfBirth, int iq, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet(String nickname){
        System.out.println("Hello" + nickname);
    }

    public void describePet(){
        System.out.println("I have an");
    }
}
