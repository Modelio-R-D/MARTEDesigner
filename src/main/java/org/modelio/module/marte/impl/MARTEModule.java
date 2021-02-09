package org.modelio.module.marte.impl;

import java.io.File;
import org.modelio.api.module.AbstractJavaModule;
import org.modelio.api.module.IPeerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.lifecycle.IModuleLifeCycleHandler;
import org.modelio.api.module.mda.IMdaExpert;
import org.modelio.api.module.parameter.IParameterEditionModel;
import org.modelio.api.module.parameter.impl.ParametersEditionModel;
import org.modelio.gproject.ramc.core.model.IModelComponent;
import org.modelio.gproject.ramc.core.packaging.IModelComponentContributor;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

public class MARTEModule extends AbstractJavaModule {
    private MARTEPeerModule peerMdac = null;

    private MARTESession session = null;

    private static MARTEModule instance = null;

    public static MARTEModule getInstance() {
        return instance;
    }

    /**
     * Builds a new module.
     * This constructor must not be called by the user. It is automatically invoked by Modelio when the module is installed, selected or started.
     */
    public MARTEModule(IModuleContext moduleContext) {
        super(moduleContext);
        this.session  = new MARTESession(this);
        this.peerMdac = new MARTEPeerModule(this, moduleContext.getPeerConfiguration());
        this.peerMdac.init();
        instance = this;
    }

    @Override
    public IPeerModule getPeerModule() {
        return this.peerMdac;
    }

    /**
     * Method automatically called just after the creation of the module.
     * The module is automatically instanciated at the beginning of the MDA lifecycle and constructor implementation is not accessible to the module developer.
     * The <code>init</code> method allows the developer to execute the desired initialization.
     */
    @Override
    public void init() {
        super.init();
    }

    @Override
    public IParameterEditionModel getParametersEditionModel() {
        if (this.parameterEditionModel == null) {
            ParametersEditionModel parameters = new ParametersEditionModel(this);
            this.parameterEditionModel = parameters;
        }
        return this.parameterEditionModel;
    }

    @Override
    public String getModuleImagePath() {
        return File.separator + "res" + File.separator + "icons" + File.separator + "marte_icon.png";
    }

    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return new MARTEModelComponentContributor(this);
    }

    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.session;
    }

    @Override
    public IMdaExpert getMdaExpert(final Stereotype st) {
        // Generated code, please do not remove it
        IMdaExpert expert = getGeneratedMdaExpert(st);
        if (expert != null) {
            return expert;
        }// End generated code
        return null;
    }

    /**
     * Generated expert looking for a MDA expert in the generated MDA API.
     * 
     * @param st a stereotype owned by the current module.
     * @return a MDA expert belonging to the MDA API or <code>null</code>.
     */
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
            default: return null;
        }
    }

}
