package org.modelio.module.marte.profile.grm.model;

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

@objid ("7e56dde7-1dd2-499e-8bd0-f52e57a06c0c")
public class GrService_Collaboration {
    @objid ("17cdf468-cafc-4101-a994-e4257de1aad7")
    protected Collaboration element;

    @objid ("b053c891-bb49-4c9c-bb69-36ad4404994e")
    public GrService_Collaboration() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createCollaboration();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.GRSERVICE_COLLABORATION);
        this.element.setName(MARTEResourceManager.getName("GrService_Collaboration"));
    }

    @objid ("cee3c09d-4b3e-403f-87b6-d0ec429b20c0")
    public GrService_Collaboration(final Collaboration element) {
        this.element = element;
    }

    @objid ("ffe06ff7-792c-46f2-840a-71b4568cd4fc")
    public void setParent(Behavior source) {
        this.element.setBRepresented(source);
    }

    @objid ("5ed114a9-e1bc-4399-a155-0a196ede70a7")
    public Collaboration getElement() {
        return this.element;
    }

    @objid ("cabf8955-10fe-47bf-bf4b-f7c5425e4cad")
    public String getowner() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, this.element);
    }

    @objid ("1250a939-2a7a-4bf7-b26c-2a1422a3f675")
    public void setowner(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.GRSERVICE_COLLABORATION_GRSERVICE_COLLABORATION_OWNER, value);
    }

    @objid ("51bd713f-5e94-4c33-8ec5-d50c9aede49e")
    public void setParent(Operation source) {
        this.element.setORepresented(source);
    }

    @objid ("f87782b5-42e9-415e-a7e8-288206f87085")
    public void setParent(ModelTree source) {
        this.element.setOwner(source);
    }

    @objid ("1a205c13-2f52-4343-8926-b72f21e034fc")
    public void setParent(TemplateParameter param) {
        this.element.setOwnerTemplateParameter(param);
    }

}
