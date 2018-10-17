import org.infai.seits.sepl.operators.Message;
import org.infai.seits.sepl.operators.OperatorInterface;

public class ValueDiff implements OperatorInterface {

    private Double previousValue;

    @Override
    public void run(Message message) {
        Double currentValue = message.getInput("value").getValue();
        Double diff;
        if (previousValue != null) {
            diff = currentValue - previousValue;
        } else {
            diff = 0.0;
        }
        previousValue = currentValue;
        message.output("diff", (Math.round(diff * 1000.0) / 1000.0));
    }

    @Override
    public void config(Message message) {
        message.addInput("value");
    }
}
