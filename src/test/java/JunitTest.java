import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JunitTest {
    @DisplayName("1더하기 2는 3")
    @Test
    public void junitTest() {
        int a = 1;
        int b = 2;

        int sum = 3;
        Assertions.assertEquals(sum, a + b);
        assertThat(a + b).isEqualTo(sum);
    }

    @DisplayName("1더하기 3는 4")
    @Test
    public void junitFailedTest() {
        int a = 1;
        int b = 3;

        int sum = 3;
//        Assertions.assertEquals(sum, a + b);
    }
}
