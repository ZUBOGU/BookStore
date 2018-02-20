# BookStore
A distributed web application based on Java EE and Angular. Build REST API's with Java EE and consuming them with Angular.

## Running the project

Inside bookstore-front folder running follow commands.

>npm install : Install node_modules

>ng serve  : Executes the server. Go to [http://localhost:4200]()

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

### Navigating thropugh Components and Invoking the REST service

* With Angular CLI create both components : * `ng generate component book-list --spec false --inline-style` * `ng generate component book-detail --spec false --inline-style` * `ng generate component book-form --spec false --inline-style`
* Add the components to the `app.component.html` file ``` <div class="container"> <div class="jumbotron"> <bs-book-list></bs-book-list> <bs-book-detail></bs-book-detail> <bs-book-form></bs-book-form> </div> </div> ```
* Change the page `book-list.component.html` file ``` <h2>List all the books - nbBooks</h2> <ul class="list-unstyled"> <li class="media my-4"> <img class="d-flex mr-3 img-thumbnail" src="" alt="Generic placeholder image"> <div class="media-body"> <h5 class="mt-0 mb-1"><a href="">book title</a></h5> book description </div> </li> </ul> ```
* Change the page `book-detail.component.html` file ``` <h2>Detail of a book</h2> <form> <div class="form-group row"> <label class="col-2 col-form-label">Title</label> <div class="col-10"> <input class="form-control" type="text" value="book title" readonly> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Description</label> <div class="col-10"> <textarea class="form-control" rows="3" readonly>book description</textarea> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Unit cost</label> <div class="col-10"> <div class="input-group"> <input class="form-control" type="number" value="book unitCost" readonly> <span class="input-group-addon">$</span> </div> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">ISBN</label> <div class="col-10"> <input class="form-control" type="text" value="book isbn" readonly> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Number of pages</label> <div class="col-10"> <input class="form-control" type="number" value="book nbOfPages" readonly> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Language</label> <div class="col-10"> <input class="form-control" type="text" value="book language" readonly> </div> </div> <button type="submit" class="btn btn-primary">Delete</button> <a class="btn btn-secondary" href="" role="button">Back</a> </form> ```
* Change the page `book-form.component.html` file ``` <h2>Create a new book</h2> <form> <div class="form-group row"> <label class="col-2 col-form-label">Title</label> <div class="col-10"> <input class="form-control" type="text" name="title"> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Description</label> <div class="col-10"> <textarea class="form-control" rows="3" name="description"></textarea> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Unit cost</label> <div class="col-10"> <div class="input-group"> <input class="form-control" type="number" name="unitCost"> <span class="input-group-addon">$</span> </div> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Number of pages</label> <div class="col-10"> <input class="form-control" type="number" name="nbOfPages"> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Image URL</label> <div class="col-10"> <input class="form-control" type="url" name="imageURL"> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Language</label> <div class="col-10"> <select class="form-control" name="language"> <option value="">Select</option> <option value="0">ENGLISH</option> <option value="1">FRENCH</option> <option value="2">SPANISH</option> <option value="3">PORTUGUESE</option> <option value="4">ITALIAN</option> <option value="5">FINISH</option> <option value="6">GERMAN</option> <option value="7">DUTCH</option> <option value="8">RUSSIAN</option> </select> </div> </div> <button type="submit" class="btn btn-primary">Create</button> <a class="btn btn-secondary" href="" role="button">

* Change the component `app.component.html` file ``` <div class="container"> <div class="jumbotron"> <router-outlet></router-outlet> </div> </div> ```
* Add the routes to the `app-routing.module.ts` file ``` const routes: Routes = [ {path: '', component: BookListComponent}, {path: 'book-list', component: BookListComponent}, {path: 'book-detail/:bookId', component: BookDetailComponent}, {path: 'book-form', component: BookFormComponent} ]; ```
* Add the routerLink on the components : `app.component.html` ``` <a class="navbar-brand" [routerLink]="['/book-list']">{{title}}</a> <div class="collapse navbar-collapse" id="navbarCollapse"> <ul class="navbar-nav mr-auto"> <li class="nav-item"> <a class="nav-link" [routerLink]="['/book-list']">List</a> </li> <li class="nav-item"> <a class="nav-link" [routerLink]="['/book-form']">Create</a> ``` `book-detail.component.html` ``` <form (ngSubmit)="delete()"> <button type="submit" class="btn btn-primary">Delete</button> <a class="btn btn-secondary" [routerLink]="['/book-list']" role="button">Back</a> </form> ``` `book-form.component.html` ``` <form (ngSubmit)="create()"> <button type="submit" class="btn btn-primary">Create</button> <a class="btn btn-secondary" [routerLink]="['/book-list']" role="button">Cancel</a> </form> ``` `book-list.component.html` ``` <h5 class="mt-0 mb-1"><a [routerLink]="['/book-detail/1234']">book title</a></h5> ```
* Already introduce the router API by adding the create method in `book-form.component.ts` ``` constructor(private router: Router) { } create() { this.router.navigate(['/book-list']); } ``` And in `book-detail.component.ts` ``` constructor(private router: Router) { } delete() { this.router.navigate(['/book-list']); } ```

* Generate Services from Swagger : * Get version `swagger-codegen version` * Get help `swagger-codegen help generate` * `swagger-codegen generate -i bookstore-back/src/main/webapp/swagger.json -l typescript-angular2 -o bookstore-front/src/app/service`
* Fixing issue [https://github.com/swagger-api/swagger-codegen/issues/4397](). Change the code of `createBook` in `BookApi.ts` : ``` public createBook(body: models.Book, extraHttpRequestParams?: any): Observable<{}> { return this.createBookWithHttpInfo(body, extraHttpRequestParams) .map((response: Response) => { switch (response.status) { case 204 : return undefined; case 201 : return response; default : return response.json(); } }); } ```
* Change the `Book` interface to a class (`export class Book`)
* Add the `BookAPI` provider to the `app.module.ts` (`providers: [BookApi],`)
* Add links to the `book-list.component.html` ``` <h2>List all the books - {{nbBooks}}</h2> <ul class="list-unstyled"> <li class="media my-4" *ngFor="let book of books"> <img class="d-flex mr-3 img-thumbnail" src="{{book.imageURL}}" alt="Generic placeholder image"> <div class="media-body"> <h5 class="mt-0 mb-1"><a [routerLink]="['/book-detail', book.id]">{{book.title}}</a></h5> {{book.description}} </div> </li> </ul> ``` Add variables and API to the `book-list.component.ts` ``` private nbBooks: number; private books: Book[]; constructor(private bookAPI: BookApi) { } ngOnInit() { this.bookAPI.countBooks().subscribe(nbBooks => this.nbBooks = nbBooks); this.bookAPI.getBooks().subscribe(books => this.books = books); } ```
* Change the page `book-detail.component.html` file ``` <h2>Detail of a book</h2> <form> <div class="form-group row"> <label class="col-2 col-form-label">Title</label> <div class="col-10"> <input class="form-control" type="text" value="{{book.title}}" readonly> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Description</label> <div class="col-10"> <textarea class="form-control" rows="3" readonly>{{book.description}}</textarea> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Unit cost</label> <div class="col-10"> <div class="input-group"> <input class="form-control" type="number" value="{{book.unitCost}}" readonly> <span class="input-group-addon">$</span> </div> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">ISBN</label> <div class="col-10"> <input class="form-control" type="text" value="{{book.isbn}}" readonly> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Number of pages</label> <div class="col-10"> <input class="form-control" type="number" value="{{book.nbOfPages}}" readonly> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Language</label> <div class="col-10"> <input class="form-control" type="text" value="{{book.language}}" readonly> </div> </div> <button type="submit" class="btn btn-primary">Delete</button> <a class="btn btn-secondary" href="" role="button">Back</a> </form> ``` Change the page `book-detail.component.ts` file ``` private book: Book = new Book(); constructor(private router: Router, private route: ActivatedRoute, private bookAPI: BookApi) { } ngOnInit() { this.route.params .map(params => params['bookId']) .switchMap(id => this.bookAPI.getBook(id)) .subscribe(book => this.book = book); } delete() { this.bookAPI.deleteBook(this.book.id).subscribe(); this.router.navigate(['/book-list']); } ```
* Change the page `book-form.component.html` file ``` <h2>Create a new book</h2> <form (ngSubmit)="create()"> <div class="form-group row"> <label class="col-2 col-form-label">Title</label> <div class="col-10"> <input class="form-control" type="text" [(ngModel)]="book.title" name="title"> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Description</label> <div class="col-10"> <textarea class="form-control" rows="3" [(ngModel)]="book.description" name="description"></textarea> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Unit cost</label> <div class="col-10"> <div class="input-group"> <input class="form-control" type="number" [(ngModel)]="book.unitCost" name="unitCost"> <span class="input-group-addon">$</span> </div> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Number of pages</label> <div class="col-10"> <input class="form-control" type="number" [(ngModel)]="book.nbOfPages" name="nbOfPages"> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Image URL</label> <div class="col-10"> <input class="form-control" type="url" [(ngModel)]="book.imageURL" name="imageURL"> </div> </div> <div class="form-group row"> <label class="col-2 col-form-label">Language</label> <div class="col-10"> <select class="form-control" [(ngModel)]="book.language" name="language"> <option value="">Select</option> <option value="0">ENGLISH</option> <option value="1">FRENCH</option> <option value="2">SPANISH</option> <option value="3">PORTUGUESE</option> <option value="4">ITALIAN</option> <option value="5">FINISH</option> <option value="6">GERMAN</option> <option value="7">DUTCH</option> <option value="8">RUSSIAN</option> </select> </div> </div> <button type="submit" class="btn btn-primary">Create</button> <a class="btn btn-secondary" [routerLink]="['/book-list']" role="button">Cancel</a> </form> ``` Change the page `book-form.component.ts` file ``` private book: Book = new Book(); constructor(private router: Router, private route: ActivatedRoute, private bookAPI: BookApi) { } ngOnInit() { this.route.params .map(params => params['bookId']) .switchMap(id => this.bookAPI.getBook(id)) .subscribe(book => this.book = book); } delete() { this.bookAPI.deleteBook(this.book.id).subscribe(); this.router.navigate(['/book-list']); } ```
* To avoid CORS, create the `proxy.conf.json` file ``` { "/": { "target": "http://localhost:8080", "secure": false } } ``` Change the script in `package.json` `ng serve --proxy-config proxy.conf.json`. In the `BookAPI` change the code to `protected basePath = '/bookstore-back/api';`
* To truncate description in `book-list.component` just `yarn add angular2-truncate`, add `TruncatePipe` in `app.module.ts` in the declarations section, and use it `{{book.description | truncate : 600 }}`



