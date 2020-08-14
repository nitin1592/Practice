package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class EntityRelationship {


  public static void main(String[] args) {

    String s1 = "housingcomplex";
    String s2 = "sector";
    String s3 = "block";
    String s4 = "tower";
    String s5 = "apartment";

    Set set = new HashSet() {{
      add(s1);
      add(s2);
      add(s3);
      add(s4);
      add(s5);
    }};

    List list = new ArrayList();

    list.add(new Tuple<>(s1, new ArrayList() {{
      add(new Tuple<>(s2, 8));
    }}));

    list.add(new Tuple<>(s2, new ArrayList() {{
      add(new Tuple<>(s3, 10));
    }}));


    list.add(new Tuple<>(s3, new ArrayList() {{
      add(new Tuple<>(s4, 3));
    }}));

    list.add(new Tuple<>(s4, new ArrayList() {{
      add(new Tuple<>(s5, 300));
    }}));


    solveIt(set, list);
  }


  /**
   * @param entities      universities, students, class, college
   * @param relationships list of entries like this `` university = 6000 student ``
   */
  static void solveIt(Set<String> entities, List<Tuple<String, List<Tuple>>> relationships) {

    // Students=> 6000,universties | 600 college | 50 class
    Map<String, List<Tuple>> inverseRelationships = new HashMap<>();


    for (Tuple<String, List<Tuple>> entry : relationships) {

      // this is to get the entity with lowest most value
      entities.remove(entry.entity); // remove "university"

      List<Tuple> values = entry.value; //student 6000

      for (Tuple value : values) {
        List<Tuple> t = inverseRelationships.get(value.entity);
        if (inverseRelationships.get(value.entity) == null) {
          t = new ArrayList<>();
          inverseRelationships.put((String) value.entity, t);
        }
        t.add(new Tuple(entry.entity, value.value));
      }
    }

    String lowestMostEntity = entities.iterator().next();

    Map<String, Integer> entityToLowerMostEntityCount = new HashMap<>();
    entityToLowerMostEntityCount.put(lowestMostEntity, 1);

    Queue<String> queue = new LinkedList<>();

    queue.offer(lowestMostEntity);

    while (!queue.isEmpty()) {
      String entity = queue.poll();

      if (inverseRelationships.get(entity) != null) {
        for (Tuple tuple : inverseRelationships.get(entity)) {
          queue.offer((String) tuple.entity);

          entityToLowerMostEntityCount.put(
              (String) tuple.entity, entityToLowerMostEntityCount.get(entity) * (int) tuple.value);
        }
      }
    }

    List<Tuple> entityToLowerMostEntityCountList = entityToLowerMostEntityCount.entrySet().stream()
        .map(e -> new Tuple(e.getKey(), e.getValue()))
        .collect(
            Collectors.toList());

    Collections.sort(entityToLowerMostEntityCountList, (t1, t2) -> {

      if ((int) t1.value > (int) t2.value) {
        return -1;
      }
      return 1;
    });

    String biggestEntity = (String) entityToLowerMostEntityCountList.get(0).entity;
    int biggestEntityValue = (int) entityToLowerMostEntityCountList.get(0).value;
    System.out.print("1" + biggestEntity);

    for (int i = 1; i < entityToLowerMostEntityCountList.size(); i++) {
      System.out.print(
          " = " + biggestEntityValue / (int) entityToLowerMostEntityCountList.get(i).value
              + entityToLowerMostEntityCountList.get(i).entity);

    }
  }


  static class Tuple<K, V> {
    K entity;
    V value;

    public Tuple(K entity, V value) {
      this.entity = entity;
      this.value = value;
    }
  }

}
