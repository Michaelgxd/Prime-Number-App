import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.event.EventHandler;
import javafx.application.Application;

public class Main extends Application {
	
	public static void main(String[] args) 
	{	
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception 
	{
		Client client = new Client();
		Stage clientStage = new Stage();
		Server server = new Server();
		Stage serverStage = new Stage();
		
		server.start(serverStage);
		client.start(clientStage);
		
		serverStage.setOnCloseRequest(new EventHandler<WindowEvent>()
		{
			public void handle(WindowEvent we) 
			{
				System.out.println("Exiting application...");
				System.exit(0);
			}
		});
		
		clientStage.setOnCloseRequest(new EventHandler<WindowEvent>()
		{
			public void handle(WindowEvent we) 
			{
				System.out.println("Exiting application...");
				System.exit(0);
			}
		});
	}
}