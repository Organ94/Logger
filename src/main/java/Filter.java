import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int theshoId;

    public Filter(int theshoId) {
        this.theshoId = theshoId;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value >= theshoId) {
                result.add(value);
                logger.log("Элемент " + value + " проходит");
            } else {
                logger.log("Элемент " + value + " не проходит");
            }
        }
        return result;
    }
}
