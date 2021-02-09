package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwProcessor_Attribute extends HwComputingResource_Attribute {
    public HwProcessor_Attribute() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAttribute());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_ATTRIBUTE);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_Attribute"));
    }

    public HwProcessor_Attribute(Attribute element) {
        super(element);
    }

    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE, this.element);
    }

    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_ARCHITECTURE, value);
    }

    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS, this.element);
    }

    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_MIPS, value);
    }

    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC, this.element);
    }

    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_IPC, value);
    }

    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES, this.element);
    }

    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBCORES, value);
    }

    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES, this.element);
    }

    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBPIPELINES, value);
    }

    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES, this.element);
    }

    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBSTAGES, value);
    }

    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS, this.element);
    }

    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBALUS, value);
    }

    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS, this.element);
    }

    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_NBFPUS, value);
    }

    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDISAS, this.element);
    }

    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDISAS, value);
    }

    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_PREDICTORS, this.element);
    }

    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_PREDICTORS, value);
    }

    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_CACHES, this.element);
    }

    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_CACHES, value);
    }

    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDMMUS, this.element);
    }

    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ATTRIBUTE_HWPROCESSOR_ATTRIBUTE_OWNEDMMUS, value);
    }

}
