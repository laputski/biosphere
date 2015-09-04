package biosphere.web.dto;

public class CommonStatistics {

    private Long populationId;
    private String populationName;
    private Float averageFitness;

    public CommonStatistics(Long populationId, String populationName, Float averageFitness) {
        this.populationId = populationId;
        this.populationName = populationName;
        this.averageFitness = averageFitness;
    }

    public Long getPopulationId() {
        return populationId;
    }

    public void setPopulationId(Long populationId) {
        this.populationId = populationId;
    }

    public String getPopulationName() {
        return populationName;
    }

    public void setPopulationName(String populationName) {
        this.populationName = populationName;
    }

    public Float getAverageFitness() {
        return averageFitness;
    }

    public void setAverageFitness(Float averageFitness) {
        this.averageFitness = averageFitness;
    }
}
