package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("e3628dcf-6bf6-4f98-9949-ad2c7dd602d8")
public class HwPLD_Association {
    @objid ("1838b5b1-e154-4eff-926f-0d9561fe1a81")
    protected Association element;

    @objid ("104229fe-2bd7-4cd3-ae5a-94341769ca6a")
    public HwPLD_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwPLD_Association"));
    }

    @objid ("0c21a6bc-e83f-477e-bc5b-38a52b9d8dd4")
    public HwPLD_Association(Association element) {
        this.element = element;
    }

    @objid ("0c1da34c-1beb-4f7c-bb68-ca2935e2b566")
    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    @objid ("8ff907d8-d0fb-456b-b72d-964d12dfaea6")
    public Association getElement() {
        return this.element;
    }

    @objid ("464a60a9-967a-4f8f-8c60-8bee04e532f4")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_TECHNOLOGY, this.element);
    }

    @objid ("7c604e42-0ad8-4411-a016-67f94a9df1a9")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_TECHNOLOGY, value);
    }

    @objid ("7b808041-e362-45fa-9b8f-6de7baf7117e")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_ORGANIZATION, this.element);
    }

    @objid ("e5345c27-a9f1-4a52-8e60-55ad71e420d4")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_ORGANIZATION, value);
    }

    @objid ("7ae6a23e-d80c-433b-9dc6-bef37f056a36")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBLUTS, this.element);
    }

    @objid ("e73e9e19-baa9-433c-93e1-0e39cf674e3b")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBLUTS, value);
    }

    @objid ("61308e43-959f-4610-9ad2-861313af73a0")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NDLUT_INPUTS, this.element);
    }

    @objid ("10f33fdd-04a0-4595-a82c-dcc944176331")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NDLUT_INPUTS, value);
    }

    @objid ("bddd8bac-685c-4307-81cc-20c9ad23d7af")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBFLIPFLOPS, this.element);
    }

    @objid ("710461ce-268f-429f-9585-00261e248583")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_NBFLIPFLOPS, value);
    }

    @objid ("50872b7d-6317-4b25-ae90-57f95ea9c119")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSRAM, this.element);
    }

    @objid ("896f7af0-a4dd-4c33-be5f-62e2b5f892a3")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSRAM, value);
    }

    @objid ("f772fe8e-fbcd-43d3-9755-95d887f6ad31")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSCOMPUTING, this.element);
    }

    @objid ("e836fcf1-c81e-4f2c-9c15-7aa527157dd2")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_ASSOCIATION_HWPLD_ASSOCIATION_BLOCKSCOMPUTING, value);
    }

}
