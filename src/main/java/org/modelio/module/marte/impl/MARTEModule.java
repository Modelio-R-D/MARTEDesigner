package org.modelio.module.marte.impl;

import java.io.File;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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

@objid ("79f04ac2-575f-4867-aeea-f91227888504")
public class MARTEModule extends AbstractJavaModule {
    @objid ("569d0b93-6840-4fcd-8fef-637af7dfa722")
    private MARTEPeerModule peerMdac = null;

    @objid ("e90ad66a-51bc-4c6b-8f14-ed186fc8f565")
    private MARTESession session = null;

    @objid ("1431320c-afe7-43a3-89d8-acc5f22447ec")
    private static MARTEModule instance = null;

    @objid ("a524473f-677e-42a4-b89a-8c391532bb19")
    public static MARTEModule getInstance() {
        return instance;
    }

    /**
     * Builds a new module.
     * This constructor must not be called by the user. It is automatically invoked by Modelio when the module is installed, selected or started.
     */
    @objid ("5b0e9b75-0af1-45a3-a658-c1f00b0edf3e")
    public MARTEModule(IModuleContext moduleContext) {
        super(moduleContext);
        this.session  = new MARTESession(this);
        this.peerMdac = new MARTEPeerModule(this, moduleContext.getPeerConfiguration());
        this.peerMdac.init();
        instance = this;
    }

    @objid ("6cdee726-01fd-44a8-8e30-f34e3f105540")
    @Override
    public IPeerModule getPeerModule() {
        return this.peerMdac;
    }

    /**
     * Method automatically called just after the creation of the module.
     * The module is automatically instanciated at the beginning of the MDA lifecycle and constructor implementation is not accessible to the module developer.
     * The <code>init</code> method allows the developer to execute the desired initialization.
     */
    @objid ("e0d8e712-e87b-4617-b1d7-7537c927cd2e")
    @Override
    public void init() {
        super.init();
    }

    @objid ("e2602588-9ffd-43d0-a3d4-4c7d2f1b4d48")
    @Override
    public IParameterEditionModel getParametersEditionModel() {
        if (this.parameterEditionModel == null) {
            ParametersEditionModel parameters = new ParametersEditionModel(this);
            this.parameterEditionModel = parameters;
        }
        return this.parameterEditionModel;
    }

    @objid ("6d7b854f-f3f2-48e4-b7f8-44febd17b7d7")
    @Override
    public String getModuleImagePath() {
        return File.separator + "res" + File.separator + "icons" + File.separator + "marte_icon.png";
    }

    @objid ("a5fd0101-b853-47f5-9f15-7e2d3c0364fa")
    @Override
    public IModelComponentContributor getModelComponentContributor(IModelComponent mc) {
        return new MARTEModelComponentContributor(this);
    }

    @objid ("e628403a-b495-408c-9c2f-4ffaa30ad818")
    @Override
    public IModuleLifeCycleHandler getLifeCycleHandler() {
        return this.session;
    }

    @objid ("f6cd92ca-ee35-4bf0-bd20-2126404d3776")
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
    @objid ("7165e784-1982-4999-9d54-7a2f3bf30ff0")
    private IMdaExpert getGeneratedMdaExpert(final Stereotype st) {
        switch (st.getUuid()) {
        	default: return null;
        }
    }

}
