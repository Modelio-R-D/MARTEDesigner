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

@objid ("eee34372-ec33-4ae6-a916-8e8e053aac4a")
public class SaExecHost_Instance {
    @objid ("f3ca8b0f-ba77-4cd3-a9c2-d52aa08bb37c")
    protected Instance element;

    @objid ("47229e05-646b-4da5-a5a9-4b9627287027")
    public SaExecHost_Instance() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.SAEXECHOST_INSTANCE);
        this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.SAEXECHOST_INSTANCE));
    }

    @objid ("5a004a25-18c8-4736-98c6-43829f7f739c")
    public SaExecHost_Instance(Instance element) {
        this.element = element;
    }

    @objid ("933190cd-4ab6-4e89-a64e-c5c0ef24d850")
    public Instance getElement() {
        return this.element;
    }

    @objid ("77b957f4-221f-4d19-b76c-4d538a03c64e")
    public void setParent(NameSpace parent) {
        this.element.setOwner(parent);
    }

    @objid ("21b9b9da-8fdb-4d83-821b-81cf3e4ac83e")
    public void setParent(TemplateParameter parent) {
        this.element.setOwnerTemplateParameter(parent);
    }

    @objid ("22f543d5-1c69-43f4-b5ab-0faa2715fed5")
    public boolean isisSched() {
        return ModelUtils.hasTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED, this.element);
    }

    @objid ("3b01315d-95ad-4f85-9e49-f775e189e38e")
    public void isisSched(boolean value) {
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISSCHED ,value );
    }

    @objid ("6f34521c-c0ba-47a9-9ac2-d70e9bd13674")
    public String getschSlack() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK, this.element);
    }

    @objid ("7f902276-8a94-4543-894e-b7bb708c2854")
    public void setschSlack(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHSLACK, value);
    }

    @objid ("9a73aca0-16b9-4e6f-85fd-9d8bb7e9dc2b")
    public String getschedUtiliz() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ, this.element);
    }

    @objid ("21000eaf-dc6d-4658-925e-e3913a28f864")
    public void setschedUtiliz(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_SCHEDUTILIZ, value);
    }

    @objid ("35ba5925-a31f-4b85-bc88-2bfbec22f0db")
    public String getISRswitchT() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT, this.element);
    }

    @objid ("00b44fc2-9d08-4dd8-b340-f366f9d0c9f8")
    public void setISRswitchT(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRSWITCHT, value);
    }

    @objid ("bff8e410-4465-4a90-a1af-58150fdd8ea7")
    public String getISRprioRange() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE, this.element);
    }

    @objid ("cac4b61a-953b-4d01-828e-6434e1242da2")
    public void setISRprioRange(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.SAEXECHOST_INSTANCE_SAEXECHOST_INSTANCE_ISRPRIORANGE, value);
    }

}
