import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            MyClass myclass=new MyClass("Temirlan","Zhzukulov",(byte) 20,"Plov");
            new MyClass(myclass.getLessons());
            System.out.printf( """
           name : %s
           surname: %s
           age : %d
           getLessons : %s
           favoritecook : %s
           
            """, myclass.getName(),
                    myclass.getSurname(),
                    myclass.getAge(),
                    Arrays.toString(myclass.getLessons("Java   "," soft skills   "," English  "," Tech talk " )),
                    myclass.getFavoritecook());

    }
}