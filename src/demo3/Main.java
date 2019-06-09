package demo3;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        System.out.println(wordCounter.count( "alexyang"));
        System.out.println(wordCounter.count( "abcdefhg"));
        System.out.println(wordCounter.count( "sdfsdfsdf"));
        System.out.println(wordCounter.count( "svdcdse"));
        System.out.println(wordCounter.count( "sdfsedd"));
    }
}
