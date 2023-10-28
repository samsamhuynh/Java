// Class and Object:
class Person
{
    /*
     * there are four properties,
     * name of string type, age of int type
     * gender of string type, weight of float type
     */
    private String name;
    private int age;
    private String gender;
    private float weight;
    // this is a constructor with no return type, the same name as the class, no parameters
    public Person(){

    }
    //this is a constructor with two parameters
    public Person(String name, int age){
        // use parameters to set object's name and age
        this.name = name;
        this.age = age;
    }
    // this is a constructor with four parameters
    public Person(String name, int age, String gender, float weight){
        // use parameters to set object's name, age, gender and weight
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    // this is an object method
    public void personInfo(){
        System.out.println("Name: " + this.name + "\nAge: "+ this.age + "\nGender: " + this.gender + "\nWeight: "+this.weight);
    }
}

public class objectTest{
    public static void main(String[] args){
        // use 'new' to create an instance of class Person
        Person p = new Person("aaa",18,"male",50.5f);  // p refers to  an object
        /* you can try these two different construction methods, and see what the output is.
         * Person p  = new Person();
         * Person p = new Person("aaa",18);
         */
        // use object to invoke method personInfo()
        p.personInfo();
    }
}
