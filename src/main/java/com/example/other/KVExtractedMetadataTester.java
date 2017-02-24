package com.example.other;

import java.util.*;

public class KVExtractedMetadataTester
{

    public static void main(String[] args)
    {
        Map<String, Set<String>> providedParentMetadata = new HashMap<>();
        Map<String, Set<String>> kvExtractedFields = new HashMap<>();
        String kvExtractedPrefix = "CHILD_INFO_1_KV_EXTRACTED";
        String childInfoPrefix = "CHILD_INFO_1_";

        providedParentMetadata.put("CHILD_INFO_1_KV_EXTRACTED_SOMEDATA", new HashSet<>(Arrays.asList("a", "b")));
        providedParentMetadata.put("CHILD_INFO_1_KV_EXTRACTED_OTHERDATA", new HashSet<>(Arrays.asList("c", "d")));


        providedParentMetadata.entrySet()
            .stream()
            .forEach(entry -> {
                if (entry.getKey().startsWith(kvExtractedPrefix)) {
                    kvExtractedFields.put(entry.getKey().substring(childInfoPrefix.length()), entry.getValue());
                }
            });

        kvExtractedFields.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ", " + e.getValue()));
    }
}
