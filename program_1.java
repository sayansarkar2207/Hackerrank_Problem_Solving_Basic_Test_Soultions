// 2. Maximum cost of Laptop count A company manufactures a fixed number of laptops every day. However, if some defect is encountered during the testing of a laptop, it is labeled as "illegal" and is not counted in the laptop count of the day. Given the cost to manufacture each laptop, its label as "illegal" or "legal", and the number of legal laptops to be manufactured each day, find the maximum cost incurred by the company in a single day in manufacturing all the laptops. Note that if a laptop is labeled as illegal, its manufacturing cost is still incurred by the company, even though it is not included in the laptop count. Also, days are only taken into when the daily laptop count has been completely met. If there are no such days, the answer is 0. For example, let's say there are n = 5 laptops, where cost = [2,5, 3, 11, 1). The labels for these laptops are labels = ["legal", "illegal", "legal", "illegal", "legal"). Finally, the dailyCount = 2, which means that the company needs to manufacture 2 legal laptops each day. The queue of laptops can be more easily viewed as follows: . cost 2, "legal" cost 5, "illegal" cost 3, "legal" cost 11, "illegal" cost 1, "legal" On the first day, the first three laptops are manufactured in order to reach the daily count of 2 legal laptops. The cost incurred on this day is 2 + 5+ 3 = 10. On the second day, the fourth and fifth laptops are manufactured, but because only one of them is legal, the daily count isn't met, so that day is not taken into consideration. Therefore, the maximum cost incurred on a single day is 10. Function Description Complete the function maxCost in the editor below. maxCost has the following parameter(s): int cost[n] an array of integers denoting the cost to manufacture each laptop string labels[n]: an array of strings denoting the label of each laptop ("legal" or "illegal") int dailyCount: the number of legal laptops to be manufactured each day Returns: int: the maximum cost incurred in a single day of laptop manufacturing Constraints • 1sns 105 Os cost[i]
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException 
    {
        Scanner in=new Scanner(System.in);
        int i=0,n;
        n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(in.next().equals("legal"))
            b[i]=1;
            else
            b[i]=0;
        }
        int dc=in.nextInt();
        int s=0;
        int sum=0;
        int max=0;
        for(i=0;i<n;i++)
        {
            //System.out.println(b[i]);
            s=s+b[i];
            sum=sum+a[i];
            if(s==dc)
            {
                if(sum>max)
                max=sum;
                s=0;
                sum=0;
            }
        }
        System.out.println(max);
    }
}
