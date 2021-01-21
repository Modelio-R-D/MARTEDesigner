package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Node;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("45dac01c-1418-4c0f-a561-039aab415f1d")
public class SwResource_Node extends Resource_Node {
    @objid ("78c59d02-df50-4595-a959-8c6f4a59999e")
    public SwResource_Node() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createNode());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SWRESOURCE_CLASSIFIER));
    }

    @objid ("1e4e4bfe-122d-48ca-a0e2-e3b6b13c56fd")
    public SwResource_Node(Node element) {
        super(element);
    }

    @objid ("64de8a5d-efe9-43f3-8f32-6708ff8a1321")
    public String getidentifierElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS, this.element);
    }

    @objid ("9402ce01-629b-4758-9ac6-1dd944d20bc9")
    public void setidentifierElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_IDENTIFIERELEMENTS, value);
    }

    @objid ("048c08d2-247f-4704-9de2-afaaffb45e36")
    public String getstateElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_STATEELEMENTS, this.element);
    }

    @objid ("8ccee357-e575-4a67-b1a0-5f4caa3d62b0")
    public void setstateElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_STATEELEMENTS, value);
    }

    @objid ("01774602-10d4-45f6-a2b6-ed18a0be0a94")
    public String getmemorySizeFootprint() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT, this.element);
    }

    @objid ("43227905-3a06-4fa9-9373-2b1cee9c74e8")
    public void setmemorySizeFootprint(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_MEMORYSIZEFOOTPRINT, value);
    }

    @objid ("2b9115c9-22d1-4bd2-affa-a2197027e475")
    public String getcreateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_CREATESERVICES, this.element);
    }

    @objid ("ee8c0feb-fd02-45d1-b605-c0b39ab265ce")
    public void setcreateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_CREATESERVICES, value);
    }

    @objid ("9e6e0b72-6f43-4488-b0ff-39f36515caa8")
    public String getdeleteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_DELETESERVICES, this.element);
    }

    @objid ("2502f524-cdd8-498a-9792-00d3997c57af")
    public void setdeleteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_DELETESERVICES, value);
    }

    @objid ("09fa5eb7-d64f-4000-bbce-25ea7800fdc7")
    public String getinitializeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_INITIALIZESERVICES, this.element);
    }

    @objid ("66eca1af-606c-4bc1-b637-0603058b1719")
    public void setinitializeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_CLASSIFIER_SWRESOURCE_CLASSIFIER_INITIALIZESERVICES, value);
    }

}
