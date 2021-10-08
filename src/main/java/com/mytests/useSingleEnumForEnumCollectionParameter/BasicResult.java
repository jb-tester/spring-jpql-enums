package com.mytests.useSingleEnumForEnumCollectionParameter;

public class BasicResult {

    public final long id;
    public final BasicEntity.Test test;
    public BasicResult(long id, BasicEntity.Test test) {
        this.id = id;
        this.test = test;
    }
}