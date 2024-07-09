package com.springcomplete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    // 
    void main(){
        String[] args = {"3", "1", "2"};
    //when & then
        Main.main(args);
    }
}