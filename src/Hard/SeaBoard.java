package Hard;

public class SeaBoard {

    private String[][] field;

    public SeaBoard() {
        field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = ".";
            }
        }
    }

    String[][] getField() {
        String[][] result = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j].equals("/")) result[i][j] = "x";
                else
                result[i][j] = field[i][j];
            }
        }
        return result;
    }

    void shoot(int line, int column, String issue) {

        if (issue.equals("m")) field[line][column] = "#";
        else if (issue.equals("h")) field[line][column] = "/";
        else if (issue.equals("d")) {
            field[line][column] = "/";
            sink(line, column);
        }
    }

    private void sink(int line, int column) {

        int[][] around = new int[][]{
                {line - 1, column - 1}, {line - 1, column},
                {line - 1, column + 1}, {line, column - 1},
                {line, column + 1}, {line + 1, column},
                {line + 1, column + 1}, {line + 1, column - 1}
        };
        for (int[] i : around) {
            if (i[0] >= 0 && i[0] <= 9 && i[1] >= 0 && i[1] <= 9 && field[i[0]][i[1]].equals(".")) {
                field[i[0]][i[1]] = "#";
            }
        }

        field[line][column] = "x";

        for (int[] i : around) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals("/")) {
                sink(i[0], i[1]);
            }
        }
    }

    String check(int line, int column) {
        if (field[line][column].equals("/")) return "x";
        return field[line][column];
    }
}


//метод void shoot(int line, int column, String issue), принимающий в себя координаты на поле
// (от 0 до 9, другие числа туда подать не могут) и строку с исходом этого выстрела
// (m — miss/промах, h — hit/попадание и d — destroy/уничтожение, гарантируется, что другие буквы туда подать не могут);
//метод check(int line, int column), возвращающий . (точку), если в клетку [line][column] еще не стреляли,
// # — если стреляли, но не попали
// (или, например, потопили корабль, а эта клетка соседняя), x — если в этой клетке было попадание.
//Примечание:
//Поле представляет собой двумерный массив строк 10 на 10. Все клетки, в которые еще не стреляли, — это . (точки).
// Попадания и сбитые корабли — это x, а промахи — #.
//
//Пример:
//
//Ввод
//SeaBoard board = new SeaBoard();
//board.shoot(0, 0, m);
//board.shoot(2, 0, h);
//board.shoot(6, 9, h);
//board.shoot(2, 1, d);
//*Выводим поле, используя board.getField();
//Вывод:
//
//#.........
//###.......
//xx#.......
//###.......
//..........
//..........
//.........x
//..........
//..........
//..........