import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public boolean someLibraryMethod() {
		logger.info("Log Something!");
        return true;
    }
}
