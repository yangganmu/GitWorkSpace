package bean;

public class City {
    private int id;
    private String cityName;
    private int provinceID;

    public int getId(){
        return id;
    }
    public String getCityName(){
        return cityName;
    }
    public int getProvinceID(){
        return provinceID;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public void setProvinceID(int provinceID){
        this.provinceID = provinceID;
    }
}
