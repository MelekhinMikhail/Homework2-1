public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", 2022-35, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 2022-29, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 2022-28, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 2022-27, "Москва", "директор по развитию бизнеса");

        maxim.greeting();
        anya.greeting();
        katya.greeting();
        artem.greeting();

        System.out.println();
        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();

    }
}