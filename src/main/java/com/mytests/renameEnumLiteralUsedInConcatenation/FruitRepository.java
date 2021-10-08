package com.mytests.renameEnumLiteralUsedInConcatenation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface FruitRepository extends CrudRepository<Fruit, Long> {

    // rename APPLE to APPLE<any_suffix> to reproduce the issue
    @Query(
        "SELECT f FROM Fruit f "
            + "WHERE f.id = :id "
            + "     AND f.type = com.mytests.renameEnumLiteralUsedInConcatenation.FruitType.APPLE"
            + "     OR f.type =  com.mytests.renameEnumLiteralUsedInConcatenation.FruitType.PINE_APPLE"
    )
    Fruit fromId(@Param("id") Long id);

}
