public class SplitNumStringSpecial {
    public static void main(String args[]) {
        String str = "wel1233@#$$%%come";
        StringBuilder num = new StringBuilder();
        StringBuilder alpha = new StringBuilder();
        StringBuilder splchar = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            } else if (Character.isLetter(str.charAt(i))) {
                alpha.append(str.charAt(i));
            } else {
                splchar.append(str.charAt(i));
            }
        }

        System.out.println("Numbers: " + num);
        System.out.println("Alphabets: " + alpha);
        System.out.println("Special Characters: " + splchar);
    }
}