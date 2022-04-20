import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws FileNotFoundException {
        List<Person> personList = new ArrayList<Person>();

        // ABRIR DOCUMENTO
        File file = new File("PersonData.txt");
        Scanner scan = new Scanner(file);

        // LEER DOCUMENTO Y PROCESAR INFORMACIÓN
        while (scan.hasNextLine()) {
            Person p = new Person();

            String buffer = scan.nextLine(); // READ LINE
            String[] personInfo = buffer.split(":"); //SPLIT LINE BY ':'

            // COLOCAR INFORMACION
                //Nombre
            p.setName(personInfo[0]);
                //Poblacion
            p.setLocation(personInfo[1]);
            if(p.getLocation().isEmpty()) p.setLocation("Desconocida");
                //Edad
            if (personInfo.length>2){
                p.setAge(Integer.valueOf(personInfo[2]));
            }else{
                p.setAge(-1);
            }

            // AGREGAR PERSONA A LISTA
            personList.add(p);
        }
        // FILTRAR E IMPRIMIR DATOS
        personList.stream()
                .filter(person -> person.getAge() < 25 && person.getAge() > 0)
                .forEach(person-> System.out.println(person.print()));


    }

}
