package mailsender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;

    public Client(String name, Gender sex, int age) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        id = IdGenerator.generate();
    }

    public static class IdGenerator {
        private static int id;

        public static int generate(){
            id++;
            return id;
        }
    }
}
