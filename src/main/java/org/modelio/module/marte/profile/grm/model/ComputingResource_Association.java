package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("932ed3fc-e017-43c0-93cd-202927dcd7dc")
public class ComputingResource_Association {
    @objid ("ec873daf-4616-45ec-a026-9be694313ca2")
    protected Association element;

    @objid ("9c096d4f-48cb-4b36-8798-759b640463d6")
    public ComputingResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.COMPUTINGRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("ComputingResource_Association"));
    }

    @objid ("c11ed3cb-6085-4c50-a402-3de163e15d0b")
    public ComputingResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("cd792db2-6701-4972-83b9-6d1c0e710376")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("dd486f5a-dc7f-4f0c-9d3f-96e718676ae4")
    public Association getElement() {
        return this.element;
    }

}
