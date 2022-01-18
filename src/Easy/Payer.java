package Easy;

public class Payer {

    private String surname;
    private String name;
    private String address;
    private String cardNumber;

    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber + ".";
    }
}
//    Опишите класс Payer. В классе должны быть следующие поля:
//
//                  surname (фамилия, строка);
//                  name (имя, строка);
//                  address (адрес, строка);
//                  cardNumber (номер карты).
//                  Реализуйте конструктор, принимающий эти параметры
//                  (surname, name, address, cardNumber) и
//        метод public toString(),
//        возвращающий строку вида Payer:
//        surname name, address: address, card: cardNumber.