package Java_Course;

public class MethodName {
    /*Przeciazanie metod - Methon Overloading
    Istnieje mozliwosc przeciazenia metody o tej samej nazwie. Jest to mozliwe poniewaz
    kolejne metody 'add' posiadaja inna liczbe argumentow. Typ argumentow tez ma znaczenie.
     */
    public void  add(int a, int b) {
        System.out.println(a + b);
    }
    public void  add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public void  add(int a) {
        System.out.println(a);
    }
}
