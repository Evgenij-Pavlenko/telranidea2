import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class MainTemp {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
                System.out.println("Enter the city: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String city = br.readLine();
        SearchResults[] searchResultsCity = mapper.readValue(new URL
                ("https://www.metaweather.com/api/location/search/?query=" + city), SearchResults[].class);
        String woeid = searchResultsCity[0].getWoeid();
        System.out.println(woeid); // Ok

        SearchResults[] searchResultsWeather = mapper.readValue(new URL
                ("https://www.metaweather.com/api/location/" + woeid), SearchResults[].class);
        String consol = searchResultsWeather[0].consolidated_weather[0];
//        String temp = consol[0].
//        for (String s: consol){
//            System.out.println(s.the_temp);
//        }
        System.out.println(consol);
    }
}
