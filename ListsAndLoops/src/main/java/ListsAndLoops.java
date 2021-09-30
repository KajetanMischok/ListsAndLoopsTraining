import java.util.ArrayList;
import java.util.List;

public class ListsAndLoops {
    /**
     * Returns a list with numbers from 1 to 10
     * @return Result list
     */
    public static List<Integer> getListOneToTen(){
        return List.of(1,2,3,4,5,6,7,8,9,10);
    }

    /**
     * Returns a list with every second number fromm 100 to 0
     * @return Result list
     */
    public static List<Integer> getEverySecondNumberFrom100to0(){
        List<Integer> result = new ArrayList<>();

        for (int i = 100; i >= 0; i = i-2){
            result.add(i);
        }

        return result;
    }

    /**
     * Returns a String with a given number of "X"s
     * @param length the number of "X"s
     * @return String
     */
    public static String getXString(int length){
        String result = "";
        for (int i = 0; i < length; i++){
            result = result + "X";
        }

        return result;
    }

    /**
     * Returns the initials for the given name. For example: Kajetan Mischok -> "KM"
     * @param firstName firstname
     * @param lastName lastname
     * @return String that contians initials
     */
    public static String getInitials(String firstName, String lastName){
        return firstName.substring(0,1) + lastName.substring(0,1);
    }

    /**
     * Returns the reverted String. For example "Text" -> "txeT"
     * @param str String to be reverted
     * @return the reverted String
     */
    public static String revertString(String str){
        String result = "";

        for (int i = str.length(); i > 0; i--){
            result += str.substring(i-1, i);
        }

        return result;
    }

    /**
     * Returns a String with a square of * in the given size. For example: ***
     *                                                                     ***
     *                                                                     ***
     * @param size number of stars for height and length
     * @return
     */
    public static String getStarSquare(int size){
        if (size == 1){
            return "*";
        }

        String result = "";
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                result += "*";
            }
            result += "\n";
        }

        return result;
    }
}
