import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {
        List<Person> personList = new ArrayList<Person>();

        //OPEN FILE
        File file = new File("C:\\Users\\emilio.perez\\Documents\\JAVA\\Ejercicios\\OptionalFileRead\\src\\PersonData.txt");
        Scanner scan = new Scanner(file);

        // READ FILE & PROCESS DATA
        while (scan.hasNextLine()) {
            Person p = new Person();

            String buffer = scan.nextLine(); // READ LINE
            String[] personInfo = buffer.split(":"); //SPLIT LINE BY ':'

            // SET DATA
            //Name
            p.setName(personInfo[0]);
            //Location
            p.setLocation(personInfo[1]);
            if(p.getLocation().isEmpty()) p.setLocation("Desconocida");
            //Age
            if (personInfo.length>2){
                p.setAge(Integer.valueOf(personInfo[2]));
            }else{
                p.setAge(-1);
            }

            // ADD PERSON TO LIST
            personList.add(p);
        }
        // FILTER AND PRINT DATA
        personList.stream().filter(person -> person.getAge() < 25 && person.getAge() > 0).forEach(s-> System.out.println(s.print()));


    }

}
