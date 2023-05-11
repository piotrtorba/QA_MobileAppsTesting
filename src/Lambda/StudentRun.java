package Lambda;

public class StudentRun {

    //Trzy typy wywolania:
    public static void main(String[] args) {
        Student iTstudent = new ITstudent(); //1. Typowe wywolanie obiektu klasy
        sayHello("Popo", iTstudent);

        Student Medstudent = new Student() { //2. Wywolanie klasy anonimowej
            @Override
            public void sayHello(String name) {
                System.out.println("I'm the Medicine student");
                System.out.println("My name is " + name);
            }
        };
        sayHello("Kasia", Medstudent);

        //3. Lambda - mozna skozystac z Lambda tylko gdy mamy interfejs funkcjonalny zawierajacy tylko 1 metode
        // (parametr/y) -> System.out.println("I'm not a student");

        //Przypisanie wyrazenia lambda do zmiennej 'noStudent'.
        Student noStudent = (name) -> System.out.println("I'm not a student. My name is " + name);
        //Wywolanie metody interfejsu
        sayHello("Tom", noStudent);

        //W przypadku wykonywania przez Lambda wiecej niz jednej lini kodu nalezy uzyc klamer {} np.
        //Student noStudent = (name) -> {
        //System.out.println("I'm not a student. My name is " + name);
        //System.out.println("I'm an alien");
        //}

    }

    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }
}
