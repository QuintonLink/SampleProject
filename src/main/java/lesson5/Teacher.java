package lesson5;

public class Teacher extends Human implements Pollite{


    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void sayHello(){
        System.out.println("Здравствуйте, меня зовут " + name);
    }
    public void teach (Student st){
        st.sayHello();
    }

    public void goodBye() {
        System.out.println("Досвидвнья");
    }
}
