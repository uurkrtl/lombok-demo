
## Coding: Lombok @Data

Create a new Java project in IntelliJ and use Lombok to create a simple shop entity.

-   Step 1: Add the Lombok dependency to your project and configure IntelliJ to support Lombok.
-   Step 2: Create a simple class "Student" with the following attributes: id, name, address, grade.
-   Step 2.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
-   Step 3: Create a Teacher record with the following attributes: id, name, subject.
-   Step 4: Create a class Course with the following attributes: id, name, teacher, students.
-   Step 4.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
-   Step 5: Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
-   Step 6: In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...).

## Coding: Lombok @Builder & @With

-   Step 1: Add the Builder pattern to all entities and create additional objects with the Builder in the main method.

-   Step 2: Use the With annotation to facilitate changing properties.