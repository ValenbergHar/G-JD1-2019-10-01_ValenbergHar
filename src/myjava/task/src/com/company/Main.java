package com.company;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private void solve(Scanner in, PrintWriter out) {
        int v = in.nextInt();
        int t = in.nextInt();
        out.println((-20)% 109);
        System.out.println(((v * t) % 109 + 109) % 109 + 1);
        //System.out.println(((v * t) % 109 + 109) % 109 + 1); ((v * t) % 109 + 109)
    }

    void run() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
    }


    public static void main(String[] args) {
        new Main().run();

    }


}
