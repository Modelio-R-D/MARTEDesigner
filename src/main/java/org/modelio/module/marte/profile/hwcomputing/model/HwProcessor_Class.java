package org.modelio.module.marte.profile.hwcomputing.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.module.marte.profile.utils.MARTEResourceManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("d92b29bd-87f1-401a-885d-7929e30907df")
public class HwProcessor_Class extends HwComputingResource_Class {
    @objid ("42748d0d-a879-4be9-97a0-7b6f6bde5204")
    public HwProcessor_Class() {
        super(MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createClass());
                ModelUtils.setStereotype(this.element,MARTEDesignerStereotypes.HWPROCESSOR_CLASSIFIER);
                this.element.setName(MARTEResourceManager.getName(MARTEDesignerStereotypes.HWPROCESSOR_CLASSIFIER));
    }

    @objid ("dfead36b-358e-41f4-94b9-5741777b8ee9")
    public HwProcessor_Class(Class element) {
        super(element);
    }

    @objid ("bf236e4f-63ca-4cfe-a72b-5fa2aee7a982")
    public String getarchitecture() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE, this.element);
    }

    @objid ("ac3aa07e-8b54-4cc1-b195-f8cfffaa74d5")
    public void setarchitecture(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_ARCHITECTURE, value);
    }

    @objid ("955a4cdf-7cf5-47c8-a671-0a161deb1e8e")
    public String getmips() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS, this.element);
    }

    @objid ("2dbd136b-281e-4150-850a-d60c745bc8a6")
    public void setmips(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_MIPS, value);
    }

    @objid ("795f943f-bb85-48e7-925d-5845098d2df6")
    public String getipc() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC, this.element);
    }

    @objid ("85c94011-2462-41df-ae80-69dfb328986a")
    public void setipc(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_IPC, value);
    }

    @objid ("301651dd-121f-4388-84c4-9756d27b42df")
    public String getnbCores() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES, this.element);
    }

    @objid ("cf5411cc-ebaa-49a4-afbe-b44717f781ac")
    public void setnbCores(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBCORES, value);
    }

    @objid ("e06890de-44e0-49d6-a565-605bbe289bf5")
    public String getnbPipelines() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES, this.element);
    }

    @objid ("6c308b0a-6247-4326-bec6-8d463b88120f")
    public void setnbPipelines(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBPIPELINES, value);
    }

    @objid ("43f291b6-6594-453a-b3c5-c7ac7909262f")
    public String getnbStages() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES, this.element);
    }

    @objid ("e1dd609b-3bcb-4ff2-97e9-30dc10d304be")
    public void setnbStages(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBSTAGES, value);
    }

    @objid ("9a211923-6819-404d-bb81-39c4820a6b0d")
    public String getnbALUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS, this.element);
    }

    @objid ("5e69d1e8-4739-46ff-bbc9-e5ce8d90790e")
    public void setnbALUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBALUS, value);
    }

    @objid ("1f594b5f-462a-4d96-ae64-3494eafa5fec")
    public String getnbFPUs() {
        return ModelUtils.getTaggedValue(MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS, this.element);
    }

    @objid ("c209725a-6a6b-431f-a645-6f99ba9671d3")
    public void setnbFPUs(String value) {
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.HWPROCESSOR_CLASSIFIER_HWPROCESSOR_CLASSIFIER_NBFPUS, value);
    }

}
