package Middle;

public class ToLine {

    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {

        int[] resises = new int[data.length * data[0].length];
        for (int[] x: data) {
            for (int i = 0; i < x.length; i++) {
                resises[i] = x[i];
            }
        }
        return resises;
    }
}


//Этот класс работает наоборот, то есть из двумерного массива делает одномерный.
//
//В этом классе реализуйте:
//
//поле data (двумерный массив);
//конструктор, инициализирующий данное поле (data);
//метод resize(), возвращающий одномерный список.
//Пример:
//
//ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
//int[] arr = a.resize();
//В поле arr должен попасть массив вида: [1, 2, 3, 4, 5, 6].