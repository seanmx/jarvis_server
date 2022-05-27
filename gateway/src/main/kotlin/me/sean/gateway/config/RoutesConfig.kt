package me.sean.gateway.config

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.routes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * Created by Sean on 2022/5/27.
 *
 * routes
 */
@Configuration
open class RoutesConfig {
    @Bean
    open fun routes(routeLocatorBuilder: RouteLocatorBuilder) = routeLocatorBuilder.routes {
        route {
            path("/room/**")
            uri("lb://manager-room")
        }
        route{
            path("/light/**")
            uri("lb://manager-light")
        }
        build()
    }
}