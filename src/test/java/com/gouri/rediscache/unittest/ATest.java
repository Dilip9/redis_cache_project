package com.gouri.rediscache.unittest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ATest {

    @InjectMocks
    private A a;
    @Mock
    private B b;

    @BeforeAll
    public static void setup(){
        System.out.println("setup created.");
    }

    @BeforeEach
    public void init() {
        //initialize mocks
        System.out.println("initialize mocks");
    }

    @Test
    public void whenXIsGreaterThanY() {
        int x=19, y=15;
        //int expected = 24;
        Mockito.when(b.check(x,y)).thenReturn(19);
        int actual = a.sum(x,y);
        assertEquals(19, actual);

    }
    @Test
    public void whenYIsGreaterThanX(){
        int x=5, y=20;
        Mockito.when(b.check(x,y)).thenReturn(20);
        int actual = a.sum(x,y);
        assertEquals(20, actual);
    }

    @Test
    public void whenBothAreEquals(){
        int x=10, y=10;
        Mockito.when(b.check(x,y)).thenReturn(10);
        int actual = a.sum(x,y);
        assertEquals(10, actual);
    }

    @AfterEach
    public void destroy(){
        System.out.println("destroy");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("AfterAll");
    }
}