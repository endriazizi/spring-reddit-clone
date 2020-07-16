# spring-reddit-clone
Build a Full Stack Reddit Clone with Spring boot

## Creating Domain Entities
Now let’s create domain entities for our Reddit Clone Application. In our application, we have Users, who can create Subreddits and Posts, other users can add Comments on the Posts, and can Vote.

> Note that, we are using Lombok Annotations like @Data, @AllArgsConstructor, and @NoArgsConstructor. These annotations will generate the corresponding Getters/Setters/Equals and HashCode/toString methods and Constructors at compile time. To be able to use these annotations, you have to enable Annotation Processing in your IDE. For more details check this link on how to enable Lombok in your favorite IDE - [Lombok](https://www.baeldung.com/lombok-ide)

## Configure Repositories
So these are our domain entities, all of the fields are pretty self-explanatory. Now let’s create the repositories which are responsible to store these entities in the database. Create the package repository and create below repositories.