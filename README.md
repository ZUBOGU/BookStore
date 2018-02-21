# BookStore
A distributed web application based on Java EE and Angular. Build REST API's with Java EE and consuming them with Angular.

## Running the project
Run wildFly service and upload .war file into development. You can retrieve REST API, i.e.

> Go to [http://localhost:8080/bookstore-back/books]()

Inside bookstore-front folder running follow commands.

>npm install : To install node_modules

>ng serve  : To executes the server. Go to [http://localhost:4200]()

## Note for wildFly
running the server

>./standalone.sh

add user

>./add_user.sh

>http://localhost:8080

## Note for Set mvn
> export PATH=~/apache-maven-3.5.2/bin:$PATH

> export MAVEN_OPTS="-Xms256m -Xmx512m"

add to home directory .bash_profile

source ~/.bash_profile

## Note for Maven Archetype

Command to create maven javaee project.

>mvn -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=webapp-javaee7 -DarchetypeVersion=1.1 -DgroupId=com.bookstore -DartifactId=bookstore-back -Dversion=1.0 -Darchetype.interactive=false --batch-mode -Dpackage=com.bookstore archetype:generate

open project in intellij

## Note for back-end project

Use Java Persistence API (JPA) to do Object Relational Mapping

Manually add support for jpa. Add Schemas and DTDs to the files "persistence_2_1.xsd" and "beans_1_1.xsd" in root directory.

>http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd

>http://xmlns.jcp.org/xml/ns/javaee/beans_1_1.xsd

Use EntityManager and JPQL to implement CURD Operation to database.

Java Transaction API (JTA)

Validating Data (Object Attributes and Method Parameter)

Context and Dependency Inject (CDI)

Injecting Beans

### Rest APIs documentation
External systems can consume these APIS. Call it a contract.

Open API provides a standard way to descries REST services.

OpenAPI Specification (OAS) and Swagger

Get swagger.json on web browser. (We can show api with swagger-ui, not implemented)

>http://localhost:8080/bookstore-back/swagger.json

## Test Strategy

### Unit Test

### Integration Test
JUnit and Arquillian, Testing the Book Repository

ShrinkWrap, testing the CRUD operations within wildFly

run test with
>mvn test

### Client Test
JAX-RS client API, access remotely, black box testing

## Note for front-end project

Install Node JS, npm, Yarn, Angular CLI, Swagger code-gen and Check Version

>node -v, npm -v, yarn -v, ng-v, swagger-codegen version

### Bootstrapping an Angular Application

>ng new bookstore-front --prefix bs --skip-tests true --skip-e2e true --inline-style true --routing true

>yarn install : Installs all the dependencies (adding the node_modules directory)

>npm install : Install node_modules

>ng serve  : Executes the server. Go to [http://localhost:4200]()

### Navigating through Components and Invoking the REST service

* With Angular CLI create both components : * `ng generate component book-list --spec false --inline-style` * `ng generate component book-detail --spec false --inline-style` * `ng generate component book-form --spec false --inline-style`

* Generate Services from Swagger : * Get version `swagger-codegen version` * Get help `swagger-codegen help generate` * `swagger-codegen generate -i bookstore-back/src/main/webapp/swagger.json -l typescript-angular2 -o bookstore-front/src/app/service`

* To truncate description in `book-list.component` just `yarn add angular2-truncate`, add `TruncatePipe` in `app.module.ts` in the declarations section, and use it `{{book.description | truncate : 600 }}`



