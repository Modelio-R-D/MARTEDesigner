package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f39a8588-9a31-425b-9b50-352d51f08562")
public class HwMedia_Class extends HwCommunicationResource_Class {
    @objid ("e557c9f3-9a47-4bbe-9d05-33b8aadb79a1")
    public HwMedia_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWMEDIA_CLASSIFIER));
    }

    @objid ("e9e19415-0e96-4d45-a02f-4f11427cc4e3")
    public HwMedia_Class(Class element) {
        super(element);
    }

    @objid ("76d5f907-103b-471d-a820-63e12c0cb270")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS, this.element);
    }

    @objid ("8c3aac5a-ffa7-486d-b970-40e157ea5df7")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_CLASSIFIER_HWMEDIA_CLASSIFIER_ARBITERS, value);
    }

}
