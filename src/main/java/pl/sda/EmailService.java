package pl.sda;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailService {

    EmailConfig config = new EmailConfig();
    EmailUserInfo userinfo = new EmailUserInfo();

    public void EmailService(){

        try {
            Email email = new SimpleEmail();
            email.setHostName(config.HOST);
            email.setSmtpPort(config.PORT);
            email.setAuthenticator(new DefaultAuthenticator(userinfo.userName, userinfo.password));
            email.setSSLOnConnect(config.SSL_FLAG);
            email.setFrom(userinfo.fromAddress);
            email.setSubject(userinfo.subject);
            email.setMsg(userinfo.message);
            email.addTo(userinfo.toAddress);
            email.send();
        }

        catch(Exception ex){
            System.out.println("Unable to send email");
            System.out.println(ex);
        }







    }



    }
