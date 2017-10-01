/*
 * Copyright (c) 2017 Felix Klauke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.d3adspace.mercantor.core;

import de.d3adspace.mercantor.core.config.MercantorConfig;
import de.d3adspace.mercantor.core.config.MercantorConfigBuilder;

import java.util.concurrent.TimeUnit;

/**
 * The factory to create new mercantor instances.
 *
 * @author Felix 'SasukeKawaii' Klauke
 */
public class MercantorFactory {

    /**
     * Create a new mercantor instance by a default config.
     *
     * @return The mercantor instance.
     */
    public static IMercantor createMercantor() {
        return createMercantor(new MercantorConfigBuilder()
                .setHost("localhost")
                .setPort(8080)
                .setServiceExpiration(30)
                .setServiceExpirationTimeUnit(TimeUnit.SECONDS)
                .setServiceExpirationCheckInterval(1)
                .setServiceExpirationCheckIntervalTimeUnit(TimeUnit.SECONDS)
                .createMercantorConfig());
    }

    /**
     * Create a new mercantor instance by the given config.
     *
     * @param config The config.
     * @return The mercantor instance.
     */
    public static IMercantor createMercantor(MercantorConfig config) {
        return new MercantorImpl(config);
    }
}
