package abcd;

public class G extends C{
    private int gVariable;

    public G(int aVariable, int cVarialble, int gVariable) {
        super(aVariable, cVarialble);
        this.gVariable = gVariable;
    }

    public G(int cVarialble, int gVariable) {
        super(cVarialble);
        this.gVariable = gVariable;
    }

    public G(int gVariable) {
        this.gVariable = gVariable;
    }



}
