package Easy;

public class Bell {

    private static int i = 0;

    public static void sound() {

        if (i % 2 == 0) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        i++;
    }
}
//    Напишите класс Bell, имеющий всего один метод sound,
//    если он был вызван, то метод должен напечатать в консоль ding или dong.
//    Первый звук всегда ding, второй — dong, третий — снова ding и так далее.