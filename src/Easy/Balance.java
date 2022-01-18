package Easy;

public class Balance {
    private int R = 0;
    private int L = 0;

    public void addRight(int n) {
        R++;
    }

    public void addLeft(int n) {
        L++;
    }

    public String getSituation() {
        String situation;
        if (R == L) {
            situation = "=";
        } else if (R > L) {
            situation = "R";
        } else {
            situation = "L";
        }
        return situation;
    }
}
//   Напишите класс Balance для описания весов с двумя чашами, которые будут балансировать.
//
//   В этом классе должны быть следующие методы:
//
//   addRight(int n) — добавить на правую чашу (метод ничего не возвращает);
//   addLeft(int n) — добавить на левую чашу (метод также ничего не возвращает);
//   getSituation() — метод вернет =, если вес на обеих чашах равен, R — если вес на правой больше, L — на левой больше.