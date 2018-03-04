package prototypePatter;

public class Email implements Cloneable {
    private String sender;
    private String body;
    private String recevier;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
