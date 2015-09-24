package biosphere.web.laputski.controller;

import biosphere.web.laputski.dto.CommonStatistics;
import biosphere.web.laputski.dto.PopulationStatistics;
import biosphere.web.laputski.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = RequestMethod.POST, value = "population")
    public void saveStatistics(@RequestBody CommonStatistics statistics) {
        statisticsService.saveStatistics(statistics);
    }

    @ExceptionHandler(Exception.class)
    public String handleExceptions(Exception e) {
        return e.getMessage();
    }

}
