package controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.bedu.controller.InterviewerController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class InterviewerControllerTest {
    @Autowired
    private InterviewerController controller;

    @Test
    @DisplayName("Controlar sould be injected")
    public void smokeTest() {
        assertNotNull(controller);
    }
}
