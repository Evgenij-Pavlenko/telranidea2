import java.util.List;

public class Forecast {
    List<ConsolidatedWeather> consolidatedWeather;

    public Forecast() {
    }

    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "consolidatedWeather=" + consolidatedWeather +
                '}';
    }
}
