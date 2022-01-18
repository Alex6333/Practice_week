package Middle;

public class Separator {

    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int a = 0, b = 0;
        for (int i : array) {
            if (i % 2 == 0)
                a++;
        }
        
        int[] evens = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens[b] = array[i];
                b++;
            }
        }
        return evens;
    }

    public int[] odd() {
        int a = 0, b = 0;
        for (int i : array) {
            if (i % 2 != 0)
                a++;
        }

        int[] odds = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds[b] = array[i];
                b++;
            }
        }
        return odds;
    }
}


//Напишите класс Separator.
//
//Добавьте в него поле array и конструктор, инициализирующий его.
//
//Также реализуйте методы even() и odd(), они должны возвращать массив четных или нечетных чисел, отобранных из array.