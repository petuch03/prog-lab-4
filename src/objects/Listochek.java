package objects;

public class Listochek extends Paper{
    public Listochek(){
        super();
    }

    public Listochek(String text){
        super(text);
    }

    @Override
    public String toString() {
        return "Listochek{" +
                "text='" + super.getText() + '\'' +
                '}';
    }

    @Override
    public void setContent(Paper newContent) {
        super.setText(newContent.getText());
    }
}
