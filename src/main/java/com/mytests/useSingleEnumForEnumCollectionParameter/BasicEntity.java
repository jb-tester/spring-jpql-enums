package com.mytests.useSingleEnumForEnumCollectionParameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ElementCollection;
import java.util.HashSet;
import java.util.Set;

@Entity
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