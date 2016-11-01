package CPS.Server;
import org.ConfigService.SystemConfig;
import org.ConfigService.SystemConfig.ServerStatus;
/*used as the start point of all sub server and service to provide the functional in the
 * system level
 */
public abstract class ServerRoot {
	private ServerStatus serverState;
	private void setServerState(SystemConfig.ServerStatus  state)
	{
		
		serverState = state;
	}
	public void startServer()
	{
		
		
	}
	
	public void stopServer()
	{
		
	}
	abstract public void initial();
	abstract public void startup();
	abstract public void shutdown();
	
}
