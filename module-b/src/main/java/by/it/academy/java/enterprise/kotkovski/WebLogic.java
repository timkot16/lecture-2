package by.it.academy.java.enterprise.kotkovski;

public class WebLogic {

    private StringRandomizer stringRandomizer = new StringRandomizer();

    public String someLogic() {
        return stringRandomizer.randomString();
    }
}
