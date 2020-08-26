public class ConsolidatedWeather {
    String theTemp;

    public ConsolidatedWeather() {
    }

    public String getTheTemp() {
        return theTemp;
    }

    public void setTheTemp(String theTemp) {
        this.theTemp = theTemp;
    }

    @Override
    public String toString() {
        return "ConsolidatedWeather{" +
                "theTemp='" + theTemp + '\'' +
                '}';
    }
}
