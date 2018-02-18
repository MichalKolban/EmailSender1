package pl.sda;

public class Server {

    private boolean serverRunning = false;

    private EmailService service = new EmailService();

    private void startServer(){
        serverRunning = true;
    }
    private void StopServer(){
        serverRunning = false;
    }

    public void setServerRunning(boolean serverRunning){
        this.serverRunning = serverRunning;
    }
    public boolean getServerRunning(){
        return serverRunning;
    }

    private void sendEmailFromServer(){
        if (serverRunning) {
            service.EmailService();
        }
    }
}
