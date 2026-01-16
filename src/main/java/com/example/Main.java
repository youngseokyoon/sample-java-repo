package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("  Sample Java Application");
        System.out.println("==================================");
        
        System.out.println("\nBuild Information:");
        System.out.println("  Java Version: " + System.getProperty("java.version"));
        System.out.println("  Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("  OS: " + System.getProperty("os.name") + " " + System.getProperty("os.version"));
        
        if (args.length > 0) {
            System.out.println("\nArguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  [" + i + "] " + args[i]);
            }
        }
        
        System.out.println("\n✅ Application executed successfully!");
    }
}
