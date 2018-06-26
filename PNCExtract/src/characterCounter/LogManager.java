package characterCounter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

/**
 * Provides the utility to quickly create and set up any {@code Logger} objects required.
 * 
 * @author Richard Innocent
 */
public class LogManager {
	
	/**
	 * The parent logger, that ultimately displays logs to the user.
	 */
	private static final Logger PARENT = Logger.getLogger(LogManager.class.getName());
	
	/**
	 * The location of the log file.
	 */
	private static String LOG_LOCATION = "./logs/"
			+ new SimpleDateFormat("dd-MM-yyyy_HH.mm.ss").format(new Date())
			+ "_ImageAnalyser.log";
	
	/**
	 * The level for the {@code PARENT} logger's {@code ConsoleHandler}.
	 */
	private static final Level consoleLevel = Level.INFO;
	
	/**
	 * The level for the {@code PARENT} logger's {@code FileHandler}.
	 */
	private static Level fileLevel = Level.FINE;
	
	/**
	 * Creates a {@code Logger} with the correct level and parent.
	 * @param loggerName The name of the {@code Logger}.
	 * @return The new {@code Logger}.
	 */
	public static Logger createLogger(String loggerName) {
		Logger logger = Logger.getLogger(loggerName);
		logger.setLevel(Level.ALL);
		logger.setParent(PARENT);
		return logger;
	}
	
	/**
	 * Returns the parent {@code Logger}.
	 * @return The parent {@code Logger}.
	 */
	public static Logger getParent() {
		return PARENT;
	}
	
	/**
	 * Sets up the logging directories and levels and begins to log events.
	 * @param directory The directory where the log should reside.
	 * @param logLevel The minimum log level that should be written to the log file.
	 * @throws IOException Thrown if log file cannot be created.
	 */
	public static void startLogging(String directory, Level logLevel) throws IOException {
		setLogLocation(directory);
		fileLevel = logLevel;
		setUpParent();
	}
	
	public static void setLogLocation(String directory) {
		LOG_LOCATION = directory
				+ new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date())
				+ "_ImageAnalyser.log";
	}
	
	/**
	 * Sets up the {@code PARENT} logger, setting its level and all required {@code Handler}s.
	 * @return The {@code PARENT} logger.
	 * @throws IOException Thrown if there are problems accessing the log file.
	 */
	private static Logger setUpParent() throws IOException {
		PARENT.setLevel(Level.ALL);
		PARENT.addHandler(createParentConsoleHandler());
		PARENT.addHandler(createParentFileHandler());
		return PARENT;
	}
	
	/**
	 * Creates a {@code ConsoleHandler} for the {@code PARENT} logger, to write out log information
	 * to the console.
	 * @return A {@code FileHadler} for the {@code PARENT} logger.
	 */
	private static ConsoleHandler createParentConsoleHandler() {
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(consoleLevel);
		return consoleHandler;
	}
	
	/**
	 * Creates a {@code FileHandler} for the {@code PARENT} logger, to write out logs to the log
	 * location.
	 * @return A {@code FileHandler} for the {@code PARENT} logger.
	 * @throws IOException Thrown if there are problems opening the log file.
	 */
	private static FileHandler createParentFileHandler() throws IOException {
		FileHandler fileHandler = new FileHandler(LOG_LOCATION);
		fileHandler.setLevel(fileLevel);
		return fileHandler;
	}
	
}