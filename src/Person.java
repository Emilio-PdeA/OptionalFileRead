public class Person {
    String name; // nombre
    String location; // población
    int age; // edad

    // CONSTRUCTORS
    public Person(){}
    public Person(String name, String location, int age)
    {
        this.name = name;
        this.location = location;
        this.age = age;
    }

    // SETTERS
    public void setData(String name, String location, int age){
        this.name = name;
        this.location = location;
        this.age = age;
    }
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setLocation(String location){this.location = location;}

    // GETTERS
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getLocation(){return location;}

    // FUNCTIONS
    public String print(){
        return "Nombre:" + name + ". Poblacion:" + location + ". Edad:" + age;
    }

}
