package io.codeforall.fanstatics;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
    @Table(name = "car")
    public class Car {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String make;
        private String model;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            // use Category foreign key on Product table to establish
            // the many-to-one relationship instead of a join table
            mappedBy = "car"
    )

    private Set<Type> typeSet = new HashSet<>();

    // utility method to update both sides of the association
    public void addType(Type type) {
        typeSet.add(type);
        type.setCar(this);
    }



        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    // Getter para typeSet
    public Set<Type> getTypeSet() {
        return typeSet;
    }

    // Setter para typeSet (opcional)
    public void setTypeSet(Set<Type> typeSet) {
        this.typeSet = typeSet;
    }
    }


