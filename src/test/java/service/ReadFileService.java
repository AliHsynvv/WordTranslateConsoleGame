package service;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public abstract class ReadFileService {
    public static void readFileIntoMap(HashMap lists,String location) throws Exception{
        Scanner s = new Scanner(new File(location));
        while (s.hasNextLine()) {
            lists.put(s.nextLine(), s.nextLine());
        }
    }
}
