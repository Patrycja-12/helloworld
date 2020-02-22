package BARNABA;

import java.util.List;
import java.util.stream.Collectors;

public class OdwracaczStringów {

    public List<String> odwróc(List<String> input) {
        if (input == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return input.stream()
                .map(x -> {
                    if (x == null) {
                        throw new IllegalArgumentException("List cannot contain null");
                    }
                    return new StringBuilder(x).reverse().toString();
                })
                .collect(Collectors.toList());
    }

}