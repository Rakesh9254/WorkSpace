package RevisionJavaProgram;

public class DuplicateArray {
    public static void main(String[] args) {
        String str[] = { "java", "C", "Phone", "java" };
        
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) { // Compare the strings, not an integer
                    System.out.println("Found Duplicate Element: " + str[i]);
                }
            }
        }
    }
}
