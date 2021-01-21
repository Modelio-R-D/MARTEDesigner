package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("c07b44e1-c40f-4ceb-9d3c-af3cd44d1b08")
public class TimingResource_Association {
    @objid ("92c8f0aa-991b-4726-9a5b-817a1de77aa3")
    protected Association element;

    @objid ("b35b4bd7-9f87-4e3e-91d3-0e963e3bb48f")
    public TimingResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.TIMINGRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("TimingResource_Association"));
    }

    @objid ("29466636-9555-4c4e-b034-dbaf89a95a86")
    public TimingResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("c75a76d9-19f4-41f5-be5c-f14438cd0e90")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("5266694e-678f-4001-a53f-b8daca89a314")
    public Association getElement() {
        return this.element;
    }

}
