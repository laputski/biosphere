package biosphere.web.laputski.dto;

public class PopulationStatistics {

    private Long generationId;
    private Float averageFitness;

    public PopulationStatistics(Long generationId, Float averageFitness) {
        this.generationId = generationId;
        this.averageFitness = averageFitness;
    }

    public Long getGenerationId() {
        return generationId;
    }

    public void setGenerationId(Long generationId) {
        this.generationId = generationId;
    }

    public Float getAverageFitness() {
        return averageFitness;
    }

    public void setAverageFitness(Float averageFitness) {
        this.averageFitness = averageFitness;
    }
}
