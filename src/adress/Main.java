package adress;

public class Main {
    public static void main(String[] args) {
        Adress ad= new Adress();
        ad.setAppartment("Appartment");
        ad.setCountry("Country");
        ad.setHouse("House");
        ad.setInndex("inndex");
        ad.setSity("Sity");

        System.out.println(ad.getInndex());
        System.out.println(ad.getAppartment());
        System.out.println(ad.getCountry());
        System.out.println(ad.getHouse());
        System.out.println(ad.getStreet());
        System.out.println(ad.getSity());

    }
}
// Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Address.
// В теле класса требуется создать поля: index, country, city, street, house, apartment.
// Для каждого поля, создать метод с двумя методами доступа (get, set) Создать экземпляр класса Address.
// В поля экземпляра записать информацию о почтовом адресе. Выведите на экран значения полей, описывающих адрес.