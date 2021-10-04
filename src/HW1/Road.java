package HW1;

public class Road extends Obstacle {
    private int dist;

    public Road(int dist) {
        this.dist = dist;
    }

    @Override
    String doIt(Competitor competitor) {
        competitor.run(dist);
        return null;
    }
}
