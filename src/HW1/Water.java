package HW1;

public class Water extends Obstacle {

    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    String doIt(Competitor competitor) {
        return competitor.swim(dist);
    }
}
