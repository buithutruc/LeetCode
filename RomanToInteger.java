public class RomanToInteger {

    //when 'I' is placed before V or X, first remove the value of I, then change the value of V or X (minus 1) before adding into the sum
    //the same principle applies to X and C
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (val == 'I'){
                sum += 1;
            }
            if (val == 'V'){

                if (i>0 && s.charAt(i-1) == 'I'){
                    sum = sum - 1 + 4 ;
                } else  sum += 5;
            }
            if (val == 'X'){
                if (i>0 && s.charAt(i-1) == 'I'){
                    sum = sum - 1 + 9;
                }else  sum += 10;
            }
            if (val == 'L'){

                if (i>0 && s.charAt(i-1) == 'X'){
                    sum = sum - 10 + 40;
                } else sum += 50;
            }

            if (val == 'C'){

                if (i>0 && s.charAt(i-1) == 'X'){
                    sum = sum - 10 + 90;
                } else sum += 100;
            }
            if (val == 'D'){

                if (i>0 && s.charAt(i-1) == 'C'){
                    sum = sum - 100 + 400;
                } else sum += 500;
            }
            if (val == 'M'){
                if (i>0 && s.charAt(i-1) == 'C'){
                    sum = sum - 100 + 900;
                } else  sum += 1000;
            }}

    return sum;
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println("case 1: s = \"III\". Output: " + romanToInteger.romanToInt(s1));//expected: 3
        System.out.println("case 2: s = \"LVIII\". Output: " + romanToInteger.romanToInt(s2));//expected: 58
        System.out.println("case 3: s = \"MCMXCIV\". Output: " + romanToInteger.romanToInt(s3));//expected: 1994
    }
}
