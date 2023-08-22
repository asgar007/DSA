package test;

import java.util.*;
public class MergeName {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
      Set<String> set = new LinkedHashSet<>();
      for(String s1 : names1){
        set.add(s1);
      }
      for(String s2 : names2){
        set.add(s2);
      }
      System.out.println(set);
      String[] arr = new String[set.size()];
      Iterator newData = set.iterator();
      int i = 0;
      while(newData.hasNext()){
        arr[i] = (String) newData.next();
        i++;
      }
      return arr;
      
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeName.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
