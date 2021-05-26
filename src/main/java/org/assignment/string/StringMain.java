package org.assignment.string;

public class StringMain {  static boolean check(String str) {
    // Compute sum of digits
    int n = str.length();
    int digitSum = 0;
    for (int i = 0; i < n; i++)
        digitSum += (str.charAt(i) - '0');

    // Check if sum of digits is
    // divisible by 3.
    return (digitSum % 3 == 0);
}
    public static void main(String[] args) {
        String st = "013";
        String prvStr = st;
        String newStr = null;
        char []replaceElement={'2','5','8'};

        char ch[] = st.toCharArray();
//        System.out.println(ch);
//        System.out.println(st.indexOf(ch[0]));
//        System.out.println(newStr);

        if(check(prvStr)){
            System.out.println("Yes the String "+prvStr+" is divisible by 3");
        }
        else
        {
            System.out.println("No the String "+prvStr+" is not divisible by 3");
            if (prvStr.indexOf(ch[0]) == 0)
                newStr = st.replace(ch[0],replaceElement[0] );
            prvStr = newStr;
            System.out.println(check(prvStr));
        }
    }
}
