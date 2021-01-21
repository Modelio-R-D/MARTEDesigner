package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("924cbd5e-dcaf-4b09-80f1-7f27b6963a02")
public class ConcurrencyResource_Association {
    @objid ("b35cdeac-8d3a-430e-91b7-250f8e3267de")
    protected Association element;

    @objid ("060f2ff1-8c09-4ac9-94c5-66087d3291d2")
    public ConcurrencyResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.CONCURRENCYRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("ConcurrencyResource_Association"));
    }

    @objid ("3e9219b7-ead1-4000-8123-24d56b3282a7")
    public ConcurrencyResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("8947a4a9-d1d1-49e3-b7c0-7e602e0bffe1")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("1380534e-e5ad-46cb-bfea-0ee9ad7fd2da")
    public Association getElement() {
        return this.element;
    }

}
