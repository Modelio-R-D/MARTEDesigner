package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("da755490-774d-408e-9d00-e054a2ad5a70")
public class MutualExclusionResource_AssociationEnd extends Resource_AssociationEnd {
    @objid ("d93ff6ab-1b19-4b0b-acc0-6a6830dee737")
    public MutualExclusionResource_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_AssociationEnd"));
    }

    @objid ("611338a6-b823-4755-9690-b88a6c4037ba")
    public MutualExclusionResource_AssociationEnd(final AssociationEnd element) {
        super(element);
    }

    @objid ("5527b96d-fd46-40bc-a7c6-c1b71a9ae3c9")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND, this.element);
    }

    @objid ("6d54076b-3b1b-4fa8-a34a-afafd7aa8580")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_PROTECTKIND, value);
    }

    @objid ("8a44d52a-a88c-44a2-a49c-c3f7a805d1d2")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING, this.element);
    }

    @objid ("90fc3fa5-fdf6-4888-afb0-01b1f628bb8b")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_CEILING, value);
    }

    @objid ("828f8ddb-d8c6-48c1-86ff-e4135f9982cc")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("71ed3b47-37ce-4aca-9d91-c757b6173c3d")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("d29da36c-52da-46ff-a7a5-952d7ed9c246")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER, this.element);
    }

    @objid ("7887972f-841c-4ddc-ad1f-922419d997f5")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_MUTUALEXCLUSIONRESOURCE_ASSOCIATIONEND_SCHEDULER, value);
    }

}
