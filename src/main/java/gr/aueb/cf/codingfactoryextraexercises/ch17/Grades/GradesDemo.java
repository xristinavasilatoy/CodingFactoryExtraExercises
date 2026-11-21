package gr.aueb.cf.codingfactoryextraexercises.ch17.Grades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GradesDemo {

    List<Integer> list = new ArrayList<>(List.of(8, 3, 10, 4, 7, 2, 9));

    public void gradesPass() {


        list.removeIf(n -> n < 5);

        }
//        while(it.hasNext()){
//
//            if (it.next() < 5) {
//                it.remove();
        }

 //       }
//        for (int n : list) {
//            System.out.println(n);
 //       }
 //   }
//}