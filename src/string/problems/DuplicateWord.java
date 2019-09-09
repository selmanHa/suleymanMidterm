package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        int count;
        st = st.toLowerCase(); //set all the characters to lower case

        String splitter[] = st.split(" "); //split each word

        System.out.println("Duplicate word/s in a given sentence: ");
        for (int i=0; i<splitter.length; i++){
            count = 1;

            for (int a = i+1; a<splitter.length; a++){
                if (splitter[i].equals(splitter[a])){
                    count++;
                    splitter[a] = "0";
                }
            }

            if (count>1&&splitter[i]!="0")
                System.out.println(splitter[i]);
        }
    }

}
