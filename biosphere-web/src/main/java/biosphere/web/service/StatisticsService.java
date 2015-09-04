package biosphere.web.service;

import biosphere.web.dto.CommonStatistics;
import biosphere.web.dto.PopulationStatistics;

import java.util.List;

public interface StatisticsService {

    List<CommonStatistics> findCommonStatistics();

    List<PopulationStatistics> findStatisticsByPopulation(Long id);

}
