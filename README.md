# BookStore
A distributed web application based on Java EE and Angular. Build REST API's with Java EE and consuming them with Angular.

## Used to set mvn
> export PATH=~/apache-maven-3.5.2/bin:$PATH

> export MAVEN_OPTS="-Xms256m -Xmx512m"

add to home directory .bash_profile

source ~/.bash_profile

## Maven Archetype

Command to create maven javaee project. (Do not run this command inside home directey if have issue)

>mvn -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=webapp-javaee7 -DarchetypeVersion=1.1 -DgroupId=com.bookstore -DartifactId=bookstore-back -Dversion=1.0 -Darchetype.interactive=false --batch-mode -Dpackage=com.bookstore archetype:generate
