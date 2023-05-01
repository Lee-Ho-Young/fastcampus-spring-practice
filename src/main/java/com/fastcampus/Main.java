package com.fastcampus;

import com.fastcampus.config.Config;
import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.JavaSort;
import com.fastcampus.logic.Sort;
import com.fastcampus.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        Sort<String> sort = new JavaSort<>();
        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}