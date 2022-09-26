import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        /*
        Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable<EncodeHintType, ErrorCorrectionLevel>();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        BitMatrix bitMatrix = qrCodeWriter.encode(content, BarcodeFormat.QR_CODE, qrCodeSize, qrCodeSize, hintMap);
        */
        FileOpener fileOpener = new FileOpener(40);
        fileOpener.openFile();
    }

    public void turnOnAutorun() throws InvocationTargetException, IllegalAccessException {
        String value = "\"javaw -jar " + System.getProperty("user.dir") + "\\myJar.jar\"";
        WinRegistry.writeStringValue(WinRegistry.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Run", "myJar autorun key", value);
    }

    public void turnOffAutorun() throws InvocationTargetException, IllegalAccessException {
        WinRegistry.deleteValue(WinRegistry.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\Run", "myJar autorun key");
    }

}
