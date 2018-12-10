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
* links
** ActionLink
** EventLink
** PageLink

## Annotation
```java
@Property // create getter setter for the tml page
```

## Documentation and examples
### Books
* Tapestry 5 from Alexander Kolesnikov (2008)
### links

* http://jumpstart.doublenegative.com.au/home.html
* https://github.com/hlship/tapestry5-tutorial
* https://baptiste-meurant.developpez.com/tutoriaux/tapestry5-spring-hibernate/ (old example)
* http://tapestry.apache.org/cookbook.html 

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


