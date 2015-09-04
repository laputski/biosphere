package biosphere.web.repository;

import biosphere.web.domain.Statistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatisticsRepository extends CrudRepository<Statistics, Long> {

    @Query("select s from Statistics s where s.isResult=true")
    List<Statistics> findCommonStatistics();

    @Query("select s from Statistics s where s.isResult=false and s.populationId = ?1")
    List<Statistics> findStatisticsByPopulation(Long populationId);

}
