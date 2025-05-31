package AllConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceofEach {

    public static void occ(String name){
        char[] ch=name.toCharArray();
        Map<Character,Integer> cha=new LinkedHashMap<>();
        for(int i=0;i<ch.length;i++){
            if(cha.containsKey(ch[i])){
                cha.put(ch[i],cha.get(ch[i])+1);
            }
            else{
                cha.put(ch[i],1);
            }
        }
        System.out.println(name+":-"+cha);
    }

    public static void main(String[] args){
        occ("majjarehsrikumar");
    }
}
