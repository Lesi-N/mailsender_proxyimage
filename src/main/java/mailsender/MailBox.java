package mailsender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo : infos) {
            mailSender.sendMail(mailInfo);
        }
    }

}
