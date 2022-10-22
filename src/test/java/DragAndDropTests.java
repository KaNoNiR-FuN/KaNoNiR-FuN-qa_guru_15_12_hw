import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests extends TestConfig{

    @Test
    public void dragAndDropToTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    public void  actionsClickAndHoldTest() {
        //Не работает. Элемент кликается, но не перемещается
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-b").shouldHave(text("A"));
    }


    @Test
    public void  actionsDragAndDropTest() {
        //Не работает. Элемент кликается, но не перемещается
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().dragAndDrop($("#column-a"), $("#column-b")).perform();
        $("#column-b").shouldHave(text("A"));
    }
}
