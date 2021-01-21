package org.modelio.module.marte.profile.sw_interaction.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("dafac37d-fddb-44e7-bf99-6c185075485b")
public class SharedDataComResource_Class extends SwCommunicationResource_Class {
    @objid ("d525b5a7-4cc8-492e-89ec-18cbac144e54")
    public SharedDataComResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SHAREDDATACOMRESOURCE_CLASSIFIER));
    }

    @objid ("0e53a16d-f7f9-47aa-85b8-7ac21947e984")
    public SharedDataComResource_Class(Class element) {
        super(element);
    }

    @objid ("a5ab2dd1-c4b8-4af4-a94b-4618bd1e4084")
    public String getreadServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, this.element);
    }

    @objid ("4b16218a-0af6-424f-8852-95ecb6b92d78")
    public void setreadServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_READSERVICES, value);
    }

    @objid ("0872e4de-f2ec-428d-ab6a-f555cd216098")
    public String getwriteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, this.element);
    }

    @objid ("6ade80f7-9166-4213-9489-999abf5ad062")
    public void setwriteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SHAREDDATACOMRESOURCE_CLASSIFIER_SHAREDDATACOMRESOURCE_CLASSIFIER_WRITESERVICES, value);
    }

}
