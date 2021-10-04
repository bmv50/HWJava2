package HW1;

public class Animal implements Competitor {
    private String name;
    private String color;

    private int maxRunDistance;
    private int maxSwimDistance;
    private int maxJumpHeight;

    private boolean onDistance = true;

    public Animal(String name, String color, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.color = color;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance){
            System.out.println(name + " цвета " + color + " пробегает " + dist + "km");
        }else {
            System.out.println(name + " цвета " + color + " не пробегает " + dist + "km");
            onDistance = false;
        }
        return null;
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance){
            System.out.println(name + " цвета " + color + " проплывает " + dist + "km");
        }else {
            System.out.println(name + " цвета " + color + " не проплывает " + dist + "km");
            onDistance = false;
        }
        return null;
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(name + " цвета " + color + " перепрыгивает " + height + "m");
        }else {
            System.out.println(name + " цвета " + color + " не перепрыгивает " + height + "m");
            onDistance = false;
        }
        return null;
    }

    @Override
    public boolean onDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + (onDistance ? " прошел" : " не прошел" ));
    }
}
