# Apache Tapestry by examples
Tapestry is component-based Java web framework.
Here you will found some examples with Tapestry using Maven tool.

## Artifacts in central Maven repository

Last version April 2017
```xml
<!-- https://mvnrepository.com/artifact/org.apache.tapestry/tapestry-core -->
<dependency>
    <groupId>org.apache.tapestry</groupId>
    <artifactId>tapestry-core</artifactId>
    <version>5.4.3</version>
</dependen
```

## Tapestry components
### Page and components
A page or a component is a class associated to a template (tml file in a xml format).

A component must have a class. A component may have a template.

A page may use several components.

A component may use several components.

### Packages orginazation

if your main package is "org.example", the main subpackages use by Tapestry are :
* pages
* components
* services
* mixins

### Links
  * ActionLink
  * EventLink
  * PageLink

## Annotations
```java
@Property // create getter setter for the tml page
```

```java
@InjectPage // inject a page in a component
```

```java
@Persist // put a value in session
```

```java
@OnEvent // intercept an event, can be used for an ActionLink
```

```java
@Parameter // parameter value for a component
```

## Event interception

the method can follow the convention name onEventNameFromComponentId

Example 1 : submit button without t:id
```java
onSuccess
```

Example 2 : actionLink with t:id=delete
```java
onActionFromDelete(int id) 
```

A better solution is to use annotation, it allows us to use a better name for the method related to our business.

Example 1
```java
	@OnEvent(value=EventConstants.SUBMIT, component="formName")
	Object searchUser() {
```

Example 2
```java
	@OnEvent(component="delete")
	Object deleteUser(int id) {
```
### Event and Form
* RenderEvents
** prepareForRender
** prepare
* Submit Events
** prepareForSubmit
** prepare
** validate
** failure or success
** submit


## Return value of method
the return value gives the next page to show

Type    | Description
------- | --------------------------------
void    | stay in the current page
String  | page name
Class   | class of the page
Object  | instance of a page (@InjectPage

## Documentation and examples
### Books
* Tapestry 5 from Alexander Kolesnikov (2008)
### links

* http://jumpstart.doublenegative.com.au/home.html
* https://github.com/hlship/tapestry5-tutorial
* https://baptiste-meurant.developpez.com/tutoriaux/tapestry5-spring-hibernate/ (old example)
* http://tapestry.apache.org/cookbook.html 
* https://www.infoq.com/articles/tapestry5-intro

### Presentation (ppt)

 * http://ruhrjug.de/images/stories/vortrag_013_Igor_Drobiazko/Tapestry5-Ruhrjug.pdf
 * https://fr.slideshare.net/lorrainejug/tapestry-5719172 (in French)

## Deployments
### Embedded servers
#### Jetty
Add the last version of the Jetty maven plugin
```xml
<plugin>
    <groupId>org.eclipse.jetty</groupId>
    <artifactId>jetty-maven-plugin</artifactId>
    <version>9.4.12.v20180830</version>
    <configuration>
        <systemProperties>
            <systemProperty>
                <name>tapestry.execution-mode</name>
                <value>development</value>
            </systemProperty>
        </systemProperties>
    </configuration>
</plugin>
```

start the jetty server with the maven command :
```cmd
Jetty:run
```

#### Tomcat

## Framework around Tapestry5
### JQuery components

http://tapestry5-jquery.com/

### Tynamo (model-driven component)

http://www.tynamo.org/


