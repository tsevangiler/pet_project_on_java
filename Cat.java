public class Cat extends Animal {
    String name;
    int weigh;
    String sex;

    public Cat(String name, int weigh, String sex) {
        this.name = name;
        this.weigh = weigh;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }


    public int getWeigh() {
        return weigh;
    }


    public String catsSex() {
        return sex;
    }




    public void state() {
        System.out.println("Я поел вискас");
    }

    public void state(String z, int y) {
        System.out.println(z + y + " кг");
    }
}

