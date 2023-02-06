package org.example;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class App {

    public static void main(String[] args) {
        logger.info("Hello {}!", "Future");

        App app = new App();
        logger.info("{} + {} = {}", 2, 3, app.sum(2, 3));
    }

    public int sum(int x, int y) {
        return x + y;
    }

}
