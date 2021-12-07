package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWords() {
        StringLists lists = new StringLists();
        assertEquals(Arrays.asList("aa","bb","dd"),lists.shortestWords(Arrays.asList("aaa","aa","bb","cccc","dd")));
    }
}