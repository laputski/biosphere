package biosphere.environment.domain;

import java.util.Set;

public class Population {

    private Long id;
    private Set<Individual> individuals;
    private Float averageFitness;

    public Population() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Individual> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(Set<Individual> individuals) {
        this.individuals = individuals;
    }

    public Float getAverageFitness() {
        return averageFitness;
    }

    public void setAverageFitness(Float averageFitness) {
        this.averageFitness = averageFitness;
    }
}
