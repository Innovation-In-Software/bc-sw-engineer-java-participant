1. Is this a key → value relationship? 
If there is a key-value relationship, a HashMap is the best structure to use.
2. Otherwise, must values be unique?
If values must be unique, then choose a Set. A Set does not allow duplicates while a HashMap does.
3. Otherwise, do order/index/duplicates matter? 
If order, index, and duplicates matter, then a List should be used, as it is an indexed data structure.
4. Must iteration be sorted? 
If iteration must be sorted, a TreeSet or TreeMap will be best.
5. Must insertion order be preserved? 
If iteration order must also be preserved, consider a LinkedHastSet or LinkedHashMap.

# Collection choices

| Scenario | Interface           | Implementation | Why                                    |
| -------- |---------------------|----------------|----------------------------------------|
| Ordered catalog; duplicate titles allowed | List<Book>          | ArrayList<>    | Indexed order sequence                 |
| Unique registered book IDs | Set<String>         | HashSet<>      | Fast average membership; no duplicates |
| Book ID → current borrower ID | Map<String,String>  | HashMap<>      | Direct key lookup                      |
| Alphabetically sorted categories | Set<String>         | TreeSet<>      | Unique and naturally stored            |
| Category → count, sorted by category | Map<String,Integer> | TreeMap<>      | Key-value data with sorted keys        |
| Checkout history in event order | List<BorrowRecord>  | ArrayList<>    | Append and iterate in event order      |