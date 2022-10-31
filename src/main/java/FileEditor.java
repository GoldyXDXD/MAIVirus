import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;

class FileEditor {

    private static final String[] uri = {
            "https://skillbox.ru/",
            "https://amigo.mail.ru/",
            "https://mai.ru/",
            "https://lingualeo.com/ru",
            "https://www.youtube.com/c/maxkatz1",
            "https://www.4chan.org/index.php"
    };
    private static int count; //кол-во открытий вкладки


    public FileEditor (int count) throws IOException, URISyntaxException {
        this.count = count;
    }

    public void openFile() throws URISyntaxException, IOException {
        for (int i = 0; i < count; i++) {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                int index = new Random().nextInt(5);
                Desktop.getDesktop().browse(new URI(uri[index]));
            }
        }
    }

    public boolean deleteDirectory(File directory) {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if(null!=files){
                for(int i=0; i<files.length; i++) {
                    if(files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    }
                    else {
                        files[i].delete();
                    }
                }
            }
        }
        return(directory.delete());
    }
}
