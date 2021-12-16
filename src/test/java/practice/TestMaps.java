package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMaps {
    public static void main(String [] args ){
        String[] names = {"Inna", "Ninna", "Anna", "Zhanna","Donna","Lanna"};
        String name[] = {"Sasha", "Dasha", "Glasha", "Lasha"};
       Map<String, Double> empMap= new HashMap<>();
       double b;
       for(int i = 0; i<=names.length-1; i++){
           b=+i+500*10000;
           empMap.put(names[i],  b);
       }
       String setNames;
       Double setSalary;
       double maxSalary=0;
       String maxName="";

       Set<String> empSet=empMap.keySet();
        Iterator<String> iterator=empSet.iterator();
        while (iterator.hasNext()){
            setNames=iterator.next();
            setSalary=empMap.get(setNames);
            System.out.println(setNames + "Salary is " + setSalary);
            if (setSalary>maxSalary){
                maxSalary=setSalary;
                maxName=setNames;
            }
        }


        System.out.println("Employee with a largest salary is "+ maxName + " " + maxSalary);
        System.out.println(empMap);




    }
}
