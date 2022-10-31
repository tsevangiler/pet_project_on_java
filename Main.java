public class Main {
    public static void main(String[] args) {

        Cat mars = new Cat("Марс", 1, "м");
        Cat zhuzha = new Cat("Жужа", 2, "ж");
        System.out.println(mars.getName() + " " + mars.getWeigh() + " " + mars.catsSex());
        System.out.println(zhuzha.getName() + " " + zhuzha.getWeigh() + " " + zhuzha.catsSex());
        mars.voice();
        zhuzha.voice("мяу");
        mars.state();
        zhuzha.state("Я поела фрискас ", 3);
        Dog dog = new Dog ();
        dog.voice();
        dog.voice("bark");
        Lizard marta = new Lizard();
        marta.height("Мой хвост отрос на ", 2);
    }
}
