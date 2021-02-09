package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwProcessor_Association {
    protected Association element;

    public HwProcessor_Association() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createAssociation();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_ASSOCIATION);
        this.element.setName(MARTEResourceManager.getName("HwProcessor_Association"));
    }

    public HwProcessor_Association(Association element) {
        this.element = element;
    }

    public void setParent(AssociationEnd source, AssociationEnd destination) {
        this.element.getEnd().add(source);
        this.element.getEnd().add(destination);
    }

    public Association getElement() {
        return this.element;
    }

    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE, this.element);
    }

    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_ARCHITECTURE, value);
    }

    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS, this.element);
    }

    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_MIPS, value);
    }

    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC, this.element);
    }

    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_IPC, value);
    }

    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES, this.element);
    }

    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBCORES, value);
    }

    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES, this.element);
    }

    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBPIPELINES, value);
    }

    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES, this.element);
    }

    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBSTAGES, value);
    }

    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS, this.element);
    }

    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBALUS, value);
    }

    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS, this.element);
    }

    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_NBFPUS, value);
    }

    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDISAS, this.element);
    }

    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDISAS, value);
    }

    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_PREDICTORS, this.element);
    }

    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_PREDICTORS, value);
    }

    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_CACHES, this.element);
    }

    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_CACHES, value);
    }

    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDMMUS, this.element);
    }

    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_ASSOCIATION_HWPROCESSOR_ASSOCIATION_OWNEDMMUS, value);
    }

}
