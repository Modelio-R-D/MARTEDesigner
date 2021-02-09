package org.modelio.module.marte.profile.alloc.model;

import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class NfpRefine_Dependency {
    protected Dependency element;

    public NfpRefine_Dependency() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createDependency();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.NFPREFINE_DEPENDENCY);
        this.element.setName(MARTEResourceManager.getName("NfpRefine_Dependency"));
    }

    public NfpRefine_Dependency(Dependency element) {
        this.element = element;
    }

    public void setParent(ModelElement source, ModelElement destination) {
        this.element.setImpacted(source);
        this.element.setDependsOn(destination);
    }

    public Dependency getElement() {
        return this.element;
    }

}
