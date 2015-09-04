package biosphere.web.laputski.service;

import biosphere.web.laputski.domain.Statistics;
import biosphere.web.laputski.dto.CommonStatistics;
import biosphere.web.laputski.dto.PopulationStatistics;
import biosphere.web.laputski.repository.StatisticsRepository;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component("statisticsService")
@Transactional
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private StatisticsRepository statisticsRepository;

    @Override
    public List<CommonStatistics> findCommonStatistics() {
        return Lists.transform(statisticsRepository.findCommonStatistics(), new Function<Statistics, CommonStatistics>() {
            @Override
            public CommonStatistics apply(Statistics statistics) {
                return new CommonStatistics(statistics.getPopulationId(), statistics.getPopulationName(), statistics.getAverageFitness());
            }
        });
    }

    @Override
    public List<PopulationStatistics> findStatisticsByPopulation(Long id) {
        return Lists.transform(statisticsRepository.findStatisticsByPopulation(id), new Function<Statistics, PopulationStatistics>() {
            @Override
            public PopulationStatistics apply(Statistics statistics) {
                return new PopulationStatistics(statistics.getGenerationNumber(), statistics.getAverageFitness());
            }
        });
    }
}
