package Chapter9;

public class Ex9_2 {
    public static void main(String [] args){
        Person p1 = new Person(80111);
        Person p2 = new Person(80111);

        System.out.println(p1.equals(p2));
    }
}

class Person{
    long id;

    Person(long id){
        this.id = id;
    }

    public boolean equals(Object obj){

        if(obj instanceof  Person) {
            return id == ((Person) obj).id;
            // 하하하...
        }else{return false;}


    }
}
