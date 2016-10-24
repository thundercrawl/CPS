package org.Logger;

import org.ConfigService.SystemConfig;

public class LoggerFactory {

	
	public void SetLogContext(SystemConfig config){
		
		
	}
	public Logger getLogger()
	{
		
		return new Logger4jImpl();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
