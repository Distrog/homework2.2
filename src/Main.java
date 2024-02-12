public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 99,
                55, 78, 85, 44);
        Gryffindor germiona = new Gryffindor("Гермиона", "Грейнджер", 80,
                65, 85, 78, 66);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 75,
                40, 87, 75, 60);

        Slytherin draco = new Slytherin("Драко","Малфой",65,77,45,
                66,77,88,100);
        Slytherin graham = new Slytherin("Грэхэм","Монтегю",76,67,65,
                76,87,78,80);
        Slytherin gregory = new Slytherin("Грегори","Гойл",88,65,75,
                78,65,79,75);

        Hufflepuff zaharia = new Hufflepuff("Захария","Смит",85,35,
                76,85,87);
        Hufflepuff sedric = new Hufflepuff("Седрик","Диггори",95,75,
                95,98,99);
        Hufflepuff justin = new Hufflepuff("Джастин","Финч-Флитчли",65,55,
                66,76,67);

        Ravenclaw joe = new Ravenclaw("Чжон","Чанг",56,45,66,77,
                66,76);
        Ravenclaw padma = new Ravenclaw("Падма","Патил",76,55,68,
                85, 65,56);
        Ravenclaw marcus = new Ravenclaw("Маркус","Белби",75,88,86,
                95, 77,85);

        draco.compare(gregory);
    }
}