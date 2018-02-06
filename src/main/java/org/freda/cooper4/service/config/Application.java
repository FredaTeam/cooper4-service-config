package org.freda.cooper4.service.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * App.
 */
@SpringBootApplication
@EnableConfigServer
public class Application
{
    /**
     * Boot Run Method.
     *
     * @param args args.
     */
    public static void main(String[] args)
    {
        SpringApplication springApplication = new SpringApplication(Application.class);

        springApplication.addListeners(new ApplicationPidFileWriter());

        springApplication.run(args);
    }
}
