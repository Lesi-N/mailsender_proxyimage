package mailsender;

public class IdGenerator {
    private static int id;

    public int generate(){
        id++;
        return id;
    }
}
