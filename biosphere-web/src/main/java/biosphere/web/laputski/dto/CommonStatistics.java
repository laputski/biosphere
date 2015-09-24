package biosphere.web.laputski.dto;

public class CommonStatistics {

    private Long id;
    private Long populationId;
    private String populationName;
    private Long generationNumber;
    private Float averageFitness;

    public CommonStatistics() {
    }

    public CommonStatistics(Long id, Long populationId, String populationName, Long generationNumber, Float averageFitness) {
        this.id = id;
        this.populationId = populationId;
        this.populationName = populationName;
        this.generationNumber = generationNumber;
        this.averageFitness = averageFitness;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getGenerationNumber() {
        return generationNumber;
    }

    public void setGenerationNumber(Long generationNumber) {
        this.generationNumber = generationNumber;
    }

    public Float getAverageFitness() {
        return averageFitness;
    }

    public void setAverageFitness(Float averageFitness) {
        this.averageFitness = averageFitness;
    }
}
