public class Greeter {
    public void greet(Gretting gretting){
        gretting.perform();
    }
    public static void main(String args[]){
        Greeter gr=new Greeter();
        Helloworld hlw= new Helloworld();
        gr.greet(hlw);
    }
}
