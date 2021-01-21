package org.modelio.module.marte.profile.sw_resourcecore.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Class;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("a0a96ba0-7c12-4cfd-8a9f-251e510c022f")
public class SwResource_Class extends Resource_Class {
    @objid ("7fba5b37-5bd8-499d-9e6b-17a4f7910efa")
    public SwResource_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER));
    }

    @objid ("ebd6dca2-77c0-4450-9147-9f3c4ac42bd2")
    public SwResource_Class(Class element) {
        super(element);
    }

    @objid ("dcbeaa5c-96f8-446c-905e-5874d2e26847")
    public String getidentifierElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS, this.element);
    }

    @objid ("504f32f4-99a6-40b3-abc2-1e9358dd804a")
    public void setidentifierElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS, value);
    }

    @objid ("eb54fe03-4264-4624-ad20-dd85120954de")
    public List<Element> getstateElements() {
        return ModelUtils.getTargetElements(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_STATEELEMENTS_SWRESOURCE);
    }

    @objid ("14788f94-a459-417a-8720-d5211fe9b3fc")
    public void setstateElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_STATEELEMENTS, value);
    }

    @objid ("a1c49af3-b076-4620-8fad-f27a3d6e3413")
    public String getmemorySizeFootprint() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT, this.element);
    }

    @objid ("c48dbb29-772c-4fa6-873b-983cdb3f672e")
    public void setmemorySizeFootprint(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT, value);
    }

    @objid ("76020bf2-6844-44e0-91c7-56024bbba2f0")
    public String getcreateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_CREATESERVICES, this.element);
    }

    @objid ("26cf48b9-3d6d-4248-bc68-38bae039695b")
    public void setcreateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_CREATESERVICES, value);
    }

    @objid ("7649b22d-bf62-4ae7-a58d-9d6401ca6f1c")
    public String getdeleteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_DELETESERVICES, this.element);
    }

    @objid ("270aae58-c3fe-46c0-896b-435dcc718a68")
    public void setdeleteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_DELETESERVICES, value);
    }

    @objid ("c25f54ac-a7a1-4e99-89af-82f09c8c086f")
    public String getinitializeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_INITIALIZESERVICES, this.element);
    }

    @objid ("b1e75997-6a17-4c6d-8f4b-ec114976b41c")
    public void setinitializeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_INITIALIZESERVICES, value);
    }

}
