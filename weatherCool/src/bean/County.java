package bean;

public class County {
    private int countyID;
    private String countyName;
    private String weatherID;
    private int cityID;

    public int getId(){
        return countyID;
    }
    public String getCountyName(){
        return countyName;
    }
    public String getWeatherID(){
        return weatherID;
    }
    public int getCityID(){
        return cityID;
    }

    public void setId(int id){
        this.countyID = id;
    }
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public void setWeatherID(String weatherID){
        this.weatherID = weatherID;
    }
    public void setCityID(int cityID){
        this.cityID = cityID;
    }
}
