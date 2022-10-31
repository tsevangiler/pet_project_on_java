public class Application {
    public static void main(String[] args) {
        Kotik zhuzha = new Kotik(15, "zhuzha", 4, "миу");
        Kotik mars = new Kotik();
        setKotik(mars, 10, "mars", 10, "мур");
        System.out.println("Милота кота = " + zhuzha.getPrettiness() + " Имя кота = " + zhuzha.getName() + " Вес кота = " + zhuzha.getWeight() + " Голос кота = " + zhuzha.getMeow());
        System.out.println(Kotik.getCountcat());
        System.out.println(zhuzha.getMeow().equals(mars.getMeow()) ? "коты мурлыкают одинаково" : "коты мурлыкают по-разному");
        zhuzha.liveAnotherDay();
    }
    public static void setKotik(Kotik mars, int prettiness, String name, int weight, String meow) {
        mars.setPrettiness(prettiness);
        mars.setName(name);
        mars.setWeight(weight);
        mars.setMeow(meow);
    }


}
