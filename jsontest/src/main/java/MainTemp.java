import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MainTemp {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        System.out.println("Enter the city: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city = br.readLine();
        SearchResults[] searchResultsCity = mapper.readValue(new URL
                ("https://www.metaweather.com/api/location/search/?query=" + city), SearchResults[].class);
        String woeid = searchResultsCity[0].getWoeid();
        System.out.println(searchResultsCity[0]); // Ok
        Forecast forecasts = mapper.readValue(new URL
                ("https://www.metaweather.com/api/location/" + woeid), Forecast.class);
        System.out.println(forecasts.getConsolidatedWeather().get(0).getTheTemp()); //OK
    }
}
