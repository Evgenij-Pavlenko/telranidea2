public class Score {

    int score;
    String name;

    public int getScore() {
        return score;
    }

    public Score(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
