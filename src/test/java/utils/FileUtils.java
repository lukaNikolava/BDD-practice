package utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static aquality.selenium.browser.AqualityServices.getBrowser;

@UtilityClass
public class FileUtils {

	private static final long MAX_WAIT = 30;

	public boolean isFileDownloaded(String fileName) {
		return isFileExist(getBrowser().getDownloadDirectory() + File.separator + fileName);
	}

	public boolean isFileExist(String fullPath) {
		File file = new File(fullPath);
		try {
			Awaitility.await().atMost(MAX_WAIT, TimeUnit.SECONDS).until(file::exists);
			return true;
		} catch (ConditionTimeoutException e) {
			return false;
		}
	}
}
