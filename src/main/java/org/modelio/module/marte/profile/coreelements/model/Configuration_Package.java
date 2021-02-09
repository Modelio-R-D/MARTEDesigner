package org.modelio.module.marte.profile.coreelements.model;

import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class Configuration_Package {
    protected Package element;

    public Configuration_Package() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_PACKAGE);
        this.element.setName(MARTEResourceManager.getName("Configuration_Package"));
    }

    public Configuration_Package(Package element) {
        this.element = element;
    }

    public Package getElement() {
        return this.element;
    }

    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    public String getmode() {
        return  ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_PACKAGE_CONFIGURATION_PACKAGE_MODE, this.element);
    }

    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_PACKAGE_CONFIGURATION_PACKAGE_MODE, value);
    }

}
