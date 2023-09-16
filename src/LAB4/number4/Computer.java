package LAB4.number4;

public class Computer {
    private Names name;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Names name,
                    Processor processor,
                    Memory memory,
                    Monitor monitor) {
        this.memory = memory;
        this.name = name;
        this.monitor = monitor;
        this.processor = processor;
    }

    public Names getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Производитель -> " + name +
                " Процессор -> " + processor.proc +
                " Память -> " + memory.name +
                " Монитор -> " + monitor.name;

    }
}
