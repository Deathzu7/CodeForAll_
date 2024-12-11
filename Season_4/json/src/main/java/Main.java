import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

ObjectMapper mapper = new ObjectMapper();
MyPojo myPojo = new MyPojo();


try {
   myPojo = mapper.readValue(new URL("https://ipinfo.io/json"), MyPojo.class);
    String jsonString = mapper.writeValueAsString(myPojo);
    mapper.writeValue(new File("result.json"), myPojo);
    System.out.println(jsonString);

} catch (Exception e) {
    throw new RuntimeException(e);
}

    }

}
