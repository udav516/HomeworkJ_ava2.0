package org.example.seminar4.cw5;

import java.util.Deque;
import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {
        String text1 = "/home/";
        String text2 = "/../";
        String text3 = "/home//foo/";

        System.out.println("1= " + simplifyPath(text1));
        System.out.println("2= " + simplifyPath(text2));
        System.out.println("3= " + simplifyPath(text3));
    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (String s : arr) {
            if (s.equals("") || s.equals(".")) continue;
            else if (s.equals("..")) {
                if (!list.isEmpty()) list.removeLast();
            } else list.add(s);
        }
        return "/" + String.join("/", list);
    }

}
