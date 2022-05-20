package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {
	public Logger log;
	public Logs(String name)
	{
		log=LogManager.getLogger(name);
	}
}
