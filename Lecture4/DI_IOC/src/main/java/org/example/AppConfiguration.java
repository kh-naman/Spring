package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "org.example",
        "org.notification"
})
public class AppConfiguration {

}
