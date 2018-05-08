package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    try {
        Map<String,Integer> map = new HashMap<String, Integer>();
      File f = new File("src/lab5/Test.java");
      BufferedReader b = new BufferedReader(new FileReader(f));
      String readLine = "";
      String [] readword;

      while ((readLine = b.readLine()) != null) {
          readword = readLine.split("\\s+");
          String word;
          for (int i = 0; i < readword.length; i++){
              word = readword[i];
              if (!map.containsKey(word)){map.put(word, 1);}
              else { map.put(word, map.get(word) + 1);}

          }

        System.out.println(readLine);
          System.out.println(map.entrySet());

      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    }
  }

