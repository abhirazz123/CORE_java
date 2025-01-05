import java.util.ArrayList;
import java.util.Collections;

class ArrayListOps {
    
    public ArrayList<Integer> convertArrayListtoInt(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(0);
        }
        return result;
    }

    public ArrayList<Integer> reverse(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
