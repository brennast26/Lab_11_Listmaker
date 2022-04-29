package com.company;
//import java.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final String menu = "A - Add D - Delete P - Print Q - Quit";
        boolean done = false;
        String cmd = "";
        String ListItem = "";
        int Remove = 0;
        int index = 0;
        do
        {
            displayList();
            cmd = SafeInput.getRegExString(in, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();
            switch(cmd)
            {
                case"A":
                    ListItem = SafeInput.getNonZeroLenString(in, "What would you like to add? ");
                    list.add(ListItem);
                    break;
                case "D":
                    Remove = SafeInput.getInt(in, "What is the number of the item you would like to remove?");
                    index = Remove -1;
                    list.remove(index);
                    break;
                case "P":
                    break;
                case "Q":
                    System.exit(0);
                    break;
            }
            System.out.println("cmd is " +cmd);
        }
        while(!done);
    }

    private static void displayList()
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        if(list.size() != 0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                System.out.printf("%3d%10s", i + 1, list.get(i));
            }
        }
        else
        {
            System.out.println("+++          List is empty          +++");
        }
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++");
    }
}
