package ExceptionTP;
import java.io.*;
import java.util.*;

public class FileReaderUtil {
    public static List<Integer> readNumbers(String path) {
        List<Integer> nums = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null)
                nums.add(Integer.parseInt(line.trim()));
        } catch (IOException | NumberFormatException e) {
            System.err.println("Erreur lecture fichier : " + e.getMessage());
            e.printStackTrace();
        }
        return nums;
    }
}
