package org.modelio.module.marte.profile.grm.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("4e0c16e0-7a24-4d32-bed1-5d146bb2a941")
public class MutualExclusionResource_Association {
    @objid ("050c1aee-ddc9-4836-b751-86691baf10c0")
    protected Association element;

    @objid ("fc796db9-c0f9-4d1d-aed0-51cbca0dfea8")
    public MutualExclusionResource_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("MutualExclusionResource_Association"));
    }

    @objid ("d7c59baf-2200-4142-bf60-23f3319de2fd")
    public MutualExclusionResource_Association(final Association element) {
        this.element = element;
    }

    @objid ("a32114e1-ed9c-426a-b254-12a7a0cb50c2")
    public void setParent(final AssociationEnd source, final AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("a2b0684c-031e-4146-9bf4-4d8495831a31")
    public Association getElement() {
        return this.element;
    }

    @objid ("96344bed-7cb6-4e15-af8b-46a8c0043f60")
    public String getprotectKind() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND, this.element);
    }

    @objid ("5c86c255-fd75-46e5-8e88-2686c395a314")
    public void setprotectKind(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_PROTECTKIND, value);
    }

    @objid ("a2201813-f61e-4101-b5ec-18be52754caf")
    public String getceiling() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING, this.element);
    }

    @objid ("918d0337-6ccf-4d81-b9fe-39eb603376f4")
    public void setceiling(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_CEILING, value);
    }

    @objid ("a88d3825-7055-4964-a256-fa37049f7607")
    public String getotherProtectProtocol() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL, this.element);
    }

    @objid ("2e1361f2-8614-4ee6-a28e-c9d982094997")
    public void setotherProtectProtocol(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_OTHERPROTECTPROTOCOL, value);
    }

    @objid ("e70c08d0-d08e-4c92-9bb5-2338243a556c")
    public String getscheduler() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER, this.element);
    }

    @objid ("9eab3123-767e-419e-80a6-0617c8230811")
    public void setscheduler(final String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.MUTUALEXCLUSIONRESOURCE_ASSOCIATION_MUTUALEXCLUSIONRESOURCE_ASSOCIATION_SCHEDULER, value);
    }

}
