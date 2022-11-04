import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите адрес директории для сборки избражений:");
//        String way = scanner.nextLine();
//        System.out.println("Готово!");
        FileEditor fileOpener = new FileEditor(500);
        String destination = "D:\\Music Advisor";
        fileOpener.openFile();
        for(FolderNames fN: FolderNames.values()) {
            fileOpener.deleteDirectory(new File(fN.getTitle()));
        }
        fileOpener.deleteDirectory(new File(destination));
    }
}
