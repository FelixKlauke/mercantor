package de.d3adspace.mercantor.server.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.inject.AbstractModule;
import de.d3adspace.mercantor.server.config.MercantorServerConfig;
import de.d3adspace.mercantor.server.resource.MercantorResource;
import de.d3adspace.mercantor.server.service.IServiceManager;
import de.d3adspace.mercantor.server.service.ServiceManagerImpl;
import de.d3adspace.mercantor.shared.io.ServiceBodyReader;
import de.d3adspace.mercantor.shared.io.ServiceBodyWriter;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class MercantorServerModule extends AbstractModule {

    private final MercantorServerConfig mercantorServerConfig;

    public MercantorServerModule(MercantorServerConfig mercantorServerConfig) {
        this.mercantorServerConfig = mercantorServerConfig;
    }

    @Override
    protected void configure() {
        bind(MercantorServerConfig.class).toInstance(mercantorServerConfig);
        bind(Gson.class).toInstance(new GsonBuilder().setPrettyPrinting().create());
        bind(ServiceBodyWriter.class);
        bind(ServiceBodyReader.class);
        bind(MercantorResource.class);
        bind(IServiceManager.class).to(ServiceManagerImpl.class);
    }
}
