package factoryMethodPattern.overrrider;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerFactory factory;
		Logger logger ;
		
		String arg = "args";
		factory = new DatabaseLoggerFactory();
//		factory = new FileLoggerFactory();
		logger = factory.createLogger(arg);
		logger.writeLog();
	}

}
