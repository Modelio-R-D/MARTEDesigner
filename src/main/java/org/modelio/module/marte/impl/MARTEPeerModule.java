package org.modelio.module.marte.impl;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.configuration.IModuleAPIConfiguration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.vbasic.version.Version;

@objid ("5b2e6669-d210-425d-8ae0-c0e8a4e1ef5d")
public class MARTEPeerModule implements IMARTEDesignerPeerModule{
    @objid ("abc1d307-b35a-4b66-965a-e7dcaabbe9c8")
    private IModuleAPIConfiguration peerConfiguration;

    @objid ("928cdfea-6343-4891-ad21-aa064327bc30")
    private MARTEModule module = null;

    @objid ("ba418665-4873-4cb0-a081-d469fb11e720")
    public MARTEPeerModule(MARTEModule module, IModuleAPIConfiguration peerConfiguration) {
        this.module = module;
        this.peerConfiguration = peerConfiguration;
    }

    @objid ("387cc675-5dbb-4476-9e7a-067d48fabede")
    @Override
    public IModuleAPIConfiguration getConfiguration() {
        return this.peerConfiguration;
    }

    @objid ("5b31027f-d72b-4c13-9bdb-bbc4e6458b74")
    @Override
    public String getDescription() {
        return this.module.getDescription();
    }

    @objid ("cd3eb0e7-7fcb-4d66-9791-0d7408db622f")
    public String getLabel() {
        return this.module.getName();
    }

    @objid ("8bcc4408-5b97-46f4-845c-86bba353225d")
    @Override
    public Version getVersion() {
        return this.module.getVersion();
    }

    @objid ("9dc16ff0-3164-4010-b29f-9606d1d992f3")
    void init() {
    }

    @objid ("7e6f703e-98f5-4b36-9a8f-6c0f07a228f3")
    @Override
    public String getName() {
        return this.module.getName();
    }

}
