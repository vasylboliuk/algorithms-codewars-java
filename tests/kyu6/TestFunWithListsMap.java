package kyu6;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import java.util.function.*;

/**
 * Created by Dell on 1/3/2017.
 */
public class TestFunWithListsMap {
    // Helpers.testMap(input_list_head, mapping_function, expected_list_head)

    @Test
    public void basicTests() {
        //FunWithListsMap.testMap(null, __ -> false, null);

        Function<Integer, Integer> f = x -> x * 2;
        //FunWithListsMap.testMap(new Node(1, new Node(2, new Node(3))), f, new Node(2, new Node(4, new Node(6))));
    }
}
