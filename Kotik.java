public class Kotik {
    public int prettiness;
    public String name;
    public int weight;
    public String meow;

    public int fullness;

    public static int countcat;

    public final int foodie = 5;

    public String chicken;



    public void liveAnotherDay() {
        for (int i = 0; i < 25; i++) {
            int b = (int) (Math.random() * 5 + 1);
            switch (b) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
                case 4:
                    eat();
                    break;
                case 5:
                    voice();
                    break;
                default:
                    System.out.println("Такого метода нет");
            }
        }
    }

    public static int getCountcat() {
        return countcat;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        countcat ++;
    }

    public Kotik() {
        countcat ++;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public boolean play() {
        if (fullness > 0) {
            System.out.println("Котик играет");
            fullness--;
        } else {
            System.out.println("Я хочу кушать");
            eat();
        }
        return true;
    }

    public boolean sleep() {
        if (fullness > 0) {
            System.out.println("Котик на релаксе");
            fullness--;
        } else {
            System.out.println("Я хочу кушать");
            eat();
        }
        return true;
    }

    public boolean chaseMouse() {
        if (fullness > 0) {
            System.out.println("Котик гоняет мышку");
            fullness--;
        } else {
            System.out.println("Я хочу кушать");
            eat();
        }
        return true;
    }

    public boolean eat(int foodie) {
        System.out.println("Котик наелся");
        fullness = foodie + fullness;
        return true;
    }

    public boolean eat(int foodie, String chicken) {
        System.out.println("Котик хочет курочку");
        fullness = foodie + fullness;
        return true;
    }

    public boolean eat() {
        System.out.println("Котик ест");
        eat(8, "Индейку");
        return true;
    }

    public boolean voice() {
        if (fullness > 0) {
            System.out.println("Котик злобно смеется");
            fullness--;
        } else {
            System.out.println("Я хочу кушать");
            eat();
        }
        return true;
    }
}
