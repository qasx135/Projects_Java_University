package LAB4.number4;

public class Memory extends Component{
    Names name;
    public Memory(Names name) {
        this.name = name;
    }

    @Override
    public String iDo() {
        return "I am holding data";
    }
}
