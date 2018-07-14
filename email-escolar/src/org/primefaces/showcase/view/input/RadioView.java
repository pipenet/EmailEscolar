package org.primefaces.showcase.view.input;
 
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class RadioView {
     
    private String console;    
    private String city;
    private String city2;  
    private List<String> cities;  
    private String datos;
     
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("1");
        cities.add("2");
        cities.add("3");
        cities.add("4");
        cities.add("5");
        cities.add("6");
        cities.add("7");
        cities.add("8");
        cities.add("Amsterdam");
    }
 
    public String getConsole() {
        return console;
    }
 
    public void setConsole(String console) {
        this.console = console;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getCity2() {
        return city2;
    }
 
    public void setCity2(String city2) {
        this.city2 = city2;
    }
 
    public String getDatos() {
        return datos;
    }
 
    public void setDatos(String datos) {
        this.datos = datos;
    }
 
    public List<String> getCities() {
        return cities;
    }
}