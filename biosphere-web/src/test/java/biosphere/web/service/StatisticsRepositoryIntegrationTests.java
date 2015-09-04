package biosphere.web.service;

import biosphere.web.BiosphereApplication;
import biosphere.web.domain.Statistics;
import biosphere.web.repository.StatisticsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BiosphereApplication.class)
@WebAppConfiguration
public class StatisticsRepositoryIntegrationTests {

    @Autowired
    StatisticsRepository repository;

    @Test
    public void findCommonStatistics() {
        List<Statistics> statistics = repository.findCommonStatistics();
        assertEquals(statistics.size(), 3L);
    }

    @Test
    public void findStatisticsByPopulation() {
        List<Statistics> statistics = repository.findStatisticsByPopulation(1l);
        assertEquals(statistics.size(), 5L);
    }
}
