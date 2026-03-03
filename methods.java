public class Method {
    //an example method
    public void printMessage(){
        System.out.println("Hello Good morning!");
    }
    public static void main(String[] args) {
        //creating an instance of the class
        //containing the method
        Method obj = new Method();
        //calling the method
        obj.printMessage();//parameterless method does not return anything
    }
    
}
