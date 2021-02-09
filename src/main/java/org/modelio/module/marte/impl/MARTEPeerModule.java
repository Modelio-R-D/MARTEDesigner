package org.modelio.module.marte.impl;

import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.vbasic.version.Version;

public class MARTEPeerModule implements IMARTEDesignerPeerModule {
    private IModuleAPIConfiguration peerConfiguration;

    private MARTEModule module = null;

    public MARTEPeerModule(MARTEModule module, IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @Override
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @Override
    public String getDescription() {
        return this.module.getDescription();
    }

    public String getLabel() {
        return this.module.getName();
    }

    @Override
    public Version getVersion() {
        return this.module.getVersion();
    }

    void init() {
    }

    @Override
    public String getName() {
        return this.module.getName();
    }

}
