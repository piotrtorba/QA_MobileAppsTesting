package Java_Course;

public class StudentChecker {
    public static void main(String[] args) {

        //Utworzenie trzech obiektow klasy Student i przypisanie wartosci
        Student student_1rok = new Student();
        student_1rok.imie = "Marcin";
        student_1rok.nazwisko = "Papala";
        student_1rok.nrIndexu = 123456;

        Student student_2rok = new Student();
        student_2rok.imie = "Piotr";
        student_2rok.nazwisko =  "Toto";
        student_2rok.nrIndexu = 134568;

        Student student_3rok = new Student();
        student_3rok.imie = "Jacek";
        student_3rok.nazwisko = "Barto";
        student_3rok.nrIndexu = 549874;

        //Utworzenie Tablicy
        Student[] TablicaStudentow = new Student[3];
        TablicaStudentow[0] = student_1rok;
        TablicaStudentow[1] = student_2rok;
        TablicaStudentow[2] = student_3rok;

        for (int i=0; i<TablicaStudentow.length; i++) {
            TablicaStudentow[i].welcome();
            TablicaStudentow[i].nrAlbumu();
        }
    }
}
