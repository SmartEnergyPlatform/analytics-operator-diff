import org.infai.seits.sepl.operators.Stream;

public class Operator {

    public static void main(String[] args) {
        Stream stream  = new Stream();
        ValueDiff valueSum = new ValueDiff();
        stream.start(valueSum);
    }
}
