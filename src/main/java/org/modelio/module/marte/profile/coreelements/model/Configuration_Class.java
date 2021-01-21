package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("213637f8-3e32-4d76-85df-739969b4e3f0")
public class Configuration_Class {
    @objid ("bceac5d1-49b3-472f-b7a0-6f3561643a2f")
    protected Class element;

    @objid ("9f250409-2e2b-4415-a03e-f8533a0fafb7")
    public Configuration_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_CLASS);
        this.element.setName(MARTEResourceManager.getName("Configuration_Class"));
    }

    @objid ("3020d958-e3e6-4533-93bd-07c9ec30ee4f")
    public Configuration_Class(Class element) {
        this.element = element;
    }

    @objid ("c302164f-5d97-4d6e-aa37-d96db8720e37")
    public Class getElement() {
        return this.element;
    }

    @objid ("e7032524-5a79-4e3e-9393-a510be68cb1d")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("de56b475-d71b-4d2f-bda5-b2b30d49264f")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("2e6b1efc-a950-4b9d-9887-0b9dba1e80e6")
    public String getmode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_CLASS_CONFIGURATION_CLASS_MODE, this.element);
    }

    @objid ("38adba7a-1842-44f5-820b-eaf4bc1498e5")
    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_CLASS_CONFIGURATION_CLASS_MODE, value);
    }

}
