package com.taskone.crudoperation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("shiftingWord")
public class ShiftingWord {
    private String str = "Hello";
    @GetMapping("start")
    public void startLoop() throws InterruptedException {

        int len = 0;
        while(true)
        {
            String st = "    "+str+"    ";

//            if(str.length()<10)
//                str+="    ";

            for(int i=len;i<len+10;i++)
                System.out.print(st.charAt(i%st.length()));

            len++;
            Thread.sleep(1000);

            for(int i=0;i<50;i++)
                System.out.println();
//            clrscr();

        }
    }
    @GetMapping("add/{s}")
    public String addString(@PathVariable String s)
    {
        str = s;
        return "added";
    }

    public static void clrscr(){
        //Clears Screen in java (To see its effect, have to run this code in terminal)
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
}
