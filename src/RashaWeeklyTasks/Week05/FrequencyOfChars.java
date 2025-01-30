package RashaWeeklyTasks.Week05;

public class FrequencyOfChars {


    /*
       Write function that can find the frequency of characters

        Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        Rasha is volunteering
    */
   /* public static void main(String[] args) {

       /*
        String str = "AAABBCDD";
        Map<String, Integer> num = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (!num.containsKey(String.valueOf(c))) {
                num.put(String.valueOf(c), 0);
            }
            num.put(String.valueOf(c), num.get(String.valueOf(c)) + 1);
        }

        System.out.println(num);*/

       /* System.out.println("________________________________________________________________");


        String letters = "AAABBCDD";
        int count = 0;

        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            if (!count(String.valueOf(c))) {
                count.put(String.valueOf(c));
            } else {
                count.put(String.valueOf(c), count.get(String.valueOf(c)) + 1);
            }
                }
        System.out.println(count);
        }
*/

        public static void main(String[] args) {

            String str = "aaabbbcccdddEEEFFF";
            System.out.println(frequencyOfChars1(str));

        }

        public static String frequencyOfChars1(String str) {
            String result = "";
            int j = 0;
            while (j < str.length()) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                result += str.charAt(j) + "" + count;
                str = str.replace("" + str.charAt(j), "");

            }
            return result;
        }


    }

