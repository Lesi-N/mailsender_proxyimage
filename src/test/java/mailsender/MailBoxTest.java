package mailsender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    MailBox mailBox;
    MailInfo mailInfo1;
    MailInfo mailInfo2;
    Client client1;
    Client client2;

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        client1 = new Client("ALice", Gender.FEMALE, 20);
        client2 = new Client("Millie", Gender.FEMALE, 19);
        mailInfo1 = new MailInfo(client1,MailCode.HAPPY_BIRTHDAY);
        mailInfo2 = new MailInfo(client2, MailCode.GREETINGS);

    }

    @Test
    void sendAll() {
        mailBox.sendAll();
        assertEquals(mailInfo1.getMailText(), "Happy birthday, ALice!");
        assertEquals(mailInfo2.getMailText(), "Hello, Millie!");

    }
}