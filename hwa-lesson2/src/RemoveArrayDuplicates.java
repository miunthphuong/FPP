import java.util.Arrays;

public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        String[] names = {"horse", "dog", "cat", "horse", "dog"};
        prog4(names);
    }

    static void prog4(String[] names) {
        String[] uniqueNames = new String[names.length];
        int uniqueCount = 0;
 
        for (int i = 0; i < names.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueNames[j].equals(names[i])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNames[uniqueCount++] = names[i];
            }
        }
     
        String[] result = Arrays.copyOf(uniqueNames, uniqueCount);
        System.out.println("Unique names:" + Arrays.toString(result));
    }

}
