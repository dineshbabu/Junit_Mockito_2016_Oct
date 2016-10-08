package junittest.category;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@Category({PerformanceTests.class, RegressionTests.class})
public class ClassLevelcategoryTest {

    @Test
    public void test_b_1() {
        assertThat(1 == 1, is(true));
    }

}