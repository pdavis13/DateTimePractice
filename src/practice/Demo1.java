/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author pdavis13
 */
public class Demo1 {
    public static void main(String[] args) {
        
        Calendar date1 = Calendar.getInstance();
        int max = date1.getActualMaximum(Calendar.DATE);
        System.out.println("Last day of month: " + max);
        
//        Calendar date1 = Calendar.getInstance();
//        date1.add(Calendar.YEAR, 30); // or Calendar.DAY, Calendar.MONTH, etc.
//        Date date = date1.getTime();
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
//        System.out.println(sdf.format(date));
        
        
//        Calendar date1 = Calendar.getInstance();
//        Calendar date2 = Calendar.getInstance();
//        date2.set(2000, Calendar.APRIL, 0);
//        
//        boolean isAfter = date1.after(date2);
//        if(isAfter){
//            System.out.println("date1 is after date2");
//        } else{
//            System.out.println("date1 is not after date2");
//        }
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
//        Date presentDate = new Date();
//        // Convert Date to String
//        String fmtDate = sdf.format(presentDate);
//        System.out.println(fmtDate);
//        
//        // Convert String to Date
//        String strDate = "1/1/2000 02:33";
//        try {
//            Date date3 = sdf.parse(strDate);
//            System.out.println(date3.toString());
//        } catch(ParseException p){
//            System.out.println("Sorry you must match the format to do this work");
//        }
        
//        
//        Calendar now2 = Calendar.getInstance();
//        int offset = now2.get(Calendar.ZONE_OFFSET)/(60*60*1000);
//        System.out.println("GMT Offset: " + offset);
//        Date calDate = now2.getTime();
//        System.out.println(sdf.format(calDate));
    }
}
