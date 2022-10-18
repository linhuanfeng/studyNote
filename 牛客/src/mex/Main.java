package mex;

import java.io.*;
import java.util.TreeSet;

/**
 * 若S表示一个非负整数集合，mex(S)的值为不属于集合S的最小非负整数。例如，mex({0,1,4})=2，mex({1，2})=0。
 * 有n个互不相同的非负整数a1，a2，…an构成了一个非负整数集合A。小美想知道若将a；(1≤i≤n)从集合A中删除，剩下的n-
 * 1个数构成的新集合A'的mex值为多少？请输出i从1到n所有取值下新集合的mex值。
 * 输入描述
 * 第一行输入一个整数n，表示集合A的大小。
 * 第二行输入n个整数a1，a2,…an。
 * n<5e4,ai≤1e9，保证ai互不相同。数字间两两有空格隔开。
 *
 * 输出描述
 * 输出n个整数，相邻两个数之间用空格隔开。其中第i个数表示从集合A中删除aj，剩下n-1个数构成的新集合的mex值。
 *
 * input:
 * 4
 * 5 0 3 1
 *
 * output:
 * 2 0 2 1
 */
// 82%
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.valueOf(br.readLine());
        String[] split = br.readLine().split(" ");
        int[] arr=new int[split.length];
        TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.valueOf(split[i]);
            set.add(arr[i]);
        }

//        Arrays.sort(arr);

        int[] ans=new int[n];
//        if(arr[1]==0){
//            for (int i = 1; i < n; i++) {
//                if(arr[i]!=i){
//                    ans[0]=i;
//                    break;
//                }
//            }
//        }else {
//            ans[0]=0;
//        }
//
//        for (int i = 1; i < n; i++) {
//
//        }

        for (int i = 0; i < n; i++) {
            set.remove(arr[i]);
            Integer first = set.first();
            if(first>0){
                ans[i]=0;
            }else {
                for (int j = 1; ; j++) {
                    if(!set.contains(j)){
                        ans[i]=j;
                        break;
                    }
                }
            }
            set.add(arr[i]);
        }
        for (int an : ans) {
            bw.write(an+" ");
        }
        bw.flush();
    }
}
