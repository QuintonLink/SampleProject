package lesson5;

public class Scenario {

    public static void main(String[] args) {

        Student st = new Student("Ivan",10, 16);
        Teacher tc = new Teacher("Mr.Smith", 45, "math");


        tc.teach(st);

  /*    Human[] people = new Human[5];
        people[0] = new Human("Oleg",30);
        people[1] = new Student("Alisa",16,10);
        people[2] = new Teacher("Marina Borisovna", 60, "physics");
        people[3] = st;
        people[4] = tc;

        for (int i = 0; i < people.length ; i++) {
            people[i].sayHello();
        }

  */

        Pollite[] people = new Pollite[5];

        people[0] = new Student("Oleg",30, 11);
        people[1] = new Student("Alisa",16,10);
        people[2] = new Teacher("Marina Borisovna", 60, "physics");
        people[3] = st;
        people[4] = tc;



    }

    public static void saySomething(Pollite pol){
        pol.goodBye();
    }



}
