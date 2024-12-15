
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CreatingStrings{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Set<String> res = rec(s);
        System.out.println(res.size());
        for(String str : res)
        {
            System.out.println(str);
        }
    }
    public static Set<String> rec(String s) {
        if(s.isEmpty())
        {
            Set<String> done = new TreeSet<>();
            done.add("");
            return done;
        }
        Set<String> permutations = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String s1 = s.substring(0, i) + s.substring(i + 1);
            Set<String> ps = rec(s1);
            for (String p : ps) {
                permutations.add(c + p);
            }
        }
        return permutations;
    }
}