package com.mytests.useSingleEnumForEnumCollectionParameter;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BasicEntityRepo extends CrudRepository<BasicEntity,Long> {
    // constructor error is shown
    @Query("select new com.mytests.useSingleEnumForEnumCollectionParameter.BasicResult(t.id, e) from BasicEntity t join t.testSet e")
    List<BasicEntity> someQuery();
}
