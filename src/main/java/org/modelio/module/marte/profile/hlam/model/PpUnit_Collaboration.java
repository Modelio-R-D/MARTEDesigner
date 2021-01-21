package org.modelio.module.marte.profile.hlam.model;

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

@objid ("245a006b-b85d-4905-ac8a-78a8436a9bd3")
public class PpUnit_Collaboration {
    @objid ("3035f463-7d6e-4afc-ade0-a958a46da756")
    protected Collaboration element;

    @objid ("965d3737-ad14-4d1e-9be2-bda070520aa4")
    public PpUnit_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.PPUNIT_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("PpUnit_Collaboration"));
    }

    @objid ("f51c9b4d-5143-4ee4-8a75-75af9bc6b50a")
    public PpUnit_Collaboration(Collaboration element) {
        this.element = element;
    }

    @objid ("0ea7e6a8-14c4-4c0a-8e60-c65bf6004e3f")
    public void setParent(final Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("a2e610f2-2466-4212-b85b-73e54ab26cb6")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("bbb10a51-6e01-4db9-8e0a-50dc931d7361")
    public String getconcPolicy() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY, this.element);
    }

    @objid ("88b0798a-8d58-4b75-8c7f-4a682675dca1")
    public void setconcPolicy(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_CONCPOLICY, value);
    }

    @objid ("61d589d8-9754-481b-87b6-57f2185a1726")
    public String getmemorySize() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE, this.element);
    }

    @objid ("4bc3d06d-5faf-46e9-8aa3-0f5d656c2595")
    public void setmemorySize(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PPUNIT_COLLABORATION_PPUNIT_COLLABORATION_MEMORYSIZE, value);
    }

    @objid ("3a0ba893-8130-4f71-bb18-e416bc1d7834")
    public void setParent(final Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("37e9a090-0497-4839-8afd-f274b6d13565")
    public void setParent(final ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("cadab652-b261-47c7-911c-23669670ecc4")
    public void setParent(final TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
