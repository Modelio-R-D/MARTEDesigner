package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("51ca45d2-6b29-4dfd-b02c-a37d768177f4")
public class HwPLD_Instance extends HwComputingResource_Instance {
    @objid ("95d3a250-44aa-4311-9047-60c1b648de3c")
    public HwPLD_Instance() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createInstance());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_INSTANCE);
                this.element.setName(MARTEResourceManager.getName("HwPLD_Instance"));
    }

    @objid ("24545c29-af88-4b15-837a-f7776e6531a0")
    public HwPLD_Instance(Instance element) {
        super(element);
    }

    @objid ("1e132f4e-a198-4d73-8165-fb390a6c8d94")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY, this.element);
    }

    @objid ("e6164d60-46d4-4e11-a48b-55f34c60066c")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_TECHNOLOGY, value);
    }

    @objid ("56cce775-a98e-45fa-9042-a5c6637ff654")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, this.element);
    }

    @objid ("305d30b9-1c8f-4907-9896-cbbe27b0437f")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_ORGANIZATION, value);
    }

    @objid ("94250fe0-3d49-4cd5-9164-520377b2f7b1")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS, this.element);
    }

    @objid ("fd916ffd-45e7-4ed8-a5c9-812c8dd03e67")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBLUTS, value);
    }

    @objid ("773ea907-3cf9-48d2-8a37-bc414ba84c5d")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, this.element);
    }

    @objid ("f60d4c0f-a541-4a68-aeae-fedb4e429296")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NDLUT_INPUTS, value);
    }

    @objid ("991b7b8b-10b5-450c-8c08-17a48403cfe0")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, this.element);
    }

    @objid ("ee760bea-82b8-4b5c-baa6-edc5471fcac4")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_INSTANCE_HWPLD_INSTANCE_NBFLIPFLOPS, value);
    }

    @objid ("7eb91928-136d-4bdb-aa33-f61676024307")
    public enum PLD_Technology {
        SRAM,
        antifuse,
        flash,
        other,
        undef;
    }

}
