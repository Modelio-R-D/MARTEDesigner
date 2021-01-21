package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d237cbfc-e571-4e6c-b779-faa487fe8c97")
public class HwASIC_Link {
    @objid ("22380e8b-709b-478f-80b7-bd6362c9a26b")
    protected Link element;

    @objid ("b8c132d6-5e1c-489c-bf67-aba45db9c560")
    public HwASIC_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWASIC_LINK);
        this.element.setName(MARTEResourceManager.getName("HwASIC_Link"));
    }

    @objid ("fc2b437d-4648-46b0-8f39-00a273ddd1d4")
    public HwASIC_Link(Link element) {
        this.element = element;
    }

    @objid ("8ad66f2d-2c08-4220-bc47-55acbb34bb6b")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("959281b2-f8cc-4828-b229-c6661f129e7a")
    public Link getElement() {
        return this.element;
    }

}
