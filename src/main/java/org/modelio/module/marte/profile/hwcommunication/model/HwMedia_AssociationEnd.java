package org.modelio.module.marte.profile.hwcommunication.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("787ad9f8-478f-40c9-8a62-45866dd6b019")
public class HwMedia_AssociationEnd extends HwCommunicationResource_AssociationEnd {
    @objid ("7473f226-717b-4678-950d-dfc1b5499db0")
    public HwMedia_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWMEDIA_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwMedia_AssociationEnd"));
    }

    @objid ("0e7605e6-1a9f-4fe5-bb73-2c35a23136dc")
    public HwMedia_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    @objid ("8603eb97-4547-4d3a-9da3-3619c0c3d3c6")
    public String getarbiters() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWMEDIA_ASSOCIATIONEND_HWMEDIA_ASSOCIATIONEND_ARBITERS, this.element);
    }

    @objid ("ae7ce3e1-e5bc-4b59-aaf6-fdc617d1e022")
    public void setarbiters(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWMEDIA_ASSOCIATIONEND_HWMEDIA_ASSOCIATIONEND_ARBITERS, value);
    }

}
