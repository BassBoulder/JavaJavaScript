import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    
    private Map<Integer, String> Mappy = new HashMap<>();
    
    public Map<Integer, String> getCodes() { 
        return Mappy;
    }

    public void setDialingCode(Integer code, String country) {
        Mappy.put(code, country);
    }

    public String getCountry(Integer code) {
        return Mappy.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!Mappy.containsKey(code) && !Mappy.containsValue(country)) {
            Mappy.remove(country);
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        return Mappy.entrySet().stream().filter(e -> e.getValue().equals(country)).map(Map.Entry::getKey).findFirst().orElse(null);
    }
    
    public void updateCountryDialingCode(Integer code, String country) {
        Integer CurrentCode = findDialingCode(country);
        if (CurrentCode != null) {   
            Mappy.remove(CurrentCode);
            setDialingCode(code, country);
        }
    }
}
