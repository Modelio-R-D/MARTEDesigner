package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwProcessor_AssociationEnd extends HwComputingResource_AssociationEnd {
    public HwProcessor_AssociationEnd() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociationEnd());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATIONEND);
                this.element.setName(MARTEResourceManager.getName("HwProcessor_AssociationEnd"));
    }

    public HwProcessor_AssociationEnd(AssociationEnd element) {
        super(element);
    }

    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE, this.element);
    }

    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_ARCHITECTURE, value);
    }

    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS, this.element);
    }

    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_MIPS, value);
    }

    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC, this.element);
    }

    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_IPC, value);
    }

    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES, this.element);
    }

    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBCORES, value);
    }

    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES, this.element);
    }

    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBPIPELINES, value);
    }

    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES, this.element);
    }

    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBSTAGES, value);
    }

    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS, this.element);
    }

    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBALUS, value);
    }

    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS, this.element);
    }

    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_NBFPUS, value);
    }

    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS, this.element);
    }

    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDISAS, value);
    }

    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_PREDICTORS, this.element);
    }

    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_PREDICTORS, value);
    }

    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_CACHES, this.element);
    }

    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_CACHES, value);
    }

    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS, this.element);
    }

    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATIONEND_HWPROCESSOR_ASSOCIATIONEND_OWNEDMMUS, value);
    }

}
