import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new File("test.json"), Person.class);
        System.out.println(person);

        Person p1 = new Person();
        p1.setFirstName("Ivan");
        p1.setLastName("Petrov");
        p1.setAge(15);

        //HomeWork:
        //Create class Address with City, Street, HausNumber and corresponding json,
        //implement serialization and deserialization

        mapper.writeValue(new File("out.json"), p1);

    }
}

