package Hard;

public class TicTacToe {

    String[][] field;
    String player;

    public TicTacToe() {

        newGame();
    }

    void newGame() {

        field = new String[][]{{"-", "-", "-" },
                {"-", "-", "-" },
                {"-", "-", "-" }};
        player = "X";
    }

    public String[][] getField() {

        return field;
    }

    String checkGame() {

        if ((field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X"))
                || (field[0][0].equals("X") && field[1][0].equals("X") && field[2][0].equals("X"))
                || (field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X"))
                || (field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X"))
                || (field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X"))
                || (field[0][1].equals("X") && field[1][1].equals("X") && field[2][1].equals("X"))
                || (field[0][2].equals("X") && field[1][2].equals("X") && field[2][2].equals("X"))
                || (field[0][2].equals("X") && field[1][1].equals("X") && field[2][0].equals("X"))) {
            return "X";
        }
        if ((field[0][0].equals("0") && field[0][1].equals("0") && field[0][2].equals("0"))
                || (field[1][0].equals("0") && field[1][1].equals("0") && field[1][2].equals("X"))
                || (field[2][0].equals("0") && field[2][1].equals("0") && field[2][2].equals("0"))
                || (field[0][0].equals("0") && field[1][0].equals("0") && field[2][0].equals("0"))
                || (field[0][1].equals("0") && field[1][1].equals("0") && field[2][1].equals("0"))
                || (field[0][2].equals("0") && field[1][2].equals("0") && field[2][2].equals("0"))
                || (field[0][2].equals("0") && field[1][1].equals("0") && field[2][0].equals("0"))
                || (field[0][0].equals("0") && field[1][1].equals("0") && field[2][2].equals("0"))) {
            return "0";
        }
        if (field[0][0].equals("-") || field[1][0].equals("-") || field[2][0].equals("-")
                || field[0][1].equals("-") || field[1][1].equals("-") || field[2][1].equals("-")
                || field[0][2].equals("-") || field[1][2].equals("-") || field[2][2].equals("-")) {
            return null;
        }
        return "D";
    }

    String makeMove(int x, int y) {

        x -= 1;
        y -= 1;
        String result = this.checkGame();
        if (result != null) {
            return "Game was ended";
        }
        if (!field[x][y].equals("-")) {
            return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";
        }
        field[x][y] = player;
        result = checkGame();
        if (result != null) {
            if (result.equals("X")) {
                return "Player X won";
            } else if (result.equals("0")) {
                return "Player 0 won";
            } else {
                return "Draw";
            }
        }
        player = player.equals("X") ? "0" : "X";
        return "Move completed";
    }
}

//Если же ход возможен, то в поле следует поставить X или 0
// (зависит от того, кто сейчас ходил), и вернуть строку Move completed,
// если после этого хода игра не заканчивается.
// Если же этим ходом победил один из игроков, то метод должен вернуть строку вида {Player X/0 won}.
// Если игра уже завершена (выявлен победитель или ничья), но кто-то хочет походить дальше,
// то метод должен вернуть Game was ended.
//makeMove(int x, int y), принимающий два параметра — ряд и столбик, куда игрок хочет сделать ход.
// Если ход невозможен (клетка уже занята), то метод должен вернуть строку вида
// {Cell x, y is already occupied}.
// Если же после этого хода свободных клеток не осталось, а победителя нет, то метод должен вернуть Draw.
// Напишите класс TicTacToe (крестики-нолики).
//Примечание:
//Первым всегда ходит игрок X, потом 0.
//Пример:
//
//TicTacToe board = new TicTacToe();
//*Выводим поле в консоль, используя метод getField();
//System.out.println(board.makeMove(1, 1));
//*Выводим поле в консоль, используя метод getField();
//System.out.println(board.makeMove(1, 1));
//System.out.println(board.makeMove(1, 2));
//*Выводим поле в консоль, используя метод getField();
//System.out.println(board.makeMove(2, 1));
//System.out.println(board.makeMove(2, 2));
//System.out.println(board.makeMove(3, 1));
//System.out.println(board.makeMove(2, 2));
//*Выводим поле в консоль, используя метод getField();
//Вывод:
//
//['-', '-', '-']
//['-', '-', '-']
//['-', '-', '-']
//Move completed
//['X', '-', '-']
//['-', '-', '-']
//['-', '-', '-']
//Cell x, y is already occupied
//Move completed
//['X', '0', '-']
//['-', '-', '-']
//['-', '-', '-']
//Move completed
//Move completed
//Player X won
//Game was ended
//['X', '0', '-']
//['X', '0', '-']
//['X', '-', '-']