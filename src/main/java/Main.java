import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес директории для сборки избражений:");
        String way = scanner.nextLine();
        FileEditor fileOpener = new FileEditor(5);
//        String destination = "D:\\Music Advisor";
        fileOpener.openFile();
        fileOpener.deleteDirectory(new File(way));
    }
}
