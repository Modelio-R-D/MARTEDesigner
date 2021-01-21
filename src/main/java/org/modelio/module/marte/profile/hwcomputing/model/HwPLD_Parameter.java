package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("56d76e74-b922-4344-8391-eddeae2f574d")
public class HwPLD_Parameter extends HwComputingResource_Parameter {
    @objid ("661460cd-6255-4661-aa5f-2ff1e5ee4065")
    public HwPLD_Parameter() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createParameter());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_PARAMETER);
                this.element.setName(MARTEResourceManager.getName("HwPLD_Parameter"));
    }

    @objid ("f5c0d893-2161-4a52-b841-074145a9db88")
    public HwPLD_Parameter(Parameter element) {
        super(element);
    }

    @objid ("2fb156ce-7a24-4779-a515-f2e80517cf1f")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_TECHNOLOGY, this.element);
    }

    @objid ("47067d05-3923-49a7-abc3-03a89918c8d7")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_TECHNOLOGY, value);
    }

    @objid ("afbd50ab-b3aa-4c87-b729-443829586305")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_ORGANIZATION, this.element);
    }

    @objid ("8baa6ae4-13bc-44f5-b7f0-cce512033d4c")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_ORGANIZATION, value);
    }

    @objid ("09af65ea-098d-4874-88d2-7f70cdb31ce8")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBLUTS, this.element);
    }

    @objid ("0e989297-5413-4250-8c73-a125e9a95090")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBLUTS, value);
    }

    @objid ("f4937b6a-0a5f-409f-9ed9-5aa5ab0205f1")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NDLUT_INPUTS, this.element);
    }

    @objid ("b0034299-61a0-43a4-b114-e60f8dc3b88a")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NDLUT_INPUTS, value);
    }

    @objid ("fa4b40e0-f8f6-491a-b980-bdc1916a7a12")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBFLIPFLOPS, this.element);
    }

    @objid ("3826e192-00bc-496c-a7b7-867eb98462a4")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_NBFLIPFLOPS, value);
    }

    @objid ("b90761d6-9f9f-4229-b7dc-fe28f2af16ae")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSRAM, this.element);
    }

    @objid ("fb7af2a0-8b2f-45d9-9f40-a949129bb52e")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSRAM, value);
    }

    @objid ("b13a3282-3363-4604-933d-304a3439d7f3")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSCOMPUTING, this.element);
    }

    @objid ("a29ad917-6d6f-43b7-a14f-831831830954")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_PARAMETER_HWPLD_PARAMETER_BLOCKSCOMPUTING, value);
    }

}
