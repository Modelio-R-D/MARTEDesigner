package org.modelio.module.marte.profile.sw_resourcecore.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.grm.model.Resource_Instance;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("23e8e287-488f-4541-9890-0f576d672990")
public class SwResource_Instance extends Resource_Instance {
    @objid ("6958b61b-8d35-473a-8427-c78a716045df")
    public SwResource_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SWRESOURCE_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("SwResource_Instance"));
    }

    @objid ("48f12875-0952-47eb-9e8a-87eadaef8538")
    public SwResource_Instance(Instance element) {
        super(element);
    }

    @objid ("368de7a8-e9a4-49d2-8679-121c73b56b68")
    public String getidentifierElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS, this.element);
    }

    @objid ("9cc9d0f7-9366-4a56-ab32-895ac05df4eb")
    public void setidentifierElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_IDENTIFIERELEMENTS, value);
    }

    @objid ("33ee3e04-285c-4d61-8580-de10e1d70dda")
    public String getstateElements() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_STATEELEMENTS, this.element);
    }

    @objid ("0275286c-b499-41da-9f7c-d3824f127c4b")
    public void setstateElements(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_STATEELEMENTS, value);
    }

    @objid ("14b30d1e-25ad-4fc7-8da6-8fa548e04d1f")
    public String getmemorySizeFootprint() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT, this.element);
    }

    @objid ("17fd491d-9655-4517-8ef3-5257bf6d041e")
    public void setmemorySizeFootprint(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_MEMORYSIZEFOOTPRINT, value);
    }

    @objid ("7e74450c-2d5a-4d85-b40f-de099c667b5f")
    public String getcreateServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_CREATESERVICES, this.element);
    }

    @objid ("8286b3fe-15ac-4784-b096-fd52e0964db7")
    public void setcreateServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_CREATESERVICES, value);
    }

    @objid ("f9b1d1fd-9afc-43f8-9090-a8be17c2460e")
    public String getdeleteServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_DELETESERVICES, this.element);
    }

    @objid ("8f3fcf45-7f69-429d-ab00-6648a346e5cf")
    public void setdeleteServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_DELETESERVICES, value);
    }

    @objid ("e66051b4-7183-460d-9c24-12b44d30adb1")
    public String getinitializeServices() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_INITIALIZESERVICES, this.element);
    }

    @objid ("395c7cff-f86a-4b69-9775-fa0250799564")
    public void setinitializeServices(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SWRESOURCE_INSTANCE_SWRESOURCE_INSTANCE_INITIALIZESERVICES, value);
    }

}
