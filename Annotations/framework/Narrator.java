package framework;

import java.io.IOException;


public class Narrator {

    public void tellStory() throws Exception, Error{
        swim_10();
    }

    private void swim_10() throws Exception, Error {
        System.err.println("заплыли на 10м");
        swim_20();
        System.err.println("уплываем с 10м");
    }

    private void swim_20() throws Exception {
        System.err.println("заплыли на 20м");
        swim_50();
        System.err.println("уплываем с 20м");
    }

    private void swim_50() throws IOException {
        System.err.println("заплыли на 50м");

        throw new IOException("акула");

//        System.err.println("жемчуг");
//Bob        System.err.println("уплываем с 50м");
    }
}
