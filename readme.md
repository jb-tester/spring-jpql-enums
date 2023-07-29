# SPRING JPA: enum types in queries

`com/mytests/renameEnumLiteralUsedInConcatenation`:
- PQL: Renaming enum constants changes JPQL, which is split to several lines, in a funny way: [IDEA-183473](https://youtrack.jetbrains.com/issue/IDEA-183473)

`com/mytests/useSingleEnumForEnumCollectionParameter`:
- Creating new object with enum parameter in JPQL Query is marked as error: [IDEA-158121](https://youtrack.jetbrains.com/issue/IDEA-158121)

`com/mytests/enumLiteralsInQueries`:
- incorrect results of enum moving: [IDEA-115841](https://youtrack.jetbrains.com/issue/IDEA-115841)
- unresolved enum literals: [IDEA-244155](https://youtrack.jetbrains.com/issue/IDEA-244155) 
- Show error when enum type passed as argument into native JPA query: [IDEA-160992](https://youtrack.jetbrains.com/issue/IDEA-160992) 
- inner enum literals in JPA queries are not recognized when $ is used: [IDEA-232989](https://youtrack.jetbrains.com/issue/IDEA-232989) 