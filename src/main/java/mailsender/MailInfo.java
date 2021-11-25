package mailsender;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class MailInfo {
    private MailCode mailCode;
    private Client client;
    public MailInfo (Client client, MailCode mailCode){
        this.mailCode = mailCode;
        this.client = client;
    }

    public String getMailText(){
        String text = mailCode.generateText();
        HashMap<String, String> temps = new HashMap<>();
        temps.put("%NAME%", client.getName());
        for (String key: temps.keySet()){
            text = text.replace(key, temps.get(key));
        }
        return text;
    }

    public static void main(String[] args) {
        Path curPath = Paths.get("");
        String s = curPath.toAbsolutePath().toString();
        System.out.println("The current absolute path is: " + s);

        Client client = new Client("Lesi", Gender.FEMALE, 18);
        MailInfo mailInfo = new MailInfo(client, MailCode.GREETINGS);

        String to_send = mailInfo.getMailText();
        System.out.println(to_send);
        // prints "Hello, Lesi!"
    }
}
