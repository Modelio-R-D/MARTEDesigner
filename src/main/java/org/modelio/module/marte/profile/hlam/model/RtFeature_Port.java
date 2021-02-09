package org.modelio.module.marte.profile.hlam.model;

import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class RtFeature_Port {
    protected Port element;

    public RtFeature_Port() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPort();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RTFEATURE_PORT);
        this.element.setName(MARTEResourceManager.getName("RtFeature_Port"));
    }

    public RtFeature_Port(Port element) {
        this.element = element;
    }

    public Port getElement() {
        return this.element;
    }

    public void setParent(Instance parent) {
        this.element.setCluster(parent);
    }

    public void setParent(Classifier parent) {
        this.element.setInternalOwner(parent);
    }

    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
