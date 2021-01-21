package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("3c481a40-cf48-458b-9552-8ebe357e01c6")
public class Configuration_Package {
    @objid ("ccf70c8b-44ff-4e46-b75e-39de10862668")
    protected Package element;

    @objid ("d90c7ef8-5497-453c-873d-f4ae02f0846e")
    public Configuration_Package() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createPackage();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_PACKAGE);
        this.element.setName(MARTEResourceManager.getName("Configuration_Package"));
    }

    @objid ("3f17ac37-f361-4704-98ec-c1476c0856b1")
    public Configuration_Package(Package element) {
        this.element = element;
    }

    @objid ("7157ec18-87ba-48e2-b0c3-83a66b744475")
    public Package getElement() {
        return this.element;
    }

    @objid ("514c6e8a-1366-42ac-95b6-115a65951d7d")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("575fca38-0ca6-42a6-bf3d-10b01f7dac34")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("72828370-f5ae-459d-b286-9144ba249788")
    public String getmode() {
        return  ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_PACKAGE_CONFIGURATION_PACKAGE_MODE, this.element);
    }

    @objid ("7820177c-b6c2-4756-a40f-a9875e0cd092")
    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_PACKAGE_CONFIGURATION_PACKAGE_MODE, value);
    }

}
