package Easy;

public class Human {
    String name;
    int age;
    int weight;
    String address;
    String work;

    public Human(int age, int weight, String address, String work) {
        this.name = "Ivan";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.weight = 80;
        this.work = work;
    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, String address) {
        this.name = name;
        this.age = 45;
        this.weight = 80;
        this.address = address;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 80;
    }
}


//        Создайте класс Human со следующими полями://
//        name (имя, строка);
//        age (возраст, число);
//        weight (вес, число);
//        address (адрес, строка);
//        work (работа, строка).

//        Создайте 5 инициализаторов (конструкторов), принимающих://
//        name, age;
//        name, address;
//        name, age, weight;
//        name, age, work;
//        age, weight, address, work.

//        Задача конструктора — создать полноценный объект
//        (сделать его валидным).
//        То есть, если вес неизвестен,
//        то нужно указать хоть какой-нибудь средний вес,
//        то же касается возраста и имени,
//        а вот адреса и работы может и не быть (равны null).