package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("5b3237c0-ae1b-4b67-8f0e-650863a34f37")
public class Release_Collaboration {
    @objid ("4bddf548-aec5-4331-ace3-6442c7b89508")
    protected Collaboration element;

    @objid ("98e6fb40-478e-4f58-91c5-f799bbd55355")
    public Release_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.RELEASE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("Release_Collaboration"));
    }

    @objid ("57a4a0ad-f30e-4fd1-a9b9-28c9bc9ba027")
    public Release_Collaboration(final Collaboration element) {
        this.element = element;
    }

    @objid ("64a0ca61-e31b-48f2-beea-06d98d9a3dbc")
    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("e6b58732-ed39-4b48-a85c-834bde5060e8")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("a7cad7ea-0206-40f9-9f06-30bb8dd5d0d8")
    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("33a464a5-f72e-48ed-b0b3-ed371ede8c69")
    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("6ad1db66-25dd-478e-9509-7f79cf60520b")
    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
