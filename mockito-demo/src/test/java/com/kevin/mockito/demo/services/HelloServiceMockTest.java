package com.kevin.mockito.demo.services;

import com.kevin.mockito.demo.repository.HelloRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)  // JUnit 5
//@RunWith(MockitoJUnitRunner.class) // JUnit 4
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;
    @Mock
    List<String> mockedList;
    @Mock
    Map<String, String> mockedMap;
    @Spy
    List<String> spiedList = new ArrayList<>();
    @Captor
    ArgumentCaptor<String> argCaptor;

    //@Spy
    @InjectMocks // auto inject helloRepository
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setMockOutput() {
        //when(helloService.get()).thenReturn("Hello Mockito");
        when(helloRepository.get()).thenReturn("Hello Mockito From Responsitory");
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals("Hello Mockito From Responsitory", helloService.get());
    }

    @Test
    public void verify1() {
        mockedList.add("one");
        mockedList.size();
        mockedList.size();

        verify(mockedList).add("one"); // check .add("one") called only once <=>
        verify(mockedList, times(1)).add("one"); // <=>
        verify(mockedList, times(2)).size(); // check .size() called twice
        verify(mockedList).add(anyString()); // check .add() called that don't care argument
        verify(mockedList).add(any(String.class)); // <=>
        verify(mockedList, atLeastOnce()).size(); // must be called at least once
        verify(mockedList, atLeast(1)).size(); // must be called at least once
        verify(mockedList, atMost(2)).size(); // must be called at most 2 times
        verify(mockedList, never()).clear(); //  must never be called
    }
    @Test
    public void verify2() {
        mockedList.size();
        // all interactions are verified, so below will pass
        verifyNoMoreInteractions(mockedList);
        mockedList.isEmpty();
        // isEmpty() is not verified, so below will fail
        verifyNoMoreInteractions(mockedList);
//        verifyZeroInteractions(mockedList); <=>
    }
    @Test
    public void verify3() {
        // verify only method call
        mockedList.isEmpty();
//        mockedList.isEmpty(); // If add this -> FAIL
        verify(mockedList, only()).isEmpty();
    }
    @Test
    public void verify4() {
        // Verify Order of Invocation
        // We can use InOrder to verify the order of invocation. We can skip any method to verify, but the methods being verified must be invoked in the same order.
        mockedList.isEmpty();
        mockedMap.isEmpty();
        mockedList.size();
        mockedMap.size(); // If change order -> FAIL
        InOrder inOrder = inOrder(mockedList, mockedMap);
        inOrder.verify(mockedList).isEmpty();
        inOrder.verify(mockedMap).isEmpty();
        inOrder.verify(mockedList).size();
        inOrder.verify(mockedMap).size();
    }

    @Test
    public void testSpy() {
        assertEquals(0, mockedList.size()); // Always 0 because this is a mock obj

        when(mockedList.size()).thenReturn(100);
        assertEquals(100, mockedList.size());

        spiedList.add("one");
        spiedList.add("two");

        verify(spiedList).add("one");
        verify(spiedList).add("two");

        assertEquals(2, spiedList.size());

        doReturn(100).when(spiedList).size();
        assertEquals(100, spiedList.size());
    }

    @Test
    public void testCaptor() {
        mockedList.add("two");
        verify(mockedList).add(argCaptor.capture());
        assertEquals("two", argCaptor.getValue());
    }

    @Test
//    @Test(expected = IllegalArgumentException.class) // JUnit 4
    public void assertThrows() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

}