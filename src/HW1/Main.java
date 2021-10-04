package HW1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(                                  // Создаем полосу препятствий
                new Road(5),
                new Water(2),
                new Road(5),
                new Wall(2),
                new Road(5)
        );

        Team team = new Team("Champion",                  // Создаем команду
                new Competitor[]{
                        new Cat("Vasya", "red", 10, 2, 5),
                        new Dog("Rex", "brown", 15, 10, 5),
                        new Turtle("Nimble", "green", 1, 4,0),
                        new Human("Jack", 42, 20, 2)
                });

        course.doIt(team);                                           // Просим команду пройти полосу
        team.showResults();                                         // Показываем результаты
    }
}