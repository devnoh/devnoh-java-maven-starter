package org.example;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Testing App")
@Log4j2
class AppTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Testing sum")
    @Test
    void sum() {
        App app = new App();
        assertThat(app.sum(2, 3)).isEqualTo(5);

        logger.info("{} + {} = {}", 2, 3, app.sum(2, 3));
    }

}
