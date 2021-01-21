package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("866e9edd-df21-4f49-88a3-b8ba0629562d")
public class HwPLD_Lifeline extends HwComputingResource_Lifeline {
    @objid ("ba47f5c1-1b70-4845-a567-0609439a3840")
    public HwPLD_Lifeline() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLifeline());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_LIFELINE);
                this.element.setName(MARTEResourceManager.getName("HwPLD_Lifeline"));
    }

    @objid ("c3441421-08e7-4d95-b30b-aa7b96c35c76")
    public HwPLD_Lifeline(Lifeline element) {
        super(element);
    }

    @objid ("7b0ff2b6-44b8-4c96-8ab1-6b4c4f4624bd")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_TECHNOLOGY, this.element);
    }

    @objid ("67333db5-d3f5-4a88-a832-c63d1bac872b")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_TECHNOLOGY, value);
    }

    @objid ("5734d243-b991-4386-a7b6-1dd2399862e3")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_ORGANIZATION, this.element);
    }

    @objid ("7e168c52-bce9-4ff9-bc53-75a1f3a65882")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_ORGANIZATION, value);
    }

    @objid ("270db0ec-5f25-4f1d-ab8f-24e508527fb9")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBLUTS, this.element);
    }

    @objid ("e5cbd5cb-d650-4f1c-b763-7d7de9418b81")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBLUTS, value);
    }

    @objid ("41c92f55-7972-473a-b347-4cfcdb0abfe9")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NDLUT_INPUTS, this.element);
    }

    @objid ("5cbf9107-d849-4922-9839-a7c53ef19d0e")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NDLUT_INPUTS, value);
    }

    @objid ("1607d4ee-9f75-46ba-aac1-a771c7b76e58")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBFLIPFLOPS, this.element);
    }

    @objid ("7553927f-f462-4120-a2b5-12d43a577375")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_NBFLIPFLOPS, value);
    }

    @objid ("e0e2402b-837b-404a-8ebb-45b972d26329")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSRAM, this.element);
    }

    @objid ("eb10bf7d-caea-4acd-82d6-67ff8248aa96")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSRAM, value);
    }

    @objid ("b825071b-43fd-47ae-be98-49f255a205c9")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSCOMPUTING, this.element);
    }

    @objid ("bf7e471c-5671-4e2e-bb15-48caef4da400")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LIFELINE_HWPLD_LIFELINE_BLOCKSCOMPUTING, value);
    }

}
