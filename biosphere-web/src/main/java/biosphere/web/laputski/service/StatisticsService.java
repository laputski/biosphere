package biosphere.web.laputski.service;

import biosphere.web.laputski.dto.CommonStatistics;
import biosphere.web.laputski.dto.PopulationStatistics;

import java.util.List;

public interface StatisticsService {

    List<CommonStatistics> findCommonStatistics();

    List<PopulationStatistics> findStatisticsByPopulation(Long id);

}
