package HW1;

public class Team {
    private String teamName;
    private Competitor[] competitors;
    private StringBuilder results;

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
        this.results = new StringBuilder();
    }

    public void setResult(String result) {
        results.append(result);
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println("Команда " + teamName + ": ");
        for (Competitor c: competitors) {
            c.info();
        }
    }
}
