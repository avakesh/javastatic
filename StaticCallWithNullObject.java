
public class StaticCallWithNullObject {
    //static method 
    public static void getEmployeeName(){
        System.out.println("Avakesh Kumar");
    }
    
    public static void main(String av[]){
        //declare object with null
        StaticCallWithNullObject staticCallWithNullObject = null;
        //call static method with null object
        staticCallWithNullObject.getEmployeeName();
    }
}

//output -- It will print 'Avakesh Kumar'.
