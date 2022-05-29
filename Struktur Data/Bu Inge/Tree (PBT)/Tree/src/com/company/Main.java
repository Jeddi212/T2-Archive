package com.company;
import java.util.Scanner;

public class Main {
    static class Ref{
        int key;
        Ref left;
        Ref right;
        public Ref(int nilai, Ref left, Ref right){
            key = nilai;
            this.left = left;
            this.right = right;
        }
    }

    static int n;
    static Ref root;

    static Scanner input = new Scanner(System.in);

    static Ref Tree(int n){
        Ref newNode;
        int x;
        int nl;
        int nr;
        if(n==0){
            return null;
        }else{
            nl=n / 2;
            nr=n-nl-1;
            x = input.nextInt();
            newNode = new Ref(x,Tree(nl),Tree(nr));
            return newNode;
        }
    }

    public static void printTree(Ref t,int h){
        int i;
        if(t!=null){
            printTree(t.left,h+1);
            for(i=0;i<h;i++) {
                System.out.print(' ');
            }
            System.out.println(t.key);
            printTree(t.right,h+1);
        }
    }
    public static void main(String[] args) {
	    n = input.nextInt();
	    root = Tree(n);
	    printTree(root,0);
    }
}
