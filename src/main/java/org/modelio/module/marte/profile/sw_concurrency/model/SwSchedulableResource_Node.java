package org.modelio.module.marte.profile.sw_concurrency.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ee75c2e2-70ca-4522-a521-e89ec3bab21b")
public class SwSchedulableResource_Node extends SwConcurrentResource_Node {
    @objid ("64ff9750-8258-4ae9-9570-0ef991a1aab8")
    public SwSchedulableResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWSCHEDULABLERESOURCE_CLASSIFIER));
    }

    @objid ("ea0a122c-b55f-4b78-9fa3-f6b638a48a64")
    public SwSchedulableResource_Node(Node element) {
        super(element);
    }

    @objid ("21059776-40f4-4667-be58-83f1ebc1fbbc")
    public boolean isisStaticSchedulingFeature() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE, this.element);
    }

    @objid ("70f05423-131e-475d-a5f3-a9daf2c014a9")
    public void isisStaticSchedulingFeature(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISSTATICSCHEDULINGFEATURE,value);
    }

    @objid ("ef8ba0bf-406f-49ed-968f-eff78a33565f")
    public boolean isisPreemptable() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE, this.element);
    }

    @objid ("8f20d824-348d-43f5-83b5-aec61dbf0ae8")
    public void isisPreemptable(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_ISPREEMPTABLE,value);
    }

    @objid ("408bd344-b653-494b-88a0-e75d59c11d31")
    public String getschedulers() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS, this.element);
    }

    @objid ("82df842d-90bf-40e7-a166-49d785a2079e")
    public void setschedulers(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDULERS, value);
    }

    @objid ("be55458e-7fa2-4a13-b26a-46b6ce132af9")
    public String getdeadlineElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS, this.element);
    }

    @objid ("ee0970e9-e0c4-4903-ad2b-a67b34ba6f0b")
    public void setdeadlineElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINEELEMENTS, value);
    }

    @objid ("8a3c9716-9ad5-4eb5-a4f2-fd5710173af7")
    public String getdeadlineTypeElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS, this.element);
    }

    @objid ("e4d10bb6-57a1-468c-9a10-58fa08e9b37f")
    public void setdeadlineTypeElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEADLINETYPEELEMENTS, value);
    }

    @objid ("aebc26f7-27e3-42b5-95f9-17515deabf3a")
    public String gettimeSliceElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS, this.element);
    }

    @objid ("85265a98-4329-4ada-9042-ff6533afc6a9")
    public void settimeSliceElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_TIMESLICEELEMENTS, value);
    }

    @objid ("cc73feef-6ca4-4758-a3f9-c19b337b2125")
    public String getdelayServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES, this.element);
    }

    @objid ("5ac42d2e-d469-4155-85da-a351e4916406")
    public void setdelayServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DELAYSERVICES, value);
    }

    @objid ("37e95ee2-29b1-4e55-8c8c-32ad308785e6")
    public String getjoinServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES, this.element);
    }

    @objid ("0034c135-b4fb-4e68-b019-938b0a369f18")
    public void setjoinServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_JOINSERVICES, value);
    }

    @objid ("d947d774-0f1d-491b-a3d7-f138a4e6f702")
    public String getyieldServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES, this.element);
    }

    @objid ("e8fdf133-f82a-4b8e-8ff7-ad92c4e215c6")
    public void setyieldServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_YIELDSERVICES, value);
    }

    @objid ("97ee830b-6bb9-4bce-a82c-3b5076fc139e")
    public List<String> getschedParams() {
        return ModelUtils.getTaggedValues(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, this.element);
    }

    @objid ("20dbd4c8-0127-4c1e-9df2-3f7a5d2f096f")
    public void addschedParams(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_SCHEDPARAMS, value);
    }

    @objid ("b7d18df8-fe87-4480-a545-9e62d5bdb7f1")
    public String gethost() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_HOST, this.element);
    }

    @objid ("6e5eeafd-59c2-490b-8a9d-c8f0f11f95d1")
    public void sethost(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_HOST, value);
    }

    @objid ("c927dbf1-0ee5-42d0-a913-36cc7cc43d74")
    public String getdependentScheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER, this.element);
    }

    @objid ("beff1ee2-9da3-4d6a-8038-3cfa713f90aa")
    public void setdependentScheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWSCHEDULABLERESOURCE_CLASSIFIER_SWSCHEDULABLERESOURCE_CLASSIFIER_DEPENDENTSCHEDULER, value);
    }

}
