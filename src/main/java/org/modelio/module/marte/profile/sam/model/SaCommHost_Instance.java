package org.modelio.module.marte.profile.sam.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("f1ae58a1-d8cf-4f09-aa4a-0360a07c84de")
public class SaCommHost_Instance {
    @objid ("fae7c442-b8e2-44d9-8538-be13c1340040")
    protected Instance element;

    @objid ("5f573393-d0f0-494a-94e9-03c0aa2be0d6")
    public SaCommHost_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SACOMMHOST_INSTANCE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SACOMMHOST_INSTANCE));
    }

    @objid ("2510fba7-46e8-4116-96c6-177086c71eb6")
    public SaCommHost_Instance(Instance element) {
        this.element = element;
    }

    @objid ("6b1e8308-11a3-4af7-bc12-968532e9890c")
    public Instance getElement() {
        return this.element;
    }

    @objid ("98cad005-d517-4cfd-8511-b546cfd62850")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("b75ff8ae-7c14-468c-95c1-c62a74d4ecd1")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("aadc1d10-9a64-4feb-bb83-f0af31fb00e8")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue("SaCommHost_Instance_isSched", this.element);
    }

    @objid ("9270ab22-20de-4295-8a97-03b900c18520")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_ISSCHED , value);
    }

    @objid ("b3d5a7a4-b915-455a-8d08-6ea7a7133f5a")
    public String getschSlack() {
        return ModelUtils.getTaggedValue("SaCommHost_Instance_schSlack", this.element);
    }

    @objid ("e31b1f7f-9ea1-4e22-ae4b-be16ec0e51cc")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SACOMMHOST_INSTANCE_SACOMMHOST_INSTANCE_SCHSLACK, value);
    }

}
