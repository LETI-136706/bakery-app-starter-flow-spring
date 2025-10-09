package com.vaadin.starter.bakery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.vaadin.starter.bakery.app.security.SecurityConfiguration;
import com.vaadin.starter.bakery.backend.data.entity.User;
import com.vaadin.starter.bakery.backend.repositories.UserRepository;
import com.vaadin.starter.bakery.backend.service.UserService;
import com.vaadin.starter.bakery.ui.MainView;

/**
 * Main entry point for the Bakery web application.
 * <p>
 * This class bootstraps the Spring Boot application and configures the base
 * packages for component scanning, JPA repositories, and entity scanning. It
 * also serves as the servlet initializer when deployed to a traditional web
 * container.
 * </p>
 *
 * <p>
 * The application integrates Spring Security, Vaadin views, and backend
 * services such as {@link UserService}. The {@link #main(String[])} method is
 * used when running the application in standalone mode.
 * </p>
 *
 * <h2>Responsibilities:</h2>
 * <ul>
 *   <li>Initialize and configure Spring Boot runtime</li>
 *   <li>Register application components and repositories</li>
 *   <li>Provide servlet-based initialization for WAR deployments</li>
 * </ul>
 *
 * @author Álvaro
 * @version 1.0
 * @since 2025
 */
@SpringBootApplication(scanBasePackageClasses = { SecurityConfiguration.class, MainView.class, Application.class,
        UserService.class }, exclude = ErrorMvcAutoConfiguration.class)
@EnableJpaRepositories(basePackageClasses = { UserRepository.class })
@EntityScan(basePackageClasses = { User.class })
public class Application extends SpringBootServletInitializer {

    /**
     * Launches the Bakery web application in standalone mode using an embedded
     * servlet container.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Configures the application when deployed as a traditional WAR file.
     * <p>
     * This method is called by the servlet container and ensures that the same
     * application sources are used as in the standalone execution.
     * </p>
     *
     * @param application the {@link SpringApplicationBuilder} instance used to
     *                    configure the application context
     * @return the configured {@link SpringApplicationBuilder} instance
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
