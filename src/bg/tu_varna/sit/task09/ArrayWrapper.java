package bg.tu_varna.sit.task09;

public class ArrayWrapper {
    private final String[] args;
    private String nextArg;
    private int position;

    public ArrayWrapper(String[] args) {
        this.args = args;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < args.length;
    }

    public String getArg() {
        return args[position++];
    }
}
