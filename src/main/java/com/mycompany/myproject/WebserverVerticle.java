package com.mycompany.myproject;

import org.vertx.java.core.eventbus.EventBus;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.logging.Logger;

import java.util.regex.Pattern;

/**
 * Created by phil on 6/8/14.
 *
 * Using http://www.hascode.com/2013/11/creating-a-websocket-chat-application-with-vert-x-and-java/
 *
 */
public class WebserverVerticle extends Verticle {

    @Override
    public void start() {
        final Pattern chatUrlPattern = Pattern.compile("/chat/(¥¥w+)");
        final EventBus eventBus = vertx.eventBus();
        final Logger logger = container.logger();

        // http server

        // websockets chat server


    }
}
