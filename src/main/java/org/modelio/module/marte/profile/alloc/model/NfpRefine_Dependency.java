package org.modelio.module.marte.profile.alloc.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("946d1acb-d3ff-457b-89ac-b7d9f327990a")
public class NfpRefine_Dependency {
    @objid ("384eb9ce-2df4-4e59-9d2e-121c62735620")
    protected Dependency element;

    @objid ("11bf64c0-1192-4dee-9c17-300dc7f218fe")
    public NfpRefine_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NFPREFINE_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("NfpRefine_Dependency"));
    }

    @objid ("fb493717-bfb2-40b9-8631-4fb3711bf6e4")
    public NfpRefine_Dependency(Dependency element) {
        this.element = element;
    }

    @objid ("ac73e5df-7601-410e-85eb-bc3ff9aed2c0")
    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    @objid ("ed91ce16-56de-474f-94eb-9fcc34dd1d06")
    public Dependency getElement() {
        return this.element;
    }

}
