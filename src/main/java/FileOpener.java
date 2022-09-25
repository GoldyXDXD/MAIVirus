import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FileOpener {

    private static final String uri = "https://skillbox.ru/";
    private static int count; //кол-во открытий вкладки

    public FileOpener (int count) throws IOException, URISyntaxException {
        this.count = count;
    }

    public void openFile() throws URISyntaxException, IOException {
        for (int i = 0; i < count; i++) {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(uri));
            }
        }
    }
}
