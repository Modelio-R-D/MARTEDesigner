package org.modelio.module.marte.profile.hwdevice.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ba96685e-d7f2-4d5d-9fdf-f8b0b59c42d8")
public class HwI_O_Class {
    @objid ("31f5a583-569d-4823-8454-eff1813b6370")
    protected Class element;

    @objid ("4ac6caed-4a9c-4eed-90e2-2110538facb0")
    public HwI_O_Class() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWI_O_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWI_O_CLASSIFIER));
    }

    @objid ("1ddc39b2-75c0-4bcc-93e7-273d98c6591f")
    public HwI_O_Class(Class element) {
        this.element = element;
    }

    @objid ("512625b7-eba0-4db8-bd59-d57d74352b82")
    public Class getElement() {
        return this.element;
    }

    @objid ("407303af-f877-40fd-aea9-8b1b32d36748")
    public void setParent(ModelTree parent) {
        this.element.setOwner(parent);
    }

    @objid ("716410cf-d27f-4648-91e4-b73921f58cf1")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

}
