/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.bpba.muleservicemanager;

/**
 *
 * @author P046456
 */
public class Variables {
    public static String usuario="P046456";
    public static String password="Julio2022";
    
    public static String crearBuild = "{\n" +
" 	\"name\": \"variableNombreLegacy - variableBranch - v3.9.5\",\n" +
"	\"type\": \"build\",\n" +
"	\"quality\": \"definition\",\n" +
"	\"queue\": {\n" +
"		\"id\": 1\n" +
"	},\n" +
"	\"build\": [\n" +
"      {\n" +
"		\"enabled\": true,\n" +
"		\"continueOnError\": false,\n" +
"		\"alwaysRun\": false,\n" +
"		\"displayName\": \"Run C:\\\\apache-maven-3.5.4\\\\bin\\\\mvn\",\n" +
"		\"task\": {\n" +
"			\"id\": \"d9bafed4-0b18-4f58-968d-86655b4d2ce9\",\n" +
"			\"versionSpec\": \"*\"\n" +
"		},\n" +
"		\"inputs\": {\n" +
"			\"filename\": \"C:\\\\apache-maven-3.5.4\\\\bin\\\\mvn\",\n" +
"			\"arguments\": \"package -X\",\n" +
"			\"workingFolder\": \"\",\n" +
"			\"failOnStandardError\": \"false\"\n" +
"		}\n" +
"	},\n" +
"      {\n" +
"		\"enabled\": true,\n" +
"		\"continueOnError\": false,\n" +
"		\"alwaysRun\": false,\n" +
"		\"displayName\": \"variableDisplayName\",\n" +
"		\"task\": {\n" +
"			\"id\": \"0efd1a58-b059-42a7-b3e9-cac0b996c975\",\n" +
"			\"versionSpec\": \"*\"\n" +
"		},\n" +
"		\"inputs\": {\n" +
"			\"sourceFolder\": \"target\",\n" +
"			\"contents\": \"variableNombreLegacy.zip\",\n" +
"			\"targetFolder\": \"/opt/mule/apps/\",\n" +
"			\"host\": \"variableServerIp\",\n" +
"			\"port\": \"22\",\n" +
"			\"username\": \"$(usuario)\",\n" +
"			\"password\": \"$(clave)\",\n" +
"			\"privatekey\": \"\",\n" +
"			\"cleanTargetFolder\": \"false\",\n" +
"			\"failOnCleanError\": \"false\",\n" +
"			\"overwrite\": \"true\",\n" +
"			\"failOnEmptySource\": \"false\",\n" +
"			\"flattenFolders\": \"false\"\n" +
"		}\n" +
"	}\n" +
"    ],\n" +
"	\"options\": [\n" +
"      {\n" +
"		\"enabled\": false,\n" +
"		\"definition\": {\n" +
"			\"id\": \"7c555368-ca64-4199-add6-9ebaf0b0137d\"\n" +
"		},\n" +
"		\"inputs\": {\n" +
"			\"multipliers\": \"[]\",\n" +
"			\"parallel\": \"false\",\n" +
"			\"continueOnError\": \"true\",\n" +
"			\"additionalFields\": \"{}\"\n" +
"		}\n" +
"	},\n" +
"      {\n" +
"		\"enabled\": false,\n" +
"		\"definition\": {\n" +
"			\"id\": \"a9db38f9-9fdc-478c-b0f9-464221e58316\"\n" +
"		},\n" +
"		\"inputs\": {\n" +
"			\"workItemType\": \"37\",\n" +
"			\"assignToRequestor\": \"true\",\n" +
"			\"additionalFields\": \"{}\"\n" +
"		}\n" +
"	},\n" +
"      {\n" +
"		\"enabled\": false,\n" +
"		\"definition\": {\n" +
"			\"id\": \"7c555368-ca64-4199-add6-9ebaf0b0137d\"\n" +
"		},\n" +
"		\"inputs\": {\n" +
"			\"additionalFields\": \"{}\"\n" +
"		}\n" +
"	}\n" +
"    ],\n" +
"	\"triggers\": [\n" +
"      {\n" +
"		\"branchFilters\": [\"variableIntegracionContinua\"],\n" +
"		\"batchChanges\": true,\n" +
"		\"maxConcurrentBuildsPerBranch\": 1,\n" +
"		\"triggerType\": \"continuousIntegration\"\n" +
"	}\n" +
"    ],\n" +
"	\"variables\": {\n" +
"		\"system.debug\": {\n" +
"			\"value\": \"false\",\n" +
"			\"allowOverride\": true\n" +
"		},\n" +
"		    \"usuario\": {\n" +
"			\"value\": \"tfs_mule\",\n" +
"			\"allowOverride\": false,\n" +
"            \"IsSecret\":\"false\"\n" +
"		},\n" +
"        	\"clave\": {\n" +
"			\"value\": \"Bapro2022\",\n" +
"			\"allowOverride\": false,\n" +
"            \"IsSecret\":\"true\"\n" +
"		}\n" +
"\n" +
"	},\n" +
"	\"retentionRules\": [\n" +
"      {\n" +
"		\"branches\": [\"+refs/heads/*\"],\n" +
"		\"artifacts\": [\"build.SourceLabel\"],\n" +
"		\"daysToKeep\": 10,\n" +
"		\"minimumToKeep\": 1,\n" +
"		\"deleteBuildRecord\": true,\n" +
"		\"deleteTestResults\": true\n" +
"	}\n" +
"    ],\n" +
"	\"buildNumberFormat\": \"$(BuildDefinitionName)#v$(Date:yyyyMMdd)$(Rev:.r)\",\n" +
"	\"jobAuthorizationScope\": \"projectCollection\",\n" +
"	\"repository\": {\n" +
"		\"properties\": {\n" +
"			\"labelSources\": \"0\"\n" +
"		},\n" +
"		\"type\": \"TfsGit\",\n" +
"		\"name\": \"variableNombreLegacy\",\n" +
"		\"defaultBranch\": \"variableDefaultBranch\",\n" +
"		\"clean\": \"undefined\",\n" +
"		\"checkoutSubmodules\": false\n" +
"	}\n" +
"}";
    
}
