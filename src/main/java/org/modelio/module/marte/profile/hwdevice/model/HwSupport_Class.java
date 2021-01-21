package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("2bae2f10-8715-4176-95c1-9ead6116ba93")
public class HwSupport_Class {
    @objid ("8c1368ea-31f0-48a0-a645-08fa33581e12")
    protected Class element;

    @objid ("5fc45cf9-a363-48bf-b00a-414c5e639142")
    public HwSupport_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWSUPPORT_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWSUPPORT_CLASSIFIER));
    }

    @objid ("a200ff61-4dcf-46fd-bf37-2ccbc79b629d")
    public HwSupport_Class(Class element) {
        this.element = element;
    }

    @objid ("c3a71cb1-f168-4a9c-bc63-cc783e6119e1")
    public Class getElement() {
        return this.element;
    }

    @objid ("b6fd1704-4c19-43b2-8870-cc7c3d2b495e")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("85746404-2caa-4477-9e1a-9174f86a4643")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
