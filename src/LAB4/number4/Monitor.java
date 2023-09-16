package LAB4.number4;

public class Monitor extends Component{
    Names name;
    public Monitor(Names name) {
        this.name = name;
    }

    @Override
    public String iDo() {
        return "I am showing info";
    }
}
