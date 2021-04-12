## Welcome to my Github Page

```markdown
@SpringBootApplication
public class SpringBootBookManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBookManagementApplication.class, args);
        System.out.println("Server has started...");

    }

    @Bean
    public BookInjector addBook() {
        return new BookInjector();
    }

}
```
