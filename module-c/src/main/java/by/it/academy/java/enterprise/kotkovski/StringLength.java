package by.it.academy.java.enterprise.kotkovski;

public class StringLength {
    StringRandomizer stringRandomizer = new StringRandomizer();

    public int length() {
        return stringRandomizer.randomString().length();
    }
}
