package factoryMethodPattern.simple;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoggerFactory factory;
		Logger logger ;
		
		factory = new DatabaseLoggerFactory();
//		factory = new FileLoggerFactory();
		logger = factory.createLogger();
		logger.writeLog();
	}

}
