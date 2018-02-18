package pl.sda;


import pl.sda.View.EmailSenderViewer;

public class App
{
    public static void main( String[] args )
    {

        EmailService emailService = new EmailService();
        EmailUserInfo emailUserInfo = new EmailUserInfo();
        emailService.EmailService();

        EmailSenderViewer emailSenderViewer = new EmailSenderViewer();

    }
}
