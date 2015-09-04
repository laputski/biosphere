package biosphere.web.laputski.controller;

import biosphere.web.laputski.dto.CommonStatistics;
import biosphere.web.laputski.dto.PopulationStatistics;
import biosphere.web.laputski.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @RequestMapping("population")
    public List<CommonStatistics> findCommonStatistics() {
        return statisticsService.findCommonStatistics();
    }

    @RequestMapping("population/{id}")
    public List<PopulationStatistics> findStatisticsByPopulation(@PathVariable Long id) {
        return statisticsService.findStatisticsByPopulation(id);
    }

    @ExceptionHandler(Exception.class)
    public String handleExceptions(Exception e) {
        return e.getMessage();
    }
}
