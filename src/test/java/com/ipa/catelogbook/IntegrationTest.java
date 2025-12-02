package com.ipa.catelogbook;

import com.ipa.catelogbook.config.AsyncSyncConfiguration;
import com.ipa.catelogbook.config.EmbeddedRedis;
import com.ipa.catelogbook.config.EmbeddedSQL;
import com.ipa.catelogbook.config.JacksonConfiguration;
import com.ipa.catelogbook.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { IpaCatalogBookServiceApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedRedis
@EmbeddedSQL
public @interface IntegrationTest {
}
