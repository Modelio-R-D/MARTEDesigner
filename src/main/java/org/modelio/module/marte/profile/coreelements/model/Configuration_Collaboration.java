package org.modelio.module.marte.profile.coreelements.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("ab308a77-9e38-4a4a-a801-36d357d2a82a")
public class Configuration_Collaboration {
    @objid ("113b38b2-8b41-4603-87e2-f0d07528ee21")
    protected Collaboration element;

    @objid ("6ea0e4bb-1991-4118-9ae4-0b599c033a27")
    public Configuration_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONFIGURATION_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("Configuration_Collaboration"));
    }

    @objid ("c69e1674-0a10-4528-8384-a38426d4d4d3")
    public Configuration_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("239f4a10-99fb-4c6b-9e3a-efcf72ca1923")
    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("1cdbb60e-c679-45ef-b285-89da49942d5f")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("962c71c3-b2f2-4b79-934e-b220b9bb6581")
    public String getmode() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.CONFIGURATION_COLLABORATION_CONFIGURATION_COLLABORATION_MODE, this.element);
    }

    @objid ("22b224aa-08f6-4ba2-a2df-4e59d31eab37")
    public void setmode(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.CONFIGURATION_COLLABORATION_CONFIGURATION_COLLABORATION_MODE, value);
    }

    @objid ("c78dca32-9726-488c-83e8-09923376eb69")
    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("eea0ea69-e023-462d-b0ed-457d10b9e988")
    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

    @objid ("ee07f19d-c94a-4f1e-abf4-84e662f4e7dc")
    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

}
