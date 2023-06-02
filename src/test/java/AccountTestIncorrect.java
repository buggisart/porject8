import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTestIncorrect {

    String name;
    boolean expectedResult;
    public AccountTestIncorrect(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] setData() {
        return new Object[][] {
                {" test name", false},
                {"test name ", false},
                {"testname", false},
                {"te st name", false},
                {"testtesttest nametes", false},
                {"ts", false}
        };
    }

    @Test
    @DisplayName("accountNameIncorrect")
    @Description("Test incorrect account name")
    public void accountNameIncorrect() {
        Account account = new Account(name);
        boolean actualResult = account.checkNameToEmboss();
        assertEquals(expectedResult, actualResult);
    }

}
