public class SearchResults {
    String title;
    String location_type;
    String woeid;
    String latt_long;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public String getWoeid() {
        return woeid;
    }

    @Override
    public String toString() {
        return "SearchResults{" +
                "title='" + title + '\'' +
                ", location_type='" + location_type + '\'' +
                ", woeid='" + woeid + '\'' +
                ", latt_long='" + latt_long + '\'' +
                '}';
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public String getLatt_long() {
        return latt_long;
    }

    public void setLatt_long(String latt_long) {
        this.latt_long = latt_long;
    }
}
