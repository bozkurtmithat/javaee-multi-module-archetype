# javaee-multi-module-archetype

This projecti is a maven archetype in order create javaee 7 multi module project structure. Actually after creation you can change compiler, javaee and other dependencies's version from parent pom file. You can read maven official documentation but it is so shallow. It doesn't mention about modules and parameterization of project. I examined some archetype using reverse engineering. 

I also use Open Liberty as javaee server. 

## 1. Create Project Skeleton 
Fistly I create projects manually as skeleton  and generate archetype following command. This command expands variables to real values and cause to thight project names. 
```sh
mvn archetype:create-from-project
```

## 2. Change specific parts

I changed archetype-metadata.xml to get modules names at project creation time. `__rootArtifactId__` is a special maven properties and i used it. 

## 3. Compile from source and install local m2 repository.

I couldn't prepare a integraion test scenerio, `mvn install` command triggers sure-fire plugin and cause to error. So I suggest to set `skipTests` flag.
```sh
mvn clean install -DskipTests
```
## 4. Create project from archetype

You can create project as following commond.

```sh
mvn archetype:generate -DarchetypeGroupId=tr.mb.archetypes \
                       -DarchetypeArtifactId=javaee-multi-module \
                       -DarchetypeVersion=1.0.0 \
                       -DgroupId=tr.mb.poc \
                       -DartifactId=apm \
                       -Dversion=1.0-SNAPSHOT
```  

## 5. run application 

Use following command to run open liberty java ee server in development mode

```sh
mvn liberty:dev run
```
