package org.modelio.module.marte.profile.sw_resourcecore.model;

import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class SwResource_Node extends Resource_Node {
    public SwResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER));
    }

    public SwResource_Node(Node element) {
        super(element);
    }

    public String getidentifierElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS, this.element);
    }

    public void setidentifierElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS, value);
    }

    public String getstateElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_STATEELEMENTS, this.element);
    }

    public void setstateElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_STATEELEMENTS, value);
    }

    public String getmemorySizeFootprint() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT, this.element);
    }

    public void setmemorySizeFootprint(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT, value);
    }

    public String getcreateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_CREATESERVICES, this.element);
    }

    public void setcreateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_CREATESERVICES, value);
    }

    public String getdeleteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_DELETESERVICES, this.element);
    }

    public void setdeleteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_DELETESERVICES, value);
    }

    public String getinitializeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_INITIALIZESERVICES, this.element);
    }

    public void setinitializeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_INITIALIZESERVICES, value);
    }

}
