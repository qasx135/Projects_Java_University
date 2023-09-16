package LAB4.number4;

public class Processor extends Component{
    Processors proc;

    public Processor(Processors proc) {
        this.proc = proc;
    }

    public Processors getProc() {
        return proc;
    }

    @Override
    public String iDo() {
        return "I am processor and i am doing calculations";
    }

}
