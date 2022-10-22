import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {

    @BeforeAll
    static void configure() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
}
