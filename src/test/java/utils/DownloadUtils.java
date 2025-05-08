package utils;

import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DownloadUtils {

    private static final String DOWNLOAD_FOLDER_PATH = "./downloads";
    private static final long MAX_WAIT = 30;

    public static boolean isFileExist(String fileName) {
        File file = new File(DOWNLOAD_FOLDER_PATH + File.separator + fileName);
        try {
            Awaitility.await().atMost(MAX_WAIT, TimeUnit.SECONDS).until(file::exists);
            return true;
        } catch (ConditionTimeoutException e) {
            return false;
        }
    }
}
