package Java17.code.TestBlock;

public class TestBlockEx {
    public static void main(String[] args) {
        //Before Java17
        String str="{\n"+
                "\"id\":101\n"+
                "\"name\":\"Hari\"\n"+
                "}";
        //System.out.println(str);

        //After Java17
        String str1= """
                {
                "id":101,
                "aame":"Hari"
                }
                """;
        System.out.println(str1);

    }


}
