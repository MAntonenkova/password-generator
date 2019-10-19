import java.util.Random;
/*
Генератор паролей
*/
public class Solution {
    public static void main(String[] args){
        System.out.println(getPassword());
    }

    public static String getPassword(){
       Random rand = new Random();

      return rand.ints(48, 123)
                .filter(i -> (i <= 57 || (i >= 65 && i <= 90) || i >= 97))
                .limit(8)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}

