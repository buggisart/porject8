import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTestCorrect {

    boolean expectedResult;
    String name;


    public AccountTestCorrect(String name, boolean expectedResult) {
        this.expectedResult = expectedResult;
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] setData() {
        return new Object[][] {
                {"test name", true},
                {"t n", true},
                {"testtesttest namena", true}
        };
    }

    @Test
    @DisplayName("accountNameCorrect")
    @Description("Test correct account name")
    public void accountNameCorrect() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }
}
