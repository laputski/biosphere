package biosphere.environment.domain;

import biosphere.genotype.domain.Genotype;
import biosphere.phenotype.domain.Phenotype;

public class Individual {

    private Long id;
    private String name;
    private Genotype genotype;
    private Phenotype phenotype;

    public Individual() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genotype getGenotype() {
        return genotype;
    }

    public void setGenotype(Genotype genotype) {
        this.genotype = genotype;
    }

    public Phenotype getPhenotype() {
        return phenotype;
    }

    public void setPhenotype(Phenotype phenotype) {
        this.phenotype = phenotype;
    }
}
