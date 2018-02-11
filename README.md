# BookStore
A distributed web application based on Java EE and Angular. Build REST API's with Java EE and consuming them with Angular.

## Note for wildFly
running the server

>./standalone.sh

add user

>./add_user.sh

## Note for Set mvn
> export PATH=~/apache-maven-3.5.2/bin:$PATH

> export MAVEN_OPTS="-Xms256m -Xmx512m"

add to home directory .bash_profile

source ~/.bash_profile

## Note for Maven Archetype

Command to create maven javaee project.

>mvn -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=webapp-javaee7 -DarchetypeVersion=1.1 -DgroupId=com.bookstore -DartifactId=bookstore-back -Dversion=1.0 -Darchetype.interactive=false --batch-mode -Dpackage=com.bookstore archetype:generate

open project in intellij

## Note for project

Use Java Persistence API (JPA) to do Object Relational Mapping

Manually add support for jpa. Add Schemas and DTDs to the file "persistence_2_1.xsd" in root directory.

>http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd

Use EntityManager and JPQL to implement CURD Operation to database.

Java Transaction API (JTA)

## Test Strategy

###Unit Test

###Integration Test
JUnit and Arquillian, Testing the Book Repository

ShrinkWrap, testing the CRUD operations within wildFly

