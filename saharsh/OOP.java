package Java.saharsh;

public class OOP {
    public static void main(String[]args){
        Student student= new Student();
        student.id= 10;
        student.name= "Ram";
        Result result = new Result();
        result.showResult(student);

        
    }
}

    class Test{
        private int a;
        public int getA(){
            return a;
        }
        public void setA(int x){
            this.a= x;
        }
    }

    class Result{
    public void showResult(Student s){
        System.out.println(s.name + " is pass");
    }
    
}
class Student {
    public int id;
    public String name;
    public void displayStudent(){
        System.out.println(id + ":" + name);
    }

    
}
   
