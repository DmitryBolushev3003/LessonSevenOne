import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.statsService;

public class statsServiceTest {
    @Test
    public void shouldFindSum() {
        statsService service = new statsService();
        int sum[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.gitSalesAmount(sum);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverage() {
        statsService service = new statsService();
        int average[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSalesAmount(average);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindNumberMax() {
        statsService service = new statsService();
        int Max[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.gitNumberMax(Max);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldFindNumberMin() {
        statsService service = new statsService();
        int Min[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 9;
        int actualMax = service.gitNumberMin(Min);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldMonthBelow() {
        statsService service = new statsService();
        int below[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelow = 5;
        int actualBelow = service.belowAverage(below);
        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test
    public void shouldMonthMore() {
        statsService service = new statsService();
        int more[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMore = 5;
        int actualMore = service.belowAverage(more);
        Assertions.assertEquals(expectedMore, actualMore);

    }
}
