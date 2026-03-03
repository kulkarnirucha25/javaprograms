import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
        int vowels = 0, words = 0, countA = 0;
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            while ((line = br.readLine()) != null) {

                // Count words
                String[] wordArray = line.split("\\s+");
                words += wordArray.length;

                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    // Count vowels
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    }

                    // Count 'a'
                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Number of times 'a' appears: " + countA);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}