package com.benson.sfmdemo.util;

import java.util.ArrayList;
import java.util.List;

public class CustomListUtils {
  public static <T> List<List<T>> partition(List<T> list, int partitionSize) {
    List<List<T>> partitions = new ArrayList<>();
    for (int i = 0; i < list.size(); i += partitionSize) {
      partitions.add(new ArrayList<>(list.subList(i, Math.min(i + partitionSize, list.size()))));
    }
    return partitions;
  }
}
