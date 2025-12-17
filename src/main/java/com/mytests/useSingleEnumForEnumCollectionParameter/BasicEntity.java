package com.mytests.useSingleEnumForEnumCollectionParameter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "basic_entities", schema = "enums")
public class BasicEntity {
    @Id
    @GeneratedValue
    public Long id;

    @ElementCollection
    public Set<Test> testSet = new HashSet<>();

    public enum Test {
        A, B, C, D
    }
}