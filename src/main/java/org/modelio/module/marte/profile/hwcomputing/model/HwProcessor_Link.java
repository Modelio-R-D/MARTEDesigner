package org.modelio.module.marte.profile.hwcomputing.model;

import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class HwProcessor_Link {
    protected Link element;

    public HwProcessor_Link() {
        this.element = MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createLink();
        ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_LINK);
        this.element.setName(MARTEResourceManager.getName("HwProcessor_Link"));
    }

    public HwProcessor_Link(Link element) {
        this.element = element;
    }

    public void setParent(TemplateParameter source, Association destination) {
        this.element.setOwnerTemplateParameter(source);
        this.element.setModel(destination);
    }

    public Link getElement() {
        return this.element;
    }

    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_ARCHITECTURE, this.element);
    }

    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_ARCHITECTURE, value);
    }

    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_MIPS, this.element);
    }

    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_MIPS, value);
    }

    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_IPC, this.element);
    }

    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_IPC, value);
    }

    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBCORES, this.element);
    }

    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBCORES, value);
    }

    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBPIPELINES, this.element);
    }

    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBPIPELINES, value);
    }

    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBSTAGES, this.element);
    }

    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBSTAGES, value);
    }

    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBALUS, this.element);
    }

    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBALUS, value);
    }

    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBFPUS, this.element);
    }

    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_NBFPUS, value);
    }

    public String getownedISAs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDISAS, this.element);
    }

    public void setownedISAs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDISAS, value);
    }

    public String getpredictors() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_PREDICTORS, this.element);
    }

    public void setpredictors(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_PREDICTORS, value);
    }

    public String getcaches() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_CACHES, this.element);
    }

    public void setcaches(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_CACHES, value);
    }

    public String getownedMMUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDMMUS, this.element);
    }

    public void setownedMMUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_LINK_HWPROCESSOR_LINK_OWNEDMMUS, value);
    }

}
