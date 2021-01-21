package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("46a6c7d9-d257-4e38-b128-7c6d02aef4db")
public class HwPLD_Link {
    @objid ("b733f52a-06a7-497e-a866-99e6beea4afa")
    protected Link element;

    @objid ("fc90bf8f-5622-497a-a046-dce6803bf6f7")
    public HwPLD_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPLD_LINK);
        this.element.setName(MARTEResourceManager.getName("HwPLD_Link"));
    }

    @objid ("ce8e9fd0-80d6-4a8f-8d80-9491c290e32b")
    public HwPLD_Link(Link element) {
        this.element = element;
    }

    @objid ("0f7080fd-7498-4a5b-a679-0f2a270c46de")
    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    @objid ("33b9fdd4-68cf-418e-bd63-66c65ed41c15")
    public Link getElement() {
        return this.element;
    }

    @objid ("c4e6eca3-4cdc-42ca-89e2-331dc1a2d57a")
    public String gettechnology() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY, this.element);
    }

    @objid ("12b5af5a-2102-416b-b798-234646e3674f")
    public void settechnology(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_TECHNOLOGY, value);
    }

    @objid ("316d4a14-3674-48bb-ae59-acf8649efc8c")
    public String getorganization() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION, this.element);
    }

    @objid ("26616f2a-958c-4234-897b-07abcbbf7d4f")
    public void setorganization(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_ORGANIZATION, value);
    }

    @objid ("e856ad5e-3b43-4025-987e-e52e1e9260d1")
    public String getnbLUTs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS, this.element);
    }

    @objid ("9f31c323-7874-4762-8855-5387a8d5c359")
    public void setnbLUTs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBLUTS, value);
    }

    @objid ("2d12bf1f-1716-4a79-b37f-0cc31bdc86a6")
    public String getndLUT_Inputs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS, this.element);
    }

    @objid ("92f103b7-2146-4f60-9f2e-9856990b18a9")
    public void setndLUT_Inputs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NDLUT_INPUTS, value);
    }

    @objid ("20c5ec72-67e6-4043-9f7c-455c7eda72b6")
    public String getnbFlipFlops() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS, this.element);
    }

    @objid ("389de740-497b-41ee-ac62-5dbd3375aa7b")
    public void setnbFlipFlops(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_NBFLIPFLOPS, value);
    }

    @objid ("53574114-ff38-4c0d-9cac-002d786cb20a")
    public String getblocksRAM() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSRAM, this.element);
    }

    @objid ("14c882a9-35a6-4f3e-94a6-e925f74f3622")
    public void setblocksRAM(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSRAM, value);
    }

    @objid ("b0027e01-6465-4158-b719-b8b3bd41605f")
    public String getblocksComputing() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSCOMPUTING, this.element);
    }

    @objid ("75f4e976-3c5b-41fc-9ca9-472fabcff40c")
    public void setblocksComputing(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPLD_LINK_HWPLD_LINK_BLOCKSCOMPUTING, value);
    }

}
