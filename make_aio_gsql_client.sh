#!/bin/bash
GLE_DIR=$1
if [ "$#" -ne 1 ]; then
    echo "Illegal number of parameters: need GLE src path"
    exit 1
fi

# how to add a new version:
# make sure GLE repo is available.
# 1. Add 2 lines in this file, section 2.
# 2. Change pom.xml with the new version


#######################################
# 1. create Driver.java begin section #
#######################################
rm -rf src/main/java/com/tigergraph/*
mkdir -p src/main/java/com/tigergraph/client
cat <<EOT >> src/main/java/com/tigergraph/client/Driver.java
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
EOT
########################################################################
# 2. add each version. Make sure we can CD to the first GLE directory. #
########################################################################
cd $GLE_DIR; git pull && git checkout tg_3.6.3_dev; cd -
#                     client path branch/tag                      version_string is_tag?
./new_gsql_version.sh $GLE_DIR    tg_3.6.3_dev                    v3_6_3
./new_gsql_version.sh $GLE_DIR    tg_3.6.2_dev                    v3_6_2
./new_gsql_version.sh $GLE_DIR    tg_3.6.0_dev                    v3_6_0
./new_gsql_version.sh $GLE_DIR    tg_3.5.3_dev                    v3_5_3
./new_gsql_version.sh $GLE_DIR    tg_3.5.0_dev                    v3_5_0
./new_gsql_version.sh $GLE_DIR    tg_3.4.0_dev                    v3_4_0
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.3.0                 v3_3_0_1
./new_gsql_version.sh $GLE_DIR    tg_3.2.3_dev                    v3_2_3
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.2.2                 v3_2_2_1
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.2.1                 v3_2_1_1
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.2.0                 v3_2_0_1
./new_gsql_version.sh $GLE_DIR    tg_3.2.0_dev                    v3_2_0
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.1.6                 v3_1_6_1
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.1.5                 v3_1_5_1
./new_gsql_version.sh $GLE_DIR    tg_3.1.2_dev                    v3_1_2
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.1.1                 v3_1_1_1
./new_gsql_version.sh $GLE_DIR    tg_3.1.1_dev                    v3_1_1
./new_gsql_version.sh $GLE_DIR    tg_3.1.0_dev                    v3_1_0
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.0.6                 v3_0_6_1
./new_gsql_version.sh $GLE_DIR    log4j-rce/3.0.5                 v3_0_5_1
./new_gsql_version.sh $GLE_DIR    tg_3.0.5_dev                    v3_0_5
./new_gsql_version.sh $GLE_DIR    tg_3.0.0_dev                    v3_0_0
./new_gsql_version.sh $GLE_DIR    log4j-rce/2.6.6                 v2_6_6_1
./new_gsql_version.sh $GLE_DIR    tg_2.6.2_dev                    v2_6_2
./new_gsql_version.sh $GLE_DIR    tg_2.6.0_dev                    v2_6_0
./new_gsql_version.sh $GLE_DIR    log4j-rce/2.5.4                 v2_5_4_1
./new_gsql_version.sh $GLE_DIR    log4j-rce/2.5.2                 v2_5_2_1
./new_gsql_version.sh $GLE_DIR    tg_2.5.2_dev                    v2_5_2
./new_gsql_version.sh $GLE_DIR    tg_2.5.0_dev                    v2_5_0
./new_gsql_version.sh $GLE_DIR    tg_2.4.1_dev                    v2_4_1
./new_gsql_version.sh $GLE_DIR    tg_2.4.0_dev                    v2_4_0
./new_gsql_version.sh $GLE_DIR    tg_2.3.2_dev                    v2_3_2
######################################
# 3. finish Driver.java endi section #
######################################
cat <<EOT >> src/main/java/com/tigergraph/client/Driver.java
        }
     } // end main
}
EOT

# Continue with " mvn package "
