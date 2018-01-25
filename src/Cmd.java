public class Cmd {
    private String text;

    public Cmd(String text){
        this.text = text ;

    }

    public void print(){
        System.out.println("The message is: " + this.text);
    }
}
