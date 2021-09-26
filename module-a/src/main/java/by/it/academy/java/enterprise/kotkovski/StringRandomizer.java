package by.it.academy.java.enterprise.kotkovski;

import java.util.UUID;

public class StringRandomizer {

    public String randomString() {
        return UUID.randomUUID().toString();
    }

}
