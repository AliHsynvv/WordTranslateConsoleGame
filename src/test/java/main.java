import java.util.*;

import menuUtil.MenuUtil;
import service.ReadFileService;

public class main {

    public static void main(String[] args) throws Exception {
//fill hashmap
        HashMap<String, String> lists = new HashMap<>();
        ReadFileService.readFileIntoMap(lists, "C:\\Users\\gsynv\\OneDrive\\Masaüstü\\Programming\\Java projects\\wordTranslateGame\\words.txt");
//menu
        MenuUtil.menu(lists);

//result english

    }
}