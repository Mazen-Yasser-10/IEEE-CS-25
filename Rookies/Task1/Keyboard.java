package IEEECS25.Rookies.Task1;

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] chars ={
            {'a','v','x','s','w','d','f','g','u','h','j','k','n','b','i','o','q','e','a','r','y','c','q','z','t','z','m','l',',','.'},
            {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',',',';','.','/'},
            {'s','n','v','f','r','g','h','j','o','k','l',';',',','m','p','p','w','t','d','y','i','b','e','c','u','x','.',';','/','/'}
        };
        char c = in.nextLine().charAt(0);
        int index;
        if(c == 'R')
        {
            index = 0;
        }
        else
        {
            index = 2;
        }
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                sb.append(chars[index][s.charAt(i) - 'a']);
            } else if (s.charAt(i) == ',') {
                sb.append(chars[index][26]);
            } else if (s.charAt(i) == ';') {
                sb.append(chars[index][27]);
            } else if (s.charAt(i) == '.') {
                sb.append(chars[index][28]);
            }
            else
            {
                sb.append(chars[index][29]);
            }
        }
        System.out.print(sb);
    }
}
