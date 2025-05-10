package utils;

import aquality.selenium.browser.AqualityServices;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FileUtils {

	private static final String DOWNLOAD_FOLDER_PATH = getBrowser().getDownloadDirectory();
	private static final long MAX_WAIT = 30;

	public boolean isFileExist(String fileName) {
		File file = new File(DOWNLOAD_FOLDER_PATH + File.separator + fileName);
		try {
			Awaitility.await().atMost(MAX_WAIT, TimeUnit.SECONDS).until(file::exists);
			return true;
		} catch (ConditionTimeoutException e) {
			return false;
		}
	}

	public boolean isFileDownloaded(String fileName) {
		File file = new File(DOWNLOAD_FOLDER_PATH + File.separator + fileName);
		return file.exists();
	}
}
