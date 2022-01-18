package Middle;

public class Programmer {

    String name;
    String company;
    String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
        this.position = "intern";
    }

    public String getPosition() {
        return position;
    }

    public void work() {

        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }
}


//                      Напишите класс Programmer.//
//                      Переменные:
//                      name (имя, строка);
//                      company (имя компании, строка);
//                      position (позиция, строка);
//                      конструктор, принимающий name и company;
//                      метод getPosition(), возвращающий строку — позицию программиста.
//        метод work(), поднимающий позицию программиста на уровень вверх
//        (с самого начала (при инициализации) программист — intern (стажер),
//        потом junior (джуниор), далее middle, senior, lead).