import java.util.*;
 
class program2 {
    public static void main(String[] args)
    {
        // Creating a hash set of strings
        Set<String> s = new HashSet<String>();
        s.add("Geeks");
        s.add("for");
 
        int n = s.size();
        String arr[] = new String[n];
 
        int i = 0;
        for (String x : s)
            arr[i++] = x;
 
        for (String x : arr)
            System.out.println(x);
    }
}