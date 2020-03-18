public class StringTest3 {
    public static void main(String[] args) {
        String str = "devil";
        char[] ch = str.toCharArray();

        System.out.print(str + " ");
        for (int i=str.length()-1; i>=0; i-- ) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}