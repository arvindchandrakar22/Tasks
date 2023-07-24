package com.practice.java_streams;

import java.util.Arrays;
import java.util.List;

class Studentt{
    String name;
    int score;

    public Studentt(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class Demo20ParallelStream {
    public static void main(String[] args) {

        List<Studentt> studentList = Arrays.asList(
                                        new Studentt("David",82),
                                        new Studentt("Bob",90),
                                        new Studentt("John",65),
                                        new Studentt("Canedy",55),
                                        new Studentt("Eric",85),
                                        new Studentt("Smith",88),
                                        new Studentt("Scott",50)
        );

        //By Using Normal Stream
//        studentList.stream().filter(s->s.getScore()>=80)
//                .limit(3)
//                .forEach(x->{System.out.println(x.getName()+" "+x.getScore());
//        });

        //By Using Parallel Stream
        studentList.parallelStream().filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(x->{System.out.println(x.getName()+" "+x.getScore());
        });

        //Convert stream() --> parallelStream() .... using parallel() method
        studentList.stream().parallel().filter(s->s.getScore()>=80)
                .limit(3)
                .forEach(x->{System.out.println(x.getName()+" "+x.getScore());
        });
    }
}
