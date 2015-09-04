package biosphere.web.laputski.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Statistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long populationId;

    @Column(nullable = false)
    private String populationName;

    @Column(nullable = false)
    private Long generationNumber;

    @Column(nullable = false)
    private boolean isResult;

    @Column(nullable = false)
    private Float averageFitness;

    public Statistics() {
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

    public boolean isResult() {
        return isResult;
    }

    public void setIsResult(boolean isResult) {
        this.isResult = isResult;
    }

    public Float getAverageFitness() {
        return averageFitness;
    }

    public void setAverageFitness(Float averageFitness) {
        this.averageFitness = averageFitness;
    }
}
