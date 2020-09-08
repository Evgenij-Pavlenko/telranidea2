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

        List<Address> address = new ArrayList<Address>();
        address.add(new Address("Berlin", "FirstStr", 1));
        address.add(new Address("Potsdam", "SecondStr", 2));
        // !!!!!!!!!!! Need default Conctructor, for this to work

//        Address adr1 = new Address();
//        adr1.setCity("Berlin");
//        adr1.setStreet("FirstStr");
//        adr1.setHausNum(1);
//        address.add(adr1);
//        Address adr2 = new Address();
//        adr1.setCity("Potsdam");
//        adr1.setStreet("SecondStr");
//        adr1.setHausNum(2);
//        address.add(adr1);
//        address.add(adr2);
        p1.setAddress(address);

        mapper.writeValue(new File("out.json"), p1);

    }
}

