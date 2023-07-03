package com.tigergraph.client;
import java.io.OutputStream;

public class Driver {
    public static void main(String[] args) {
        String Gsql_Client_Version= System.getenv("GSQL_CLIENT_VERSION");
        if (Gsql_Client_Version == null) {
            Gsql_Client_Version = System.getProperty("GSQL_CLIENT_VERSION");
        }
        if (Gsql_Client_Version == null) {
            Gsql_Client_Version = "";
        }
        // do two loops: 1st to try the given Gsql_Client_Version;
        // 2nd is to try each one except the given Gsql_Client_Version
        String Supported_Versions="";
        for (int i = 1; i <= 2; i++) {
            if ( i==2) {
                System.out.println( "Supported Versions ( " + Supported_Versions +")");
                System.out.println( "You may use 'GSQL_CLIENT_VERSION=v? java ...' or \n    'java -DGSQL_CLIENT_VERSION=v? ...' to specify the version");
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_9_2 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_9_2") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_9_2")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_9_2");
                    com.tigergraph.v3_9_2.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_9_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_9_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_9_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_9_0");
                    com.tigergraph.v3_9_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_8_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_8_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_8_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_8_0");
                    com.tigergraph.v3_8_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_7_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_7_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_7_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_7_0");
                    com.tigergraph.v3_7_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_6_3 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_6_3") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_6_3")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_6_3");
                    com.tigergraph.v3_6_3.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_6_2 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_6_2") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_6_2")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_6_2");
                    com.tigergraph.v3_6_2.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_6_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_6_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_6_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_6_0");
                    com.tigergraph.v3_6_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_5_3 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_5_3") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_5_3")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_5_3");
                    com.tigergraph.v3_5_3.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_5_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_5_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_5_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_5_0");
                    com.tigergraph.v3_5_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_4_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_4_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_4_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_4_0");
                    com.tigergraph.v3_4_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_3_0_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_3_0_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_3_0_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_3_0_1");
                    com.tigergraph.v3_3_0_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_2_3 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_2_3") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_2_3")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_2_3");
                    com.tigergraph.v3_2_3.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_2_2_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_2_2_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_2_2_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_2_2_1");
                    com.tigergraph.v3_2_2_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_2_1_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_2_1_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_2_1_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_2_1_1");
                    com.tigergraph.v3_2_1_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_2_0_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_2_0_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_2_0_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_2_0_1");
                    com.tigergraph.v3_2_0_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_2_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_2_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_2_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_2_0");
                    com.tigergraph.v3_2_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_1_6_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_1_6_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_1_6_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_1_6_1");
                    com.tigergraph.v3_1_6_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_1_5_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_1_5_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_1_5_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_1_5_1");
                    com.tigergraph.v3_1_5_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_1_2 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_1_2") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_1_2")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_1_2");
                    com.tigergraph.v3_1_2.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_1_1_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_1_1_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_1_1_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_1_1_1");
                    com.tigergraph.v3_1_1_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_1_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_1_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_1_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_1_1");
                    com.tigergraph.v3_1_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_1_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_1_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_1_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_1_0");
                    com.tigergraph.v3_1_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_0_6_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_0_6_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_0_6_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_0_6_1");
                    com.tigergraph.v3_0_6_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_0_5_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_0_5_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_0_5_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_0_5_1");
                    com.tigergraph.v3_0_5_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_0_5 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_0_5") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_0_5")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_0_5");
                    com.tigergraph.v3_0_5.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v3_0_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v3_0_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v3_0_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v3_0_0");
                    com.tigergraph.v3_0_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_6_6_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_6_6_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_6_6_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_6_6_1");
                    com.tigergraph.v2_6_6_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_6_2 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_6_2") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_6_2")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_6_2");
                    com.tigergraph.v2_6_2.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_6_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_6_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_6_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_6_0");
                    com.tigergraph.v2_6_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_5_4_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_5_4_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_5_4_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_5_4_1");
                    com.tigergraph.v2_5_4_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_5_2_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_5_2_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_5_2_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_5_2_1");
                    com.tigergraph.v2_5_2_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_5_2 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_5_2") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_5_2")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_5_2");
                    com.tigergraph.v2_5_2.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_5_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_5_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_5_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_5_0");
                    com.tigergraph.v2_5_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_4_1 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_4_1") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_4_1")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_4_1");
                    com.tigergraph.v2_4_1.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_4_0 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_4_0") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_4_0")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_4_0");
                    com.tigergraph.v2_4_0.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
            if ( i==1 ) {
                Supported_Versions = Supported_Versions + "v2_3_2 ";
            }
            if ( ( i==1 && Gsql_Client_Version.equalsIgnoreCase("v2_3_2") ) ||
                 ( i==2 && (!Gsql_Client_Version.equalsIgnoreCase("v2_3_2")) )){
                try {
                    System.out.println("========================");
                    System.out.println("Trying version: v2_3_2");
                    com.tigergraph.v2_3_2.client.Driver.main(args);
                } catch (SecurityException e) {
                    ;
                }
            }
        }
     } // end main
}
