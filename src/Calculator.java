public class Calculator {

    public int dodawanie(int liczba1, int liczba2) {
        return liczba1 + liczba2;
    }
    public int odejmowanie(int liczba1, int liczba2) {
        return liczba1 - liczba2;
    }
    public int mnozenie(int liczba1, int liczba2) {
        if (liczba1 == 0 || liczba2 ==0) {
            return 0;
        }
        return liczba1 * liczba2;
    }
    public int dzielenie(int liczba1, int liczba2) {
        if (liczba1 == 0 || liczba2 ==0) {
            return 0;
        }
        return liczba1 / liczba2;
    }
    public int modulo(int liczba1, int liczba2) {
        return liczba1 % liczba2;
    }
}
