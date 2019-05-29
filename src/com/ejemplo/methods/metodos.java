package com.ejemplo.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class metodos {
    List<Integer> mayores = Arrays.asList(1,2,4,5,6,7,8,3,21,0);

    public  void filtro(){
       mayores.stream().filter(x -> x>=5) .forEach(System.out::println);

    }
}
